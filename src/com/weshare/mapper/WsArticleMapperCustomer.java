package com.weshare.mapper;

import com.weshare.pojo.WsArticle;
import com.weshare.pojo.WsArticleCustom;
import com.weshare.pojo.WsArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WsArticleMapperCustomer {


	//查询自己所有动态列表
	public List<WsArticle> findArticleList(Long userId);
	
	//查询他人动态俩表
	public List<WsArticleCustom> findOtherArticle(Long userId);
	
	//查询他人动态总数
	public Long findOtherArticleCount(Long userId);
	
	//查询动态管理列表
	public List<WsArticleCustom> findArticleManagerList(WsArticleCustom wsArticleCustom);
}