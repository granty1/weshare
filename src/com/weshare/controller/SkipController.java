package com.weshare.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.weshare.service.FileService;
import com.weshare.service.WebCountService;
import com.weshare.utils.TimeUtils;

@Controller
public class SkipController {
	
	@Autowired
	private FileService fileService;
	
	@Autowired
	private WebCountService webCountService;

	@RequestMapping("/")
	public String init(HttpServletRequest request,Model model) {		
		return "index";
	}
	
	@RequestMapping("/register")
    public String register(){
		return "register";
	}
	
	@RequestMapping("/forgive")
	public String forgive(){
		return "forgivepassword";
	}
	
	@RequestMapping("/filelist")
	public String filelist(){
		return "filelist";
	}
	
	@RequestMapping("/userlist")
	public String userlist(){
		return "userlist";
	}
	@RequestMapping("/changepass")
	public String changepass(){
		return "changepass";
	}
	@RequestMapping("/background")
	public String background(HttpSession session){
		if(session.getAttribute("user")==null)
		{
			return "/error/500";
		}
		return "background";
	}
	@RequestMapping("/usermanager")
	public String usermanager(){
		return "usermanager";
	}
	@RequestMapping("/removefrozen")
	public String removefrozen(){
		return "removefrozen";
	}
	@RequestMapping("/filemanager")
	public String filemanager(){
		return "filemanager";
	}
	@RequestMapping("/articlemanager")
	public String articlemanager(){
		return "articlemanager";
	}
	@RequestMapping("/fangwenl")
	public String fangwenl(){
		return "fangwenl";
	}
	@RequestMapping("/zhucel")
	public String zhucel(){
		return "zhucel";
	}
	@RequestMapping("/zhiye")
	public String zhiye(){
		return "zhiye";
	}
	@RequestMapping("/filekind")
	public String filekind(){
		return "filekind";
	}
	@RequestMapping("/filepass")
	public String filepass(){
		return "filepass";
	}
}
