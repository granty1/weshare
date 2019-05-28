package com.weshare.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weshare.mapper.WsCollectMapper;
import com.weshare.mapper.WsFileMapper;
import com.weshare.mapper.WsUserMapper;
import com.weshare.pojo.WsCollect;
import com.weshare.pojo.WsCollectExample;
import com.weshare.pojo.WsCollectExample.Criteria;
import com.weshare.pojo.WsFile;
import com.weshare.pojo.WsFileDev;
import com.weshare.pojo.WsUser;
import com.weshare.service.CollectService;
import com.weshare.utils.FileUtils;
import com.weshare.utils.WeShareResult;


@Service
public class CollectServiceImpl implements CollectService {
	
	
	@Autowired
	private WsCollectMapper wsCollectMapper;
	
	@Autowired
	private WsFileMapper wsFileMapper;
	
	@Autowired
	private WsUserMapper wsUserMapper;

	@Override
	public WeShareResult addCollect(long userId, long fileId) {
		WsCollect record = new WsCollect();
		record.setuId(userId);
		record.setfId(fileId);
		wsCollectMapper.insert(record);
		return WeShareResult.ok(true);
	}

	@Override
	public WeShareResult deleteCollect(long userId, long fileId) {		
		WsCollectExample example = new WsCollectExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andFIdEqualTo(fileId);
		createCriteria.andUIdEqualTo(userId);
		wsCollectMapper.deleteByExample(example);
		return WeShareResult.ok(true);
	}

	@Override
	public String isCollect(long userId, long fileId) {
		WsCollectExample example = new WsCollectExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andFIdEqualTo(fileId);
		createCriteria.andUIdEqualTo(userId);
		List<WsCollect> selectByExample = wsCollectMapper.selectByExample(example);
		if (selectByExample.size() > 0) {
			return "coll";
		} else {
			return "notcoll";
		}

	}

	@Override
	public void deleteCollect(long fileName) {
		WsCollectExample example = new WsCollectExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andFIdEqualTo(fileName);
		wsCollectMapper.deleteByExample(example);
		
	}

	@Override
	public long getCollectNum(long userId) {
		WsCollectExample example = new WsCollectExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUIdEqualTo(userId);
		List<WsCollect> selectByExample = wsCollectMapper.selectByExample(example);
		if(selectByExample.size() == 0){
			return 0;
		}
		long collectNum = 0;
		for (WsCollect wsCollect : selectByExample) {
			collectNum++;
		}
		return collectNum;
	}

	@Override
	public List<WsFileDev> getMyCollect(long userId) {
		WsCollectExample example = new WsCollectExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUIdEqualTo(userId);
		List<WsCollect> selectByExample = wsCollectMapper.selectByExample(example);
		List<WsFileDev> files = new ArrayList<>();
		for (WsCollect wsCollect : selectByExample) {
			WsFile file = wsFileMapper.selectByPrimaryKey(wsCollect.getfId());
			WsFileDev fileDev = new WsFileDev();
			WsUser author = wsUserMapper.selectByPrimaryKey(file.getuId());
			FileUtils.copy(fileDev, file, author);						
			files.add(fileDev);
		}
		return files;
	}

	@Override
	public long getCollectNumByFileId(long fileId) {
		WsCollectExample example = new WsCollectExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andFIdEqualTo(fileId);
		List<WsCollect> selectByExample = wsCollectMapper.selectByExample(example);
		if(selectByExample.size()==0){
			return 0;
		}
		long beCollectNum = 0;
		for (WsCollect wsCollect : selectByExample) {
			beCollectNum++;
		}
		return beCollectNum;
	}

}
