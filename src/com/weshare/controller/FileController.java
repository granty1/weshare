package com.weshare.controller;

import com.weshare.pojo.*;
import com.weshare.service.*;
import com.weshare.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * 文件控制器
* <p>Title: FileController</p>
* <p>Description: </p>
* <p>Project: WeShare</p>
* @author 印国林
* @date 2018年3月8日下午10:02:05
 */
@Controller
@RequestMapping("/file")
public class FileController {

	@Autowired
	private FileService fileService;

	@Autowired
	private UserService userService;

	@Autowired
	private CollectService collectService;
	
	@Autowired
	private FocusService focusService;
	
	@Autowired
	private PrivateLetterService privateLetterService;
	
	@Autowired
	private ArticleService articleService;
	
	@Autowired
	private WebCountService webCountService;

	@RequestMapping("/upload")
	@ResponseBody
	public WeShareResult uploadFile(MultipartFile file, HttpServletRequest request, WsFile wsFile) {
		WsUser user = (WsUser) request.getSession().getAttribute("user");
		String username = user.getUsername();
		ServletContext servletContext = request.getSession().getServletContext();
		String realPath = FileUtils.creatUserFile(user.getuId());// servletContext.getRealPath("/file");
		WeShareResult uploadFileResult = fileService.uploadFile(file, username, wsFile, realPath);
		return uploadFileResult;
	}

