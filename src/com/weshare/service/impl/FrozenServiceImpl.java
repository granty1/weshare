package com.weshare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.weshare.mapper.WsFrozenMapper;
import com.weshare.mapper.WsFrozenMapperCustom;
import com.weshare.mapper.WsUserMapper;
import com.weshare.pojo.PageResult;
import com.weshare.pojo.WsFrozen;
import com.weshare.pojo.WsFrozenCustom;
import com.weshare.pojo.WsUser;
import com.weshare.service.FrozenService;
import com.weshare.utils.TimeUtils;
import com.weshare.utils.WeShareResult;
@Service
public class FrozenServiceImpl implements FrozenService{
	
	@Autowired
	private WsFrozenMapper wsFrozenMapper;
	
	@Autowired
	private WsUserMapper wsUserMapper;
	
	@Autowired
	private WsFrozenMapperCustom wsFrozenMapperCustom;

	@Override
	public WeShareResult addFrozen(WsFrozen wsFrozen) {
		if(wsFrozen.getfCause()==null || wsFrozen.getfCause()==""){
			return new WeShareResult().build(400, "请输入封禁理由");
		}
		wsFrozen.setfCtime(TimeUtils.getNowTime());
		wsFrozenMapper.insert(wsFrozen);
		//将该用户状态改为2
		Long userId = wsFrozen.getuId();
		WsUser wsUser = wsUserMapper.selectByPrimaryKey(userId);
		wsUser.setuStatus(2);
		wsUserMapper.updateByPrimaryKey(wsUser);
		return new WeShareResult().ok();
	}

	@Override
	public PageResult frozenUserList(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<WsFrozenCustom> list = (Page<WsFrozenCustom>) wsFrozenMapperCustom.frozenUserList();
		return new PageResult(list.getTotal(), list.getResult());
	}

	@Override
	public WeShareResult removefrozen(Long uId) {
		//去冻结表中查找该用户
		WsFrozen selectByPrimaryKey = wsFrozenMapper.selectByPrimaryKey(uId);
		if(selectByPrimaryKey!=null){
			//查到了该用户,将该用户从冻结表中删除
			wsFrozenMapper.deleteByPrimaryKey(uId);
			//去用户列表中查找该用户
			WsUser wsUser = wsUserMapper.selectByPrimaryKey(uId);
			//将用户的状态改回1
			wsUser.setuStatus(1);
			//将用户信息更新到用户表中区
			wsUserMapper.updateByPrimaryKey(wsUser);
			return new WeShareResult().ok();
		}
		return new WeShareResult().build(400, "该用户未封禁");
	}

}
