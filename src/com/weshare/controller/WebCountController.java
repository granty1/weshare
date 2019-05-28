package com.weshare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 网站统计控制器
* <p>Title: WebCountController</p>
* <p>Description: </p>
* <p>Project: WeShare</p>
* @author 印国林
* @date 2018年5月26日下午12:33:13
 */
import org.springframework.web.bind.annotation.ResponseBody;

import com.weshare.pojo.DataGrid;
import com.weshare.pojo.PieGrid;
import com.weshare.service.WebCountService;

import javassist.tools.web.Webserver;
@Controller
@RequestMapping("/webcount")
public class WebCountController {
	
	@Autowired
	private WebCountService webCountService;
	
	@RequestMapping("/fangwen")
	@ResponseBody
	public DataGrid fangwen(){
		return webCountService.findFWDataGrid();
	}
	@RequestMapping("/zhuce")
	@ResponseBody
	public DataGrid zhuce(){
		return webCountService.findZCDataGrid();
	}
	@RequestMapping("/zhiye")
	@ResponseBody
	public PieGrid zhiye(){
		return webCountService.findZYZBPieGrid();
	}
	@RequestMapping("/filekind")
	@ResponseBody
	public PieGrid fileKind(){
		return webCountService.findCountByFileKind();
	}

}