	/**
	 * 主页下载
	 * 
	 * @param response
	 * @param request
	 * @return
	 */
	@RequestMapping("/homedownload")
	public String homeDownloadFile(HttpServletResponse response, HttpServletRequest request) {
		String fileName = request.getParameter("fileName");
		WsFile file = fileService.getFileByFileName(fileName);
		String filePath = file.getfPath();
		try {
			File aFile = new File(filePath);

			if (!aFile.exists()) {
				System.out.println("文件不存在");
			}
			// 设置响应头，控制浏览器下载该文件
			response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
			FileInputStream in = new FileInputStream(filePath);
			OutputStream out = response.getOutputStream();
			byte buffer[] = new byte[1024];
			int len = 0;
			// 循环将输入流中的内容读取到缓冲区当中
			while ((len = in.read(buffer)) > 0) {
				// 输出缓冲区的内容到浏览器，实现文件下载
				out.write(buffer, 0, len);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		WsUser user = (WsUser) request.getSession().getAttribute("user");
		Long userId = user.getuId();
		if (userId == null) {
			return "error";
		}
		List<WsFile> fileListByUserId = fileService.selectByUserId(userId);

		request.getSession().setAttribute("fileListByUserId", fileListByUserId);
		String haveNewLetter = privateLetterService.isHaveNewLetter(userId);
		request.getSession().setAttribute("haveNewLetter", haveNewLetter);

		return "homepage";

	}

	/**
	 * 删除个人资源
	 * @param request
	 * @return
	 */
	@RequestMapping("/del")
	public String deleteFileByFileName(HttpServletRequest request) {
		String fileId = request.getParameter("fileId");
		long fId = Integer.parseInt(fileId, 10);
		/*WsFile fileByFileName = fileService.getFileByFileName(fileName);
		Long fileId = fileByFileName.getfId();*/
		//删除所有有关该资源的收藏记录
		collectService.deleteCollect(fId);
		//删除文件资源表中该资源的记录
		fileService.deleteFileByFid(fId);

		WsUser user = (WsUser) request.getSession().getAttribute("user");
		Long userId = user.getuId();
		if (userId == null) {
			return "error";
		}
		List<WsFile> fileListByUserId = fileService.selectByUserId(userId);
		int fileNumByUserId = 0;
		for (WsFile wsFile : fileListByUserId) {
			fileNumByUserId++;
		}
		request.getSession().setAttribute("fileListByUserId", fileListByUserId);
		request.getSession().setAttribute("fileNumByUserId", fileNumByUserId);
		String haveNewLetter = privateLetterService.isHaveNewLetter(userId);
		request.getSession().setAttribute("haveNewLetter", haveNewLetter);

		return "homepage";
	}

	/**
	 * 加载个人主页
	 * @param request
	 * @return
	 */
	@RequestMapping("/itempage")
	public String selectByUserId(HttpServletRequest request,Model model) {
		String nowtime = TimeUtils.getNowTime();
		// 浏览次数
		if (request.getSession().getAttribute("local") == null || (!request.getSession().getAttribute("local").equals(request.getRemoteAddr()))) {
			
			if(webCountService.findWebcountByDay(nowtime)==null){
				//说明这是今天的第一次访问,添加该记录
				webCountService.firstClicks(nowtime);
			}else{
				//说明这不是该日的第一次访问,表中次数++
				webCountService.addClicks(nowtime);
			}
			
			request.getSession().setAttribute("local", request.getRemoteAddr());
		}
		model.addAttribute("clicks", webCountService.getClicks(nowtime));
		WsUser user = (WsUser) request.getSession().getAttribute("user");
		Long userId = user.getuId();
		if (userId == null) {
			return "error";
		}
		List<WsFile> fileListByUserId = fileService.selectByUserId(userId);
		int fileNumByUserId = 0;
		for (WsFile wsFile : fileListByUserId) {
			fileNumByUserId++;
		}
		long focusNum = focusService.getFocusNum(userId);
		long beFocusNum = focusService.getbeFocusNum(userId);		
		long collectNum = collectService.getCollectNum(userId);
		long lettersNum = privateLetterService.getLettersNum(userId);
		long articleNumByUserId = articleService.findMyArticlesByUserIdCount(userId);
		String haveNewLetter = privateLetterService.isHaveNewLetter(userId);
		
		

		request.getSession().setAttribute("fileListByUserId", fileListByUserId);
		request.getSession().setAttribute("fileNumByUserId", fileNumByUserId);
		request.getSession().setAttribute("focusNum", focusNum);
		request.getSession().setAttribute("beFocusNum", beFocusNum);
		request.getSession().setAttribute("collectNum", collectNum);
		request.getSession().setAttribute("lettersNum", lettersNum);
		request.getSession().setAttribute("haveNewLetter", haveNewLetter);
		request.getSession().setAttribute("articleNumByUserId", articleNumByUserId);
		WsUser overAllUser = (WsUser) request.getSession().getAttribute("user");
		request.getSession().setAttribute("user", userService.getUserByUserId(overAllUser.getuId()));
		return "homepage";

	}



	/**
	 * 通过关键字查询资源项
	 * @param request
	 * @param keyWord
	 * @return
	 */
	@RequestMapping("/select/by/{keyWord}/{type}")
	@ResponseBody
	public WeShareResult getFileListByKeyWord(HttpServletRequest request, @PathVariable String keyWord,@PathVariable int type) {
		if(type == 0){
			//type为0， 说明模糊查询文件资源
			if (keyWord == null) {
				return WeShareResult.ok(true);
			}
			List<WsFile> fileListByKeyWord = fileService.getFileListByKeyWord(keyWord);
			List<WsFileDev> fileDevs = new ArrayList<>();
			if (fileListByKeyWord.size() > 0) {
				for (WsFile file : fileListByKeyWord) {
					WsFileDev fileDev = new WsFileDev();
					WsUser user = userService.getUserByUserId(file.getuId());
					FileUtils.copy(fileDev, file, user);
					fileDevs.add(fileDev);
				}
				request.getSession().setAttribute("worldFileList", fileDevs);
				return WeShareResult.ok(true);
			}
			return WeShareResult.ok(true);
		}else {
			//type为1,说明模糊查询作者
			if(keyWord == null){
				return WeShareResult.ok(true);
			}
			WsUser use = (WsUser) request.getSession().getAttribute("user");
			//获取所有用户
			List<WsUser> allUser = userService.getUserByKeyWord("%"+keyWord+"%");
			List<WsUserDev> allUserDev = new ArrayList<>();
			for (WsUser wsUser : allUser) {
				//创建userDev镀锡i昂
				WsUserDev userDev = new WsUserDev();
				//遍历所有用户，将用户对象数据封装到WsUserDev中
				UserUtils.copy(wsUser, userDev);
				//再补充一个是否关注属性
				userDev.setuFocus(focusService.isFocus(use.getuId(), wsUser.getuId()));
				allUserDev.add(userDev);
			}
			request.getSession().setAttribute("worldUserList", allUserDev);
			WsUser overAllUser = (WsUser) request.getSession().getAttribute("user");
			request.getSession().setAttribute("user", userService.getUserByUserId(overAllUser.getuId()));
			
			return WeShareResult.ok(true);
		}
	}

	/**
	 * 查询所有资源
	 * @param request
	 * @return
	 */
	@RequestMapping("/select/all")
	public String getWorldFileList(HttpServletRequest request) {
		/**
		 * 由于页面需要的不仅有文件资源的详细信息，还包含文件的作者,头像，是否被收藏 所以需要根据文件的uid查出作者对象，再得到作者的名字和头像号
		 * 然后将作者名+文件对象封装到文件对象的增强类WsFileDev中去 并且，需要将top3热搜与所有资源分开放置在两个不同的list中
		 * 最后都放在request域中返回页面
		 */
		// 获取所有总资源
		//第一次进入世界页面，定义当前页码数
		long page = 0;
		request.getSession().setAttribute("page", page);
		List<WsFile> allFile = fileService.getAllFileByPage(page);
		List<WsFileDev> worldFileList = new ArrayList<>();
		WsUser use = (WsUser) request.getSession().getAttribute("user");
		for (WsFile file : allFile) {
			WsFileDev fileDev = new WsFileDev();
			WsUser user = userService.getUserByUserId(file.getuId());
			FileUtils.copy(fileDev, file, user);
			Long fileId = file.getfId();
			Long userId = user.getuId();
			fileDev.setuCollect(collectService.isCollect(use.getuId(), fileId));
			worldFileList.add(fileDev);
		}
		request.getSession().setAttribute("worldFileList", worldFileList);
		// 获取最热文件资源
		List<WsFile> top3File = fileService.getTop3File();
		List<WsFileDev> top3WorldFileList = new ArrayList<>();
		for (WsFile file : top3File) {
			WsFileDev fileDev = new WsFileDev();
			WsUser user = userService.getUserByUserId(file.getuId());
			FileUtils.copy(fileDev, file, user);
			Long fileId = file.getfId();
			Long userId = user.getuId();
			fileDev.setuCollect(collectService.isCollect(use.getuId(), fileId));
			top3WorldFileList.add(fileDev);
		}
		request.getSession().setAttribute("top3WorldFileList", top3WorldFileList);
		
		//获取所有用户
		List<WsUser> allUser = userService.getAllUser();
		List<WsUserDev> allUserDev = new ArrayList<>();
		for (WsUser wsUser : allUser) {
			//创建userDev对象
			WsUserDev userDev = new WsUserDev();
			//遍历所有用户，将用户对象数据封装到WsUserDev中
			UserUtils.copy(wsUser, userDev);
			//再补充一个是否关注属性
			userDev.setuFocus(focusService.isFocus(use.getuId(), wsUser.getuId()));
			allUserDev.add(userDev);
		}
		request.getSession().setAttribute("worldUserList", allUserDev);
		WsUser overAllUser = (WsUser) request.getSession().getAttribute("user");
		request.getSession().setAttribute("user", userService.getUserByUserId(overAllUser.getuId()));
		
		//装填top8用户信息
		List<WsUser> top8User = userService.getTop8User();
		request.getSession().setAttribute("top8User", top8User);
		String haveNewLetter = privateLetterService.isHaveNewLetter(overAllUser.getuId());
		request.getSession().setAttribute("haveNewLetter", haveNewLetter);
		return "worldpage";
	}
	
	
	
	/**
	 * 分页换一批
	 * @param request
	 * @return
	 */
	@RequestMapping("/select/bypage")
	@ResponseBody
	public WeShareResult getWorldFileListByPage(HttpServletRequest request){
		//拿到当前页数
		long page = (long) request.getSession().getAttribute("page");
		//去数据库查询，总共多少页
		List<WsFile> allFile = fileService.getAllFile();
		int i = 0;
		for (WsFile wsFile : allFile) {
			i++;
		}
		//算出总共页数
		int allPage = i / 10 + 1;
		//通过工具类生成新页数
		long newPage = PageUtils.getPage(allPage, page);
		//把新页数先更新到域对象中去
		request.getSession().setAttribute("page", newPage);
		//根据页数获取到相应的文件资源对象集合
		List<WsFile> allFileByPage = fileService.getAllFileByPage(newPage);
		List<WsFileDev> worldFileList = new ArrayList<>();
		WsUser use = (WsUser) request.getSession().getAttribute("user");
		for (WsFile file : allFile) {
			WsFileDev fileDev = new WsFileDev();
			WsUser user = userService.getUserByUserId(file.getuId());
			FileUtils.copy(fileDev, file, user);
			Long fileId = file.getfId();
			Long userId = user.getuId();
			fileDev.setuCollect(collectService.isCollect(use.getuId(), fileId));
			worldFileList.add(fileDev);
		}
		//将该文件对象集合更新到域对象中去
		request.getSession().setAttribute("worldFileList", worldFileList);
		//所有操作完成给前台返回成功信息
		return WeShareResult.ok(true);
	}

	/**
	 * 根据空字符串查询
	 * @param request
	 * @return
	 */
	@RequestMapping("/select/byNull/{type}")
	@ResponseBody
	public WeShareResult getWorldFileListByNull(HttpServletRequest request,@PathVariable int type) {

		if (type == 0) {
			// 为获取所有文件资源
			// 获取所有总资源
			List<WsFile> allFile = fileService.getAllFile();
			List<WsFileDev> worldFileList = new ArrayList<>();
			for (WsFile file : allFile) {
				WsFileDev fileDev = new WsFileDev();
				WsUser user = userService.getUserByUserId(file.getuId());
				FileUtils.copy(fileDev, file, user);
				worldFileList.add(fileDev);
			}
			request.getSession().setAttribute("worldFileList", worldFileList);
			return WeShareResult.ok(true);
		} else {
			//获取所有用户
			List<WsUser> allUser = userService.getAllUser();
			List<WsUserDev> allUserDev = new ArrayList<>();
			for (WsUser wsUser : allUser) {
				WsUser use = (WsUser) request.getSession().getAttribute("user");
				//创建userDev对象
				WsUserDev userDev = new WsUserDev();
				//遍历所有用户，将用户对象数据封装到WsUserDev中
				UserUtils.copy(wsUser, userDev);
				//再补充一个是否关注属性
				userDev.setuFocus(focusService.isFocus(use.getuId(), wsUser.getuId()));
				allUserDev.add(userDev);
			}
			request.getSession().setAttribute("worldUserList", allUserDev);
			WsUser overAllUser = (WsUser) request.getSession().getAttribute("user");
			request.getSession().setAttribute("user", userService.getUserByUserId(overAllUser.getuId()));
			return WeShareResult.ok(true);
		}

	}
	
	/**
	 * 下载积分校验
	 * @param request
	 * @return
	 */
	@RequestMapping("/checkintegral")
	@ResponseBody
	public WeShareResult checkIntegral(HttpServletRequest request){
		String fId = request.getParameter("fileId");
		//将字符串文件id转化为long型
		long fileId = Integer.parseInt(fId, 10);
		//拿到要下载的文件对象
		WsFile file = fileService.getFileByPrimaryKey(fileId);
		//拿到文件下载所需要的积分
		Integer needIntegral = file.getfIntegral();
		WsUser user = (WsUser) request.getSession().getAttribute("user");
		Integer userintegral = user.getuIntegral();
		if(userintegral >= needIntegral){
			return WeShareResult.ok(true);
		}else{
			return WeShareResult.build(400,"您当前积分余额不足！");
		}
		
	}

	/**
	 * 世界下载（加积分，下载次数逻辑）
	 * @param response
	 * @param request
	 */
	@RequestMapping("/worlddownload")
	public void worldDownloadFile(HttpServletResponse response, HttpServletRequest request) {
		// 拿到文件名字
		String fileName = request.getParameter("fileName");
		/*//将字符串文件id转化为long型
		long fileId = Integer.parseInt(fIds, 10);*/
		// 根据文件名拿到文件对象
		WsFile fileByFileName = fileService.getFileByFileName(fileName);
		/*//拿到文件名
		String fileName = fileByFileName.getfName();*/
		// 从文件对象中拿到文件下载所需积分
		Integer integer = fileByFileName.getfIntegral();
		// 拿到作者名字
		String author = request.getParameter("fAuthor");
		// 根据作者名字拿到作者对象
		WsUser fileAuthor = userService.getUserByUsername(author);
		// 拿到下载者对象
		WsUser user = (WsUser) request.getSession().getAttribute("user");
		// 拿到下载者名字
		String username = user.getUsername();
		// 判断下载者与作者名字是否相同
		if (!username.equals(author)) {
			// 用户积分 - 下载所需积分
			//拿到用户当前积分
			Integer getuIntegral = user.getuIntegral();
/*			//
			if(getuIntegral<integer){
				return "error!";
			}*/
			Integer s = getuIntegral - integer;
			if (s < 0) {
				s = user.getuIntegral();
			}
			user.setuIntegral(s);
			// 再将用户信息更新到数据库
			userService.upDateUser(user);
			// 作者积分 + 下载所需积分
			fileAuthor.setuIntegral(fileAuthor.getuIntegral() + integer);
			// 再将作者信息更新到数据库
			userService.upDateUser(fileAuthor);
			// 将文件对象中的下载次数属性+1
			fileByFileName.setfDownnum(fileByFileName.getfDownnum() + 1);
		}
		// 将文件对象信息更新到数据库中去
		fileService.upDateFile(fileByFileName);
		// 执行下载
		String filePath = fileByFileName.getfPath();
		try {
			File aFile = new File(filePath);

			if (!aFile.exists()) {
				System.out.println("文件不存在");
			}
			// 设置响应头，控制浏览器下载该文件
			response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
			FileInputStream in = new FileInputStream(filePath);
			OutputStream out = response.getOutputStream();
			byte buffer[] = new byte[1024];
			int len = 0;
			// 循环将输入流中的内容读取到缓冲区当中
			while ((len = in.read(buffer)) > 0) {
				// 输出缓冲区的内容到浏览器，实现文件下载
				out.write(buffer, 0, len);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		WsUser overAllUser = (WsUser) request.getSession().getAttribute("user");
		request.getSession().setAttribute("user", userService.getUserByUserId(overAllUser.getuId()));
	}
	
	/**
	 * 访问他人主页
	 * @param request
	 * @return
	 */
	@RequestMapping("/otherFile")
	public String otherHomePage(HttpServletRequest request) {
		//拿到用户对象
		WsUser user = (WsUser) request.getSession().getAttribute("user");
		Long userId = user.getuId();
		//拿到用户名字
		String username = user.getUsername();
		// 拿到作者的名字
		String authorName = request.getParameter("author");
		//判断作者名字是否与用户名字一致，如果一致，直接跳个人主页
		if(username.equals(authorName)){
			return "homepage";
		}
		// 根据作者的名字拿到作者对象
		WsUser author = userService.getUserByUsername(authorName);
		Long authorId = author.getuId();
		// 向页面返回的是一个user增强类,需补全其属性
		WsUserDev authorDev = new WsUserDev();
		/**
		 * 是否被当前用户关注 
		 * private String uFocus;
		 * 被关注数
		 * private long beFocusNum;
		 * 关注数 
		 * private long focusNum; 
		 * //用户的资源数
	     * private long filesNum;
		 * 他们主页资源集合
		 * private List<WsFileDev> otherFileList;
		 */
		//根据用户id和作者id，查询是否被关注,并将结果填到userDev对象中去		
		authorDev.setuFocus(focusService.isFocus(userId, authorId));
		//根据authorId查询，该作者被多少人关注并将结果填到userDev对象中去
		authorDev.setBeFocusNum(focusService.getbeFocusNum(authorId));
		//根据authorId查询，该作者关注了多少人并将结果填到userDev对象中去
		authorDev.setFocusNum(focusService.getFocusNum(authorId));
		//设置该作者的动态数量
		authorDev.setArticlesNum(articleService.findOtherArticleCount(authorId));
		/**
		 * 补全该作者的资源集合属性(otherFileList),
		 * 该list中放的应该是WsFileDev对象而不是WsFile对象，
		 * 所以先得将WsFileDev对象的信息补全
		 */
		//根据作者id拿到作者下面的资源WsFile对象
		List<WsFile> wsFiles = fileService.selectByUserId(authorId);
		//循环遍历，查看资源总数量
		long filesNum = 0;
		for (WsFile wsFile : wsFiles) {
			filesNum++;
		}
		//将资源总数填充到authorDev属性中去
		authorDev.setFilesNum(filesNum);
		//创建所需要的WsFileDev集合对象
		List<WsFileDev> wsFileDevs = new ArrayList<>();
		//遍历wsFiles，将wsFile属性填充到wsFileDev对象中去，再补全wsFileDev中属性
		for (WsFile file : wsFiles) {
			WsFileDev fileDev = new WsFileDev();
			WsUser user1 = userService.getUserByUserId(file.getuId());
			FileUtils.copy(fileDev, file, user1);
			Long fileId = file.getfId();
			fileDev.setuCollect(collectService.isCollect(user.getuId(), fileId));
			wsFileDevs.add(fileDev);
		}
		//完成wsFileDevs集合内的数据，将其赋值到userDev对象的otherFileList属性中去
		authorDev.setOtherFileList(wsFileDevs);
		//WsUser增强的属性已经封装完成，剩下的将WsUser中的原有属性，封装到WsFileDev中去
		UserUtils.copy(author, authorDev);
		//整个authorDev对象封装完成。将其存到域对象中去
		request.getSession().setAttribute("authorDev", authorDev);
		WsUser overAllUser = (WsUser) request.getSession().getAttribute("user");
		request.getSession().setAttribute("user", userService.getUserByUserId(overAllUser.getuId()));
		String haveNewLetter = privateLetterService.isHaveNewLetter(userId);
		request.getSession().setAttribute("haveNewLetter", haveNewLetter);
		//转到作者主页页面
		return "otherpage";
	}
	
	@RequestMapping("/filemanager")
	@ResponseBody
	public PageResult filemanagerList(int page,int size,@RequestBody WsFileCustom fileCustom){
		PageResult findFileManagerList = fileService.findFileManagerList(page,size,fileCustom);
		return findFileManagerList;
	}
	@RequestMapping("/delfilemanager")
	@ResponseBody
	public WeShareResult delfilebymanager(Long fId){
		fileService.deleteFileByFid(fId);
		return WeShareResult.ok();
	}
	@RequestMapping("/filepasslist")
	@ResponseBody
	public PageResult findPassList(int page,int size,@RequestBody WsFileCustom fileCustom ){
		return fileService.findFilePassList(page, size, fileCustom);
	}
	@RequestMapping("/passfile")
	@ResponseBody
	public WeShareResult PassFile(Long fId){		
		return fileService.passFile(fId);
	}

}
