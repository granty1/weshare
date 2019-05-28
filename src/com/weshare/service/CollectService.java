package com.weshare.service;

import java.util.List;

import com.weshare.pojo.WsFileDev;
import com.weshare.utils.WeShareResult;

public interface CollectService {
	
	WeShareResult addCollect(long userId , long fileId);
	
	WeShareResult deleteCollect(long userId, long fileId);
	
	String isCollect(long userId, long fileId);
	
	void deleteCollect(long fileName);
	
	long getCollectNum(long userId);
	
	long getCollectNumByFileId(long fileId);
	
	List<WsFileDev> getMyCollect(long userId);

}
