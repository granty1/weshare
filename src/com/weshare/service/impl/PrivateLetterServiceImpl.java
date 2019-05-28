package com.weshare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weshare.mapper.WsPriletterMapper;
import com.weshare.pojo.WsPriletter;
import com.weshare.pojo.WsPriletterExample;
import com.weshare.pojo.WsPriletterExample.Criteria;
import com.weshare.service.PrivateLetterService;
import com.weshare.utils.WeShareResult;


@Service
public class PrivateLetterServiceImpl implements PrivateLetterService {
	
	@Autowired
	private WsPriletterMapper wsPriletterMapper;

	@Override
	public WeShareResult sendPrivateLetter(WsPriletter priletter) {
		wsPriletterMapper.insert(priletter);
		return WeShareResult.ok(true);
	}

	@Override
	public String isHaveNewLetter(long userId) {
		List<WsPriletter> selectLetterByStatus = wsPriletterMapper.selectLetterByStatus(userId);
		if(selectLetterByStatus.size()>0){
			//说明该用户下有未读的私信
			return "yes";
		}else {
			return "no";
		}
	}

	@Override
	public List<WsPriletter> selectMyLetters(long userId) {
		WsPriletterExample example = new WsPriletterExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andPReciEqualTo(userId);
		List<WsPriletter> selectByExample = wsPriletterMapper.selectByExample(example);
		return selectByExample;
	}

	@Override
	public WsPriletter selectByPId(long pId) {
		WsPriletter selectByPrimaryKey = wsPriletterMapper.selectByPrimaryKey(pId);
		return selectByPrimaryKey;
	}

	@Override
	public void updatePriLstter(WsPriletter priletter) {
		wsPriletterMapper.updateByPrimaryKey(priletter);
	}

	@Override
	public long getLettersNum(long userId) {
		WsPriletterExample example = new WsPriletterExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andPReciEqualTo(userId);
		List<WsPriletter> selectByExample = wsPriletterMapper.selectByExample(example);
		long lettersNum = 0;
		if(selectByExample.size()==0){
			return 0;
		}else{
			
			for (WsPriletter wsPriletter : selectByExample) {
				lettersNum++;
			}
			return lettersNum;
		}
	}

	@Override
	public void deletePriLetters(long pId) {
		wsPriletterMapper.deleteByPrimaryKey(pId);
	}
}
