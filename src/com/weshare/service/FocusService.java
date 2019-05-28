package com.weshare.service;

import java.util.List;

import com.weshare.pojo.WsUser;
import com.weshare.pojo.WsUserDev;
import com.weshare.utils.WeShareResult;


public interface FocusService {
	
	WeShareResult addFocus(long focusId , long beFocusId);
	
	List<WsUser> getMyFocus(long userId);
	
	void deleteFocus(long focusId,long beFocusId);
	
	String isFocus(long userId, long authorId);
	
	long getbeFocusNum(long userId);
	
	long getFocusNum(long userId);
	
	List<WsUser> getMyFans(long userId);

}
