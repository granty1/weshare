package com.weshare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.weshare.pojo.PageResult;
import com.weshare.pojo.WsFrozen;
import com.weshare.service.FrozenService;
import com.weshare.utils.WeShareResult;

/**
 * 冻结账号控制器
* <p>Title: FrozenController</p>
* <p>Description: </p>
* <p>Project: WeShare</p>
* @author 印国林
* @date 2018年5月25日下午4:57:39
 */
@Controller
@RequestMapping("/frozen")
public class FrozenController {
	
	@Autowired
	private FrozenService frozenService;
	
	
	//添加
	@RequestMapping("/addfrozen")
	@ResponseBody
	public WeShareResult addFrozen(@RequestBody WsFrozen wsFrozen){
		System.out.println(wsFrozen.getuId()+wsFrozen.getfCause());
		WeShareResult addFrozen = frozenService.addFrozen(wsFrozen);
		return addFrozen;
	}
	
	//加载所有被封用户列表
	@RequestMapping("/removefrozenusers")
	@ResponseBody
	public PageResult  removefrozenusers(int page,int size){
		return frozenService.frozenUserList(page, size);
	}
	
	@RequestMapping("/removefrozen")
	@ResponseBody
	public WeShareResult removefrozen(Long uId){
		WeShareResult removefrozen = frozenService.removefrozen(uId);
		return removefrozen;
	}
	

}
