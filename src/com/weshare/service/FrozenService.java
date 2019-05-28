package com.weshare.service;

import com.weshare.pojo.PageResult;
import com.weshare.pojo.WsFrozen;
import com.weshare.utils.WeShareResult;

public interface FrozenService {
	
	//添加冻结账号
	public WeShareResult addFrozen(WsFrozen wsFrozen);
	
	//加载被封禁用户列表
	public PageResult frozenUserList(int pageNum,int pageSize);
	
	//解封用户
	public WeShareResult removefrozen(Long uId);

}
