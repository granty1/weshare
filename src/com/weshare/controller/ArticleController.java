package com.weshare.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.weshare.pojo.PageResult;
import com.weshare.pojo.WsArticle;
import com.weshare.pojo.WsArticleCustom;
import com.weshare.pojo.WsUser;
import com.weshare.pojo.WsUserDev;
import com.weshare.service.ArticleService;
import com.weshare.utils.IDUtils;
import com.weshare.utils.TimeUtils;
import com.weshare.utils.WeShareResult;

/**
 * 文章控制器
* <p>Title: ArticleController</p>
* <p>Description: </p>
* <p>Project: WeShare</p>
* @author 印国林
* @date 2018年5月23日下午8:21:56
 */
@Controller
@RequestMapping("/article")
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("/findmyarticle")
	public String findmyarticle(HttpSession Session){
		WsUser user = (WsUser) Session.getAttribute("user");
		Long userId = user.getuId();
		
		List<WsArticle> findMyArticlesByUserId = articleService.findMyArticlesByUserId(userId);
		
		Session.setAttribute("myarticles", findMyArticlesByUserId);
		
		return "myarticles";
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public WeShareResult addArticle(HttpSession session,WsArticle article){
		WsUser user = (WsUser) session.getAttribute("user");
		Long authorId = user.getuId();
		article.setUserId(authorId);
		article.setaCtime(TimeUtils.getNowTime());
		article.setaId(IDUtils.genItemId());
		article.setaSeenum(0);
		article.setaKind("1");
		if(article.getaName()!=null && article.getaText()!=null && article.getaKind()!=null){
			WeShareResult insertArticle = articleService.insertArticle(article);
			return insertArticle;
		}
		return WeShareResult.build(400, "发表失败");
	}
	
	@RequestMapping("/articledesc/{articleid}")
	@ResponseBody
	public WsArticle articleDesc(HttpSession session,@PathVariable long articleId){
		WsArticle findArticleByAId = articleService.findArticleByAId(articleId);
		session.setAttribute("articledesc", findArticleByAId);
		return findArticleByAId;
	}
	
	@RequestMapping("/del")
	
	public String articleDel(HttpSession session,long aId){
		WsUser user = (WsUser) session.getAttribute("user");
		/*String aid = request.getParameter("aId");
		long aId = Integer.parseInt(aid.trim(),10);*/
		articleService.delArticle(aId);
		// 重新查询动态总数和动态列表
		long articleNumByUserId = articleService.findMyArticlesByUserIdCount(user.getuId());
		List<WsArticle> findMyArticlesByUserId = articleService.findMyArticlesByUserId(user.getuId());
		session.setAttribute("articleNumByUserId", articleNumByUserId);
		session.setAttribute("myarticles", findMyArticlesByUserId);
		return "myarticles";
	}
	
	@RequestMapping("/otherarticles")
	public String otherArticles(HttpSession session){
		WsUser author = (WsUser) session.getAttribute("authorDev");
		
		List<WsArticleCustom> otherArticles = articleService.findOtherArticle(author.getuId());
		
		session.setAttribute("otherArticles", otherArticles);		
		
		return "otherarticles";
	}
	
	@RequestMapping("/articlemanager")
	@ResponseBody
	public PageResult articleManager(int page,int size,@RequestBody WsArticleCustom articleCustom){
		PageResult findArticleManagerList = articleService.findArticleManagerList(page, size, articleCustom);
		return findArticleManagerList;
	}
	@RequestMapping("delarticlemanager")
	@ResponseBody
	public WeShareResult delArticleByManager(Long aId){
		articleService.delArticle(aId);
		return WeShareResult.ok();
	}

}
