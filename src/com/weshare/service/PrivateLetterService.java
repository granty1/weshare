package com.weshare.service;

import java.util.List;

import com.weshare.pojo.WsPriletter;
import com.weshare.utils.WeShareResult;

public interface PrivateLetterService {
	
	WeShareResult sendPrivateLetter(WsPriletter priletter);
	
	String isHaveNewLetter(long userId);

	List<WsPriletter> selectMyLetters(long userId);
	
	WsPriletter selectByPId(long pId);
	
	void updatePriLstter(WsPriletter priletter);
	
	long getLettersNum(long userId);
	
	void deletePriLetters(long pId);
}
