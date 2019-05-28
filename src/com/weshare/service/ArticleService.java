package com.weshare.service;

import java.util.List;

import com.weshare.pojo.PageResult;
import com.weshare.pojo.WsArticle;
import com.weshare.pojo.WsArticleCustom;
import com.weshare.utils.WeShareResult;

public interface ArticleService {
	
	public WeShareResult insertArticle(WsArticle wsArticle);
	
	public List<WsArticle> findMyArticlesByUserId(Long userId);
	
	public long findMyArticlesByUserIdCount(Long userId);
	
	public WsArticle findArticleByAId(Long aId);
	
	public void delArticle(long aId);
	
	public List<WsArticleCustom> findOtherArticle(Long userId);
	
	public Long findOtherArticleCount(Long userId);
	
	public PageResult findArticleManagerList(int pageNum,int sizeNum,WsArticleCustom wsArticleCustom);

}
