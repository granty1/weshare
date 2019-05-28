package com.weshare.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.weshare.pojo.WsUser;
import com.weshare.pojo.WsUserDev;
import com.weshare.service.FileService;
import com.weshare.service.FocusService;
import com.weshare.service.UserService;
import com.weshare.utils.UserUtils;
import com.weshare.utils.WeShareResult;

/**
 * 关注功能管理器
* <p>Title: FocusController</p>
* <p>Description: </p>
* <p>Project: WeShare</p>
* @author 印国林
* @date 2018年3月14日下午12:54:49
 */
@Controller
@RequestMapping("/focus")
public class FocusController {
	
	@Autowired
	private FileService fileService;
	
	@Autowired
	private FocusService focusService;
	
	@Autowired
	private UserService userService;
	
	/**
	 * 添加关注（通过他人主页）
	 * @param request
	 * @return
	 */
	@RequestMapping("/addfocus")
	@ResponseBody
	public WeShareResult addFocus(HttpServletRequest request){
		//拿到用户（关注的人）
		WsUser user = (WsUser) request.getSession().getAttribute("user");
		//拿到用户的id
		Long focusId = user.getuId();
		//域对象中拿作者对象
		WsUserDev author = (WsUserDev) request.getSession().getAttribute("authorDev");
		//从作者对象中拿作者id
		Long beFocusId = author.getuId();
		//去数据库中查，该用户对作者是否已经有关注关系
		String focus = focusService.isFocus(focusId, beFocusId);
		if(focus.equals("focus")){
			//如果返回已经关注，说明此次请求是取消关注
			focusService.deleteFocus(focusId, beFocusId);
			return WeShareResult.ok(false);
		}else{
			focusService.addFocus(focusId, beFocusId);
			return WeShareResult.ok(true);
		}		
	}
	/**
	 * 添加关注（通过他人关注，粉丝，我的粉丝）
	 * @param request
	 * @return
	 */
	@RequestMapping("/addfocusByOther")
	@ResponseBody
	public WeShareResult addFocusByOther(HttpServletRequest request){
		//拿到用户（关注的人）
		WsUser user = (WsUser) request.getSession().getAttribute("user");
		//拿到用户的id
		Long focusId = user.getuId();
		//从参数中拿作者名字
		String authorName = request.getParameter("beFocusName");
		//根据作者名字拿到作者对象
		WsUser author = userService.getUserByUsername(authorName);
		//从作者对象中拿作者id
		Long beFocusId = author.getuId();
		//去数据库中查，该用户对作者是否已经有关注关系
		String focus = focusService.isFocus(focusId, beFocusId);
		if(focus.equals("focus")){
			//如果返回已经关注，说明此次请求是取消关注
			focusService.deleteFocus(focusId, beFocusId);
			return WeShareResult.ok(false);
		}else{
			focusService.addFocus(focusId, beFocusId);
			return WeShareResult.ok(true);
		}		
	}
	
	
	
	
	/**
	 * 他人的关注
	 * @param request
	 * @return
	 */
	@RequestMapping("/otherfocus")
	public String getOtherFocus(HttpServletRequest request){
		WsUser user = (WsUser) request.getSession().getAttribute("user");
		WsUserDev author = (WsUserDev) request.getSession().getAttribute("authorDev");
		Long userId = author.getuId();
		List<WsUser> otherFocus = focusService.getMyFocus(userId);
		List<WsUserDev> otherFocusDev = new ArrayList<>();
		for (WsUser wsUser : otherFocus) {
			String focus = focusService.isFocus(user.getuId(), wsUser.getuId());
			WsUserDev dev = new WsUserDev();
			UserUtils.copy(wsUser, dev);
			dev.setuFocus(focus);		
			otherFocusDev.add(dev);
		}
		request.getSession().setAttribute("otherFocus", otherFocusDev);
		
		return "otherfocus";
	}
	
	@RequestMapping("/otherfans")
	public String getOtherFans(HttpServletRequest request){
		WsUser user = (WsUser) request.getSession().getAttribute("user");
		WsUserDev author = (WsUserDev) request.getSession().getAttribute("authorDev");
		List<WsUser> otherFans = focusService.getMyFans(author.getuId());
		List<WsUserDev> otherFansDev = new ArrayList<>();
		for (WsUser wsUser : otherFans) {
			String focus = focusService.isFocus(user.getuId(), wsUser.getuId());
			WsUserDev dev = new WsUserDev();
			UserUtils.copy(wsUser, dev);
			dev.setuFocus(focus);		
			otherFansDev.add(dev);
		}
		request.getSession().setAttribute("otherFans", otherFansDev);
		
		return "otherfans";
	}
	
	/**
	 * 我的关注
	 * @param request
	 * @return
	 */
	@RequestMapping("/myfocus")
	public String getMyFocus(HttpServletRequest request){
		WsUser user = (WsUser) request.getSession().getAttribute("user");
		Long userId = user.getuId();
		List<WsUser> myFocus = focusService.getMyFocus(userId);
		request.getSession().setAttribute("myFocus", myFocus);
		
		return "myfocus";
	}
	
	/**
	 * 我的粉丝
	 * @param request
	 * @return
	 */
	@RequestMapping("/myfans")
	public String getMyFans(HttpServletRequest request){
		WsUser user = (WsUser) request.getSession().getAttribute("user");
		List<WsUser> myFans = focusService.getMyFans(user.getuId());
		List<WsUserDev> myFansDev = new ArrayList<>();
		for (WsUser wsUser : myFans) {
			String focus = focusService.isFocus(user.getuId(), wsUser.getuId());
			WsUserDev dev = new WsUserDev();
			UserUtils.copy(wsUser, dev);
			dev.setuFocus(focus);		
			myFansDev.add(dev);
		}
		request.getSession().setAttribute("myFans", myFansDev);
		
		return "myfans";
	}
/*	*//**
	 * 取消用户的关注功能
	 * @param request
	 * @return
	 *//*
	@RequestMapping("/delfocus")
	public String deleteFocus(HttpServletRequest request){
		WsUser user = (WsUser) request.getSession().getAttribute("user");
		Long focusId = user.getuId();
		String userName = request.getParameter("userName");
		WsUser userByUsername = userService.getUserByUsername(userName);
		Long beFocusId = userByUsername.getuId();
		focusService.deleteFocus(beFocusId);
		return "我的关注页面";
	}*/

}
