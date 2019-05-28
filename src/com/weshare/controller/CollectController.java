package com.weshare.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.weshare.pojo.WsFile;
import com.weshare.pojo.WsFileDev;
import com.weshare.pojo.WsUser;
import com.weshare.service.CollectService;
import com.weshare.service.FileService;
/**
 * 收藏功能管理类
* <p>Title: CollectController</p>
* <p>Description: </p>
* <p>Project: WeShare</p>
* @author 印国林
* @date 2018年3月16日下午9:30:38
 */
import com.weshare.utils.WeShareResult;
@Controller
@RequestMapping("/collect")
public class CollectController {
	
	@Autowired
	private CollectService collectService;
	
	@Autowired
	private FileService FileService;
	
	
	
	/**
	 * 添加收藏
	 * @param request
	 * @return
	 */
	@RequestMapping("/add")
	@ResponseBody
	public WeShareResult addCollect(HttpServletRequest request/*,@PathVariable String fileName*/){
		//拿到用户的信息
		WsUser user = (WsUser) request.getSession().getAttribute("user");
		//拿到作者id
		Long userId = user.getuId();
		//拿到文件的名字
		String fileName = request.getParameter("fileName");
		//根据文件名拿到文件对象
		WsFile fileByFileName = FileService.getFileByFileName(fileName);
		//拿到文件id
		Long fileId = fileByFileName.getfId();
		collectService.addCollect(userId, fileId);		
		return WeShareResult.ok(true);
	}
	
	
	/**
	 * 取消收藏
	 * @param request
	 * @return
	 */
	@RequestMapping("/delcollect")
	public String deleteCollect(HttpServletRequest request) {
		// 拿到用户的信息
		WsUser user = (WsUser) request.getSession().getAttribute("user");
		// 拿到作者id
		Long userId = user.getuId();
		// 拿到文件的名字
		String fileName = request.getParameter("fileName");
		// 根据文件名拿到文件对象
		WsFile fileByFileName = FileService.getFileByFileName(fileName);
		// 拿到文件id
		Long fileId = fileByFileName.getfId();
		//根据文件id和用户id删除掉收藏关系
		collectService.deleteCollect(userId, fileId);
		long collectNum = collectService.getCollectNum(userId);
		request.getSession().setAttribute("collectNum", collectNum);
		List<WsFileDev> myCollect = collectService.getMyCollect(userId);
		request.getSession().setAttribute("myCollect", myCollect);
		return "mycollect";
	}
	
	@RequestMapping("/mycollect")
	public String getMyCollect(HttpServletRequest request){
		WsUser user = (WsUser) request.getSession().getAttribute("user");
		List<WsFileDev> myCollect = collectService.getMyCollect(user.getuId());
		request.getSession().setAttribute("myCollect", myCollect);
		return "mycollect";
	}
	

}
