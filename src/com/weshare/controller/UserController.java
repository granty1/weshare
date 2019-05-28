package com.weshare.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.weshare.pojo.PageResult;
import com.weshare.pojo.WsUser;
import com.weshare.pojo.WsUserCustom;
import com.weshare.pojo.WsUserDesc;
import com.weshare.service.FileService;
import com.weshare.service.UserDescService;
import com.weshare.service.UserService;
import com.weshare.service.WebCountService;
import com.weshare.utils.FileUtils;
import com.weshare.utils.TimeUtils;
import com.weshare.utils.WeShareResult;

/**
 * 用户管理器
* <p>Title: UserController</p>
* <p>Description: </p>
* <p>Project: WeShare</p>
* @author 印国林
* @date 2018年3月6日下午12:03:46
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserDescService userDescService;
	
	@Autowired
	private FileService fileService;
	
	@Autowired
	private WebCountService webCountService;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public WeShareResult userLogin(String username , String password ,HttpServletRequest request){
		
		WsUser user = userService.getUserByUsername(username);
		if(user.getuId() != null){
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			session.setMaxInactiveInterval(-1);
		}
		WeShareResult weShareResult = userService.userLogin(username, password);		
		return weShareResult;
	}
	
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	@ResponseBody
	public WeShareResult creatUser(WsUser user){
		WeShareResult creatUser = userService.creatUser(user);
		//用户注册成功后，将该日的注册量++
		String nowTime = TimeUtils.getNowTime();
		webCountService.addRegisterNums(nowTime);
		return creatUser.ok();
		
	}
	
	@RequestMapping("/updateinformation")
	public String updateInformation(HttpServletRequest request){
		WsUser user = (WsUser) request.getSession().getAttribute("user");
		WsUserDesc userDesc = userDescService.getInformationByUserId(user.getuId());
		request.getSession().setAttribute("userDesc", userDesc);
		return "selfinfo";
	}
	
	
	
	@RequestMapping("/saveupdate")
	@ResponseBody
	public WeShareResult saveUpdateInformation(MultipartFile headFile , WsUser wsuser, WsUserDesc wsuserDesc,HttpServletRequest request){
		WsUser user = (WsUser) request.getSession().getAttribute("user");
		//实现头像上传并修改数据库中路径
		if(!headFile.isEmpty()){
		WeShareResult weShareResult = fileService.uploadItemHeadImg(user.getuId(), FileUtils.getItemHeadImgPath(), headFile);
		}else{
			wsuser.setuHead(user.getuHead());
		}
		if(true){
			//如果上传头像成功
			//给wsuser对象补个id
			wsuser.setuId(user.getuId());
			//给wsuserDesc对象补个id
			wsuserDesc.setuId(user.getuId());
			//然后分别把两个对象的信息更新到持久层
			wsuser.setUsername(user.getUsername());
			wsuser.setPassword(user.getPassword());
			wsuser.setuCreat(user.getuCreat());
			wsuser.setuUpdate(TimeUtils.getNowTime());
			wsuser.setuIntegral(user.getuIntegral());
			wsuser.setuStatus(user.getuStatus());
			if(!headFile.isEmpty()){
			    wsuser.setuHead(headFile.getOriginalFilename());
			}
			userService.upDateUser(wsuser);
			userDescService.updateInformation(wsuserDesc);
		
			
		}
		//重新查一遍到个人资料页面
		WsUser userByUserId = userService.getUserByUserId(user.getuId());
		request.getSession().setAttribute("user", userByUserId);
		return WeShareResult.ok(true);
	}
	
	@RequestMapping("/changepass/{oldpassword}/{newpassword}")
	@ResponseBody
	public WeShareResult changePassword(HttpServletRequest request,@PathVariable String oldpassword, @PathVariable String newpassword){
		WsUser user = (WsUser) request.getSession().getAttribute("user");
		String usepassword = user.getPassword();
		if(usepassword.equals(oldpassword)){
			user.setPassword(newpassword);
			userService.upDateUser(user);
			return WeShareResult.ok(true);
		}else{
			return WeShareResult.ok(false);
		}
	}
	


	
	@RequestMapping("/check/{param}/{type}")
	@ResponseBody
	public WeShareResult checkData(@PathVariable String param ,@PathVariable Integer type){
		WeShareResult checkData = userService.checkData(param, type);
		return checkData;
	}
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request){
		request.getSession().invalidate();
		
		return "index";
	}
	
	
	
	
	//管理员查看用户列表
	@RequestMapping("/usermanager")
	@ResponseBody
	public PageResult findUserManager(int page,int size){
		PageResult findManagerUser = userService.findManagerUser(page, size);
		return findManagerUser;
	}
	
	@RequestMapping("/search")
	@ResponseBody
	public PageResult findUserManagerByTj(@RequestBody WsUserCustom wsUserCustom,int page,int size){
		PageResult findManagerUserByTj = userService.findManagerUserByTj(wsUserCustom, page, size);		
		return findManagerUserByTj;
	}
	
	@RequestMapping("/findpassword/{username}/{phoneNum}")
	@ResponseBody
	public WeShareResult findpassword(@PathVariable String username,@PathVariable String phoneNum){
		//检验用户名与该电话号是否匹配
		WeShareResult findUserByUsernameAndPhomeNum = userService.findUserByUsernameAndPhomeNum(username, phoneNum);
		
		return findUserByUsernameAndPhomeNum;	
	}
	@RequestMapping("/savefindpassword/{username}/{newpassword}")
	@ResponseBody
	public WeShareResult savefindpassword(@PathVariable String username,@PathVariable String newpassword){
		//更新用户密码
		WeShareResult savefindpassword = userService.savefindpassword(username, newpassword);
		return savefindpassword;
	}
}
