package com.weshare.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.weshare.pojo.WsPriletter;
import com.weshare.pojo.WsPrilettershow;
import com.weshare.pojo.WsUser;
import com.weshare.service.PrivateLetterService;
import com.weshare.service.UserService;
import com.weshare.utils.PriLetterutils;
import com.weshare.utils.TimeUtils;
import com.weshare.utils.WeShareResult;

/**
 * 私信功能控制器
* <p>Title: PrivateLetterController</p>
* <p>Description: </p>
* <p>Project: WeShare</p>
* @author 印国林
* @date 2018年3月23日上午12:02:36
 */
@Controller
@RequestMapping("/priletter")
public class PrivateLetterController {
	
	@Autowired
	private PrivateLetterService privateLetterService;
	
	@Autowired
	private UserService userService;
	
	
	/**
	 * 发送私信
	 * @param request
	 * @param priletter
	 * @param reciId
	 * @return
	 */
	@RequestMapping("/sendpriletter/{reciId}")
	@ResponseBody
	public WeShareResult sendPriLetter(HttpServletRequest request ,WsPriletter priletter,@PathVariable long reciId){
		//拿到发件人对象
		WsUser user = (WsUser) request.getSession().getAttribute("user");
		//参数中拿到收件人id
		//填充priletter对象中的信息
		priletter.setpAddre(user.getuId());
		priletter.setpReci(reciId);
		priletter.setpCreat(TimeUtils.getPriLetterTime());
		//设置状态码 1：未读 2：已读
		priletter.setpStatus("1");
		//设置私信类型 1：用户私信  2：管理员消息
		priletter.setpType("1");
		//填充完prileter对象中的信息后持久化该记录
		return privateLetterService.sendPrivateLetter(priletter);
	}
	
	/**
	 * 查看我的私信
	 * @param request
	 * @return
	 */
	@RequestMapping("/selectpriletter")
	public String selectMyPriLetter(HttpServletRequest request){
		//拿到当前用户对象
		WsUser user = (WsUser) request.getSession().getAttribute("user");
		//根据用户id拿到我的私信对象的集合
		List<WsPriletter> selectMyLetters = privateLetterService.selectMyLetters(user.getuId());
		//拿到了私信对象集合，但是要展示到页面中的是WsPriLettershow对象
		List<WsPrilettershow> myPriLetters = new ArrayList<>();
		//遍历selectMyLetters集合
		for (WsPriletter wsPriletter : selectMyLetters) {
			WsPrilettershow show  = new WsPrilettershow();
			//拿到该文件的发件人对象
			WsUser author = userService.getUserByUserId(wsPriletter.getpAddre());
			PriLetterutils.finishShow(wsPriletter, show, author);
			//封装完展示对象后，将其放到集合中去
			myPriLetters.add(show);
		}
		//将集合放到域中去
		request.getSession().setAttribute("myPriLetters", myPriLetters);
		String haveNewLetter = privateLetterService.isHaveNewLetter(user.getuId());
		request.getSession().setAttribute("haveNewLetter", haveNewLetter);
		return "mypriletters";
	}
	
	
	/**
	 * 查看私信具体内容
	 * @return
	 */
	@RequestMapping("/selectpriletterdesc/{pId}")
	@ResponseBody
	public WsPrilettershow selectPriLettersDesc(HttpServletRequest request , @PathVariable long pId){
		WsPriletter wsPriletter = privateLetterService.selectByPId(pId);
		WsUser user = userService.getUserByUserId(wsPriletter.getpAddre());
		//根据私信id，拿到该条私信对象
		WsPriletter selectByPId = privateLetterService.selectByPId(pId);
		//将该私信对象中的状态码改为2：从未读状态--》已读
		selectByPId.setpStatus("2");
		//再将该对象更新到数据库中去
		privateLetterService.updatePriLstter(selectByPId);
		//此时，需要重新查一遍
		WsPriletter letterDesc = privateLetterService.selectByPId(pId);
		WsPrilettershow show  = new WsPrilettershow();
		PriLetterutils.finishShow(letterDesc, show, user);
		return show;
	}
	
	
	@RequestMapping("/delete")
	public String deletePriLetters(HttpServletRequest request ){
		WsUser user = (WsUser) request.getSession().getAttribute("user");
		String letterId = request.getParameter("letterId");
		//拿到私信id
		long pId = Integer.parseInt(letterId, 10);
		//根据私信id删除私信
		privateLetterService.deletePriLetters(pId);
		//删除完重新查一遍该用户下所有的私信
		List<WsPriletter> selectMyLetters = privateLetterService.selectMyLetters(user.getuId());
		List<WsPrilettershow> showLetters = new ArrayList<>();
		for (WsPriletter wsPriletter : selectMyLetters) {
			WsPrilettershow show  = new WsPrilettershow();
			//拿到该文件的发件人对象
			WsUser author = userService.getUserByUserId(wsPriletter.getpAddre());
			PriLetterutils.finishShow(wsPriletter, show, author);
			//封装完展示对象后，将其放到集合中去
			showLetters.add(show);
		}
		request.getSession().setAttribute("myPriLetters", showLetters);
		long lettersNum = privateLetterService.getLettersNum(user.getuId());
		request.getSession().setAttribute("lettersNum", lettersNum);
		String haveNewLetter = privateLetterService.isHaveNewLetter(user.getuId());
		request.getSession().setAttribute("haveNewLetter", haveNewLetter);
		return "mypriletters";
	}
	
	@RequestMapping("/answer/{authorName}")
	@ResponseBody
	public WeShareResult answerPriLetter(HttpServletRequest request,WsPriletter priletter ,@PathVariable String authorName){
		//拿到作者名字
		//拿到用户对象
		WsUser user = (WsUser) request.getSession().getAttribute("user");
		//根据作者名字拿到作者的id
		WsUser userByUsername = userService.getUserByUsername(authorName);
		Long authorId = userByUsername.getuId();
		Long userId = user.getuId();
		priletter.setpAddre(userId);
		priletter.setpReci(authorId);
		priletter.setpStatus("1");
		priletter.setpCreat(TimeUtils.getPriLetterTime());
		priletter.setpType("1");
		privateLetterService.sendPrivateLetter(priletter);
		return WeShareResult.ok(true);
	}
	
	
	

}
