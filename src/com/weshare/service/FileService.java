package com.weshare.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.weshare.pojo.PageResult;
import com.weshare.pojo.WsFile;
import com.weshare.pojo.WsFileCustom;
import com.weshare.utils.WeShareResult;

public interface FileService {
	
	WeShareResult uploadFile(MultipartFile file,  
			String username, WsFile wsFile,String realPath);
	
	List<WsFile> selectByUserId(long userId);
	
	WsFile getFileByFileName(String fileName);
	
	List<WsFile> getFileByFileKind(String fileKind);
	
	List<WsFile> getAllFile();
	
	List<WsFile> getAllFileByPage(long page);
	
	WsFile getFileByPrimaryKey(long fileId);
	
	List<WsFile> getFileListByKeyWord(String keyWord);
	
	WeShareResult uploadItemHeadImg(long uId ,String path, MultipartFile file);
	
	void upDateFile(WsFile file);
	
	void deleteFileByFileName(String fileName);
	
	List<WsFile> getTop3File();
	
	void deleteFileByFid(long fId);
	
	PageResult findFileManagerList(int pageNum,int pageSize,WsFileCustom wsFileCustom);
	
	PageResult findFilePassList(int pageNum,int pageSize,WsFileCustom wsFileCustom);
	
	WeShareResult passFile(Long fId);
	

}
