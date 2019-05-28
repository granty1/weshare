package com.weshare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.weshare.mapper.WsFrozenMapper;
import com.weshare.mapper.WsUserDescMapper;
import com.weshare.mapper.WsUserMapper;
import com.weshare.mapper.WsUserMapperCustom;
import com.weshare.pojo.PageResult;
import com.weshare.pojo.WsFrozen;
import com.weshare.pojo.WsUser;
import com.weshare.pojo.WsUserCustom;
import com.weshare.pojo.WsUserDesc;
import com.weshare.pojo.WsUserExample;
import com.weshare.pojo.WsUserExample.Criteria;
import com.weshare.service.UserService;
import com.weshare.utils.IDUtils;
import com.weshare.utils.TimeUtils;
import com.weshare.utils.WeShareResult;

/**
 * 用户管理ServiceImpl
 * <p>
 * Title: userLoginImpl
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Project: WeShare
 * </p>
 * 
 * @author 印国林
 * @date 2018年3月6日下午6:27:36
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private WsUserMapper wsUserMapper;

	@Autowired
	private WsUserDescMapper wsUserDescMapper;

	@Autowired
	private WsUserMapperCustom wsUserMapperCustom;
	
	@Autowired
	private WsFrozenMapper wsFrozenMapper;

	/*
	 * @Autowired private WsUserExtendsMapper wsUserExtendsMapper;
	 */

	@Override
	public WeShareResult userLogin(String username, String password) {
		WsUserExample example = new WsUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<WsUser> list = wsUserMapper.selectByExample(example);
		// 如果没有此用户名
		if (null == list || list.size() == 0) {
			return WeShareResult.build(400, "用户名错误或者不存在!");
		}
		WsUser wsUser = list.get(0);
		if (!wsUser.getPassword().equals(password)) {
			return WeShareResult.build(400, "密码错误！");
		}
		if (wsUser.getUsername().equals("root")) {
			return WeShareResult.build(300, null);
		}
		if(wsUser.getuStatus()==2){
			//说明该用户已经被封禁
			WsFrozen wsFrozen = wsFrozenMapper.selectByPrimaryKey(wsUser.getuId());
			String frozenCause = wsFrozen.getfCause();
			return WeShareResult.build(500, frozenCause);
		}
		return WeShareResult.ok();
	}

	@Override
	public WeShareResult creatUser(WsUser user) {
		long uId = IDUtils.genItemId();
		user.setuId(uId);
		user.setuHead("111.jpg");
		user.setuCreat(TimeUtils.getNowTime());
		user.setuUpdate(TimeUtils.getNowTime());
		user.setuIntegral(5);
		user.setuStatus(1);
		WsUserDesc userDesc = new WsUserDesc();
		userDesc.setuId(uId);
		wsUserMapper.insert(user);
		wsUserDescMapper.insert(userDesc);

		return WeShareResult.ok();
	}

	@Override
	public WeShareResult checkData(String param, Integer type) {
		WsUserExample example = new WsUserExample();
		Criteria criteria = example.createCriteria();
		if (type == 1) {
			// type=1 : 校验用户名
			criteria.andUsernameEqualTo(param);
		}
		if (type == 2) {
			// type=2 : 校验手机号

			criteria.andUPhoneEqualTo(param);
		}
		List<WsUser> list = wsUserMapper.selectByExample(example);
		if (list == null || list.size() == 0) {
			return WeShareResult.ok(true);
		} else {
			return WeShareResult.ok(false);
		}
	}

	@Override
	public WsUser getUserByUsername(String username) {
		WsUserExample example = new WsUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<WsUser> selectByExample = wsUserMapper.selectByExample(example);
		if (selectByExample.size() == 0) {
			return new WsUser();

		} else {
			return selectByExample.get(0);
		}
	}

	@Override
	public WsUser getUserByUserId(long userId) {
		WsUser selectByPrimaryKey = wsUserMapper.selectByPrimaryKey(userId);
		return selectByPrimaryKey;
	}

	@Override
	public void upDateUser(WsUser user) {
		wsUserMapper.updateByPrimaryKey(user);

	}

	@Override
	public List<WsUser> getUserByKeyWord(String keyWord) {
		WsUserExample example = new WsUserExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUsernameLike(keyWord);
		List<WsUser> selectByExample = wsUserMapper.selectByExample(example);
		return selectByExample;
	}

	@Override
	public List<WsUser> getAllUser() {
		WsUserExample example = new WsUserExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUsernameIsNotNull();
		List<WsUser> selectByExample = wsUserMapper.selectByExample(example);
		return selectByExample;
	}

	@Override
	public List<WsUser> getTop8User() {
		List<WsUser> top8User = wsUserMapperCustom.getTop8User();
		return top8User;
	}

	@Override
	public PageResult findManagerUser(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<WsUserCustom> list = (Page<WsUserCustom>) wsUserMapperCustom.findManagerUser();
		return new PageResult(list.getTotal(), list.getResult());
	}

	@Override
	public PageResult findManagerUserByTj(WsUserCustom wsUserCustom, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		String username = wsUserCustom.getUsername()!=null?wsUserCustom.getUsername():"";
		Page<WsUserCustom> list = (Page<WsUserCustom>) wsUserMapperCustom.findManagerUserByTj(username);

		return new PageResult(list.getTotal(), list.getResult());
	}

	@Override
	public WeShareResult findUserByUsernameAndPhomeNum(String username, String phoneNum) {
		WsUserExample example = new WsUserExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUsernameEqualTo(username);
		createCriteria.andUPhoneEqualTo(phoneNum);
		List<WsUser> selectByExample = wsUserMapper.selectByExample(example);
		if(selectByExample!=null && selectByExample.size()==1){
			//说明该用户名与手机号匹配
			return new WeShareResult().ok();
		}
		return new WeShareResult().build(400, "用户名与手机号不匹配");
	}

	@Override
	public WeShareResult savefindpassword(String username, String newpassword) {
		WsUserExample example = new WsUserExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUsernameEqualTo(username);
		List<WsUser> list = wsUserMapper.selectByExample(example);
		if(list.size()==0 || list.size()>1){
			return new WeShareResult().build(400, "用户名不能为空");
		}
		WsUser wsUser = list.get(0);
		wsUser.setPassword(newpassword);
		wsUserMapper.updateByPrimaryKey(wsUser);
		return new WeShareResult().ok();
	}

}
