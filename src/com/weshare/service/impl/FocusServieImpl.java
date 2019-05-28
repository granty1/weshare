package com.weshare.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weshare.mapper.WsFocusMapper;
import com.weshare.mapper.WsUserMapper;
import com.weshare.pojo.WsFocus;
import com.weshare.pojo.WsFocusExample;
import com.weshare.pojo.WsFocusExample.Criteria;
import com.weshare.pojo.WsUser;
import com.weshare.pojo.WsUserDev;
import com.weshare.service.FocusService;
import com.weshare.utils.WeShareResult;
@Service
public class FocusServieImpl implements FocusService {
	
	@Autowired
	private WsFocusMapper WsFocusMapper;
	
	@Autowired
	private WsUserMapper wsUserMapper;

	@Override
	public WeShareResult addFocus(long focusId, long beFocusId) {
		WsFocus wsFocus = new WsFocus();
		wsFocus.setuFocus(focusId);
		wsFocus.setuBeFocus(beFocusId);
		WsFocusMapper.insert(wsFocus);
		return WeShareResult.ok(true);
	}

	@Override
	public List<WsUser> getMyFocus(long userId) {
		WsFocusExample example = new WsFocusExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUFocusEqualTo(userId);
		List<WsFocus> selectByExample = WsFocusMapper.selectByExample(example);
		List<WsUser> FocusList = new ArrayList<>();
		for (WsFocus wsFocus : selectByExample) {
			Long getuBeFocus = wsFocus.getuBeFocus();
			WsUser beFocus = wsUserMapper.selectByPrimaryKey(getuBeFocus);
			FocusList.add(beFocus);
		}
		return FocusList;
	}

	@Override
	public void deleteFocus(long focusId,long beFocusId){
		WsFocusExample example = new WsFocusExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUBeFocusEqualTo(beFocusId);
		createCriteria.andUFocusEqualTo(focusId);
		WsFocusMapper.deleteByExample(example);
	}

	@Override
	public String isFocus(long userId, long authorId) {
		WsFocusExample example = new WsFocusExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUBeFocusEqualTo(authorId);
		createCriteria.andUFocusEqualTo(userId);
		List<WsFocus> selectByExample = WsFocusMapper.selectByExample(example);
		if(selectByExample.size() > 0){
			return "focus";
		}else{
			return "notfocus";
		}
	}

	@Override
	public long getbeFocusNum(long userId) {
		WsFocusExample example = new WsFocusExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUBeFocusEqualTo(userId);
		List<WsFocus> selectByExample = WsFocusMapper.selectByExample(example);
		long FocusNum = 0;
		if(selectByExample.size() == 0){
			return 0;
		}
		for (WsFocus wsFocus : selectByExample) {
			FocusNum++;
		}
		return FocusNum;
	}

	@Override
	public long getFocusNum(long userId) {
		WsFocusExample example = new WsFocusExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUFocusEqualTo(userId);
		List<WsFocus> selectByExample = WsFocusMapper.selectByExample(example);
		if (selectByExample.size() == 0) {
			return 0;
		}
		long FocusNum = 0;
		for (WsFocus wsFocus : selectByExample) {
			FocusNum++;
		}
		return FocusNum;
	}

	@Override
	public List<WsUser> getMyFans(long userId) {
		WsFocusExample example = new WsFocusExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUBeFocusEqualTo(userId);
		List<WsFocus> selectByExample = WsFocusMapper.selectByExample(example);
		List<WsUser> beFocusList = new ArrayList<>();
		for (WsFocus wsFocus : selectByExample) {
			Long getFocus = wsFocus.getuFocus();
			WsUser beFocus = wsUserMapper.selectByPrimaryKey(getFocus);
			beFocusList.add(beFocus);
		}
		return beFocusList;
	}

}
