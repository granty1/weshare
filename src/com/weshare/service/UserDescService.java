package com.weshare.service;

import com.weshare.pojo.WsUserDesc;

public interface UserDescService {
	
	WsUserDesc getInformationByUserId(long userId);
	
	void updateInformation(WsUserDesc wsUserDesc);

}
