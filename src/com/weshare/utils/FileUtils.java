package com.weshare.utils;

import java.io.File;

import com.weshare.controller.FriendsCircleController;
import com.weshare.pojo.WsFile;
import com.weshare.pojo.WsFileDev;
import com.weshare.pojo.WsFriendsCircleShow;
import com.weshare.pojo.WsUser;

/**
 * 创建用户个人存储位置工具类
* <p>Title: FileUtils</p>
* <p>Description: </p>
* <p>Project: WeShare</p>
* @author 印国林
* @date 2018年3月10日下午12:36:35
 */
public class FileUtils {

	public static String creatUserFile(long userId) {
		File file;
		boolean fileExit = false;
		boolean mkdir = false;
		String fileName;
		String path = "D://weshare/file" + userId;
		file = new File(path);

		fileExit = file.exists();

		if (fileExit == true) {
			// System.out.println("已经存在");
		} else {
			// System.out.println("现在创建该文件夹");
			mkdir = file.mkdir();
		}
		return path;
	}
	
	
	
	
	
	
	public static String getItemHeadImgPath(){
		String path = "E:\\apache-tomcat-8.5.28\\apache-tomcat-eshop\\webapps\\weshare\\WEB-INF\\static";
		return path;
	}
	
	
	
	
	
	public static void copy(WsFileDev fileDev, WsFile file, WsUser user){
		fileDev.setfAuthor(user.getUsername());
		fileDev.setuHead(user.getuHead());
		fileDev.setfCreat(file.getfCreat());
		fileDev.setfDesc(file.getfDesc());
		fileDev.setfDownnum(file.getfDownnum());
		fileDev.setfId(file.getfId());
		fileDev.setfIntegral(file.getfIntegral());
		fileDev.setfKind(file.getfKind());
		fileDev.setfName(file.getfName());
		fileDev.setfPath(file.getfPath());
		fileDev.setfSize(file.getfSize());
		fileDev.setfStatus(file.getfStatus());
		fileDev.setfTitle(file.getfTitle());
		fileDev.setuId(file.getuId());
		
	}
	
	
	public static void copyForFriendsCircleShows(WsFile file , WsFriendsCircleShow friendFile){
		//文件名 文件标题 详细描述 上传时间  收藏数 下载数  积分 种类 
		friendFile.setfCreat(file.getfCreat());
		friendFile.setfDesc(file.getfDesc());
		friendFile.setfDownnum(file.getfDownnum());
		friendFile.setfId(file.getfId());
		friendFile.setfIntegral(file.getfIntegral());
		friendFile.setfKind(file.getfKind());
		friendFile.setfName(file.getfName());
		friendFile.setfSize(file.getfSize());
		friendFile.setfTitle(file.getfTitle());
		
		
	}
}
