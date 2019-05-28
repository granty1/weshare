package com.weshare.service;

import java.util.List;

import com.weshare.pojo.PageResult;
import com.weshare.pojo.WsUser;
import com.weshare.pojo.WsUserCustom;
import com.weshare.utils.WeShareResult;

public interface UserService {

	
	WeShareResult userLogin(String username , String password);
	
	WeShareResult creatUser(WsUser user);
	
	WeShareResult checkData(String param , Integer type);
	
	WsUser getUserByUsername(String username);
	
	WsUser getUserByUserId(long userId);
	
	void upDateUser(WsUser user);
	
	List<WsUser> getUserByKeyWord(String keyWord);
	
	List<WsUser> getAllUser();
	
	List<WsUser> getTop8User();
	
	PageResult findManagerUser(int pageNum,int pageSize);
	
	PageResult findManagerUserByTj(WsUserCustom wsUserCustom,int pageNum,int pageSize);
	
	WeShareResult findUserByUsernameAndPhomeNum(String username,String phoneNum);
	
	WeShareResult savefindpassword(String username,String newpassword);
}
