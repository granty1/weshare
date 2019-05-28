package com.weshare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weshare.mapper.WsUserDescMapper;
import com.weshare.pojo.WsUserDesc;
import com.weshare.pojo.WsUserDescExample;
import com.weshare.pojo.WsUserDescExample.Criteria;
import com.weshare.service.UserDescService;

@Service
public class UserDescServiceImpl implements UserDescService {
	
	@Autowired
	private WsUserDescMapper wsUserDescMapper;

	@Override
	public WsUserDesc getInformationByUserId(long userId) {
		WsUserDesc selectByPrimaryKey = wsUserDescMapper.selectByPrimaryKey(userId);
		return selectByPrimaryKey;
	}

	@Override
	public void updateInformation(WsUserDesc wsUserDesc) {
		wsUserDescMapper.updateByPrimaryKey(wsUserDesc);	
	}

}
