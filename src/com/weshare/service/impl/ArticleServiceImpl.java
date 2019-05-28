package com.weshare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.weshare.mapper.WsArticleMapper;
import com.weshare.mapper.WsArticleMapperCustomer;
import com.weshare.pojo.PageResult;
import com.weshare.pojo.WsArticle;
import com.weshare.pojo.WsArticleCustom;
import com.weshare.pojo.WsArticleExample;
import com.weshare.pojo.WsArticleExample.Criteria;
import com.weshare.service.ArticleService;
import com.weshare.utils.WeShareResult;

@Service
public class ArticleServiceImpl implements ArticleService{
	
	@Autowired
	private WsArticleMapper wsArticleMapper;
	
	@Autowired
	private WsArticleMapperCustomer wsArticleMapperCustomer;

	@Override
	public WeShareResult insertArticle(WsArticle wsArticle) {
		if(wsArticle!=null){
			wsArticleMapper.insert(wsArticle);
		}
		
		return WeShareResult.ok(true);
	}

	@Override
	public List<WsArticle> findMyArticlesByUserId(Long userId) {
		
		List<WsArticle> findArticleList = wsArticleMapperCustomer.findArticleList(userId);
		
		return findArticleList;
	}

	@Override
	public long findMyArticlesByUserIdCount(Long userId) {

		WsArticleExample example = new WsArticleExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUserIdEqualTo(userId);
		List<WsArticle> selectByExample = wsArticleMapper.selectByExample(example );
		long articlenum = 0;
		for (WsArticle wsArticle : selectByExample) {
			articlenum++;
		}
		return articlenum;
	}

	@Override
	public WsArticle findArticleByAId(Long aId) {
		
		return wsArticleMapper.selectByPrimaryKey(aId);
	}

	@Override
	public void delArticle(long aId) {
		wsArticleMapper.deleteByPrimaryKey(aId);
	}

	@Override
	public List<WsArticleCustom> findOtherArticle(Long userId) {

		
		return wsArticleMapperCustomer.findOtherArticle(userId);
	}

	@Override
	public Long findOtherArticleCount(Long userId) {
		
		Long count = wsArticleMapperCustomer.findOtherArticleCount(userId);
		return count;
	}

	@Override
	public PageResult findArticleManagerList(int pageNum, int sizeNum, WsArticleCustom wsArticleCustom) {
		PageHelper.startPage(pageNum, sizeNum);
		Page<WsArticleCustom> list = (Page<WsArticleCustom>) wsArticleMapperCustomer.findArticleManagerList(wsArticleCustom);
				
		return new PageResult(list.getTotal(), list.getResult());
	}

}
