package com.weshare.mapper;

import java.util.List;

import com.weshare.pojo.WsUser;
import com.weshare.pojo.WsUserCustom;

public interface WsUserMapperCustom {
   
	//管理员查询用户列表
	public List<WsUserCustom> findManagerUser();
	
	//条件查询用户列表
	public List<WsUserCustom> findManagerUserByTj(String username);
    
	public List<WsUser> getTop8User();
	
}