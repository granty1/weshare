package com.weshare.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.weshare.pojo.WsArticleCustom;
import com.weshare.pojo.WsFile;
import com.weshare.pojo.WsFriendsCircleShow;
import com.weshare.pojo.WsUser;
import com.weshare.service.ArticleService;
import com.weshare.service.CollectService;
import com.weshare.service.FileService;
import com.weshare.service.FocusService;
import com.weshare.utils.FileUtils;
import com.weshare.utils.SortByCreatTime;

/**
 * 朋友圈管理器
* <p>Title: FriendsCircleController</p>
* <p>Description: </p>
* <p>Project: WeShare</p>
* @author 印国林
* @date 2018年3月19日下午10:32:47
 */
@Controller
@RequestMapping("/friendscircle")
public class FriendsCircleController {

	@Autowired
	private FocusService focusService;
	
	@Autowired
	private FileService FileService;
	
	@Autowired
	private CollectService collectService;
	
	@Autowired
	private ArticleService articleService;

	@RequestMapping("/select")
	public String FriendsCircle(HttpServletRequest request) {
		// 拿到用户对象
		WsUser user = (WsUser) request.getSession().getAttribute("user");
		// 拿到用户关注的人
		List<WsUser> myFocus = focusService.getMyFocus(user.getuId());
		// 需要返回的是一个WsFriendsCircleShow对象的集合
		List<WsFriendsCircleShow> friendsCircleShows = new ArrayList<>();
		//动态包装类集合
		List<WsArticleCustom> friendArticles = new ArrayList<>();
		if (myFocus.size() == 0) {
			return "friendscirclepage";
		}
		for (WsUser wsUser : myFocus) {
			//拿到每个关注的人的id
			Long userId = wsUser.getuId();
			//调用service查出该用户的所有动态
			List<WsArticleCustom> findOtherArticle = articleService.findOtherArticle(userId);
			for (WsArticleCustom wsArticleCustom : findOtherArticle) {
				friendArticles.add(wsArticleCustom);
			}			
			// 拿到每个关注的人发表的资源集合
			List<WsFile> selectByUserId = FileService.selectByUserId(wsUser.getuId());
			if (selectByUserId.size() == 0) {
				continue;
			}
			for (WsFile wsFile : selectByUserId) {
				// 朋友圈需要的是一周之内关注的人的上传的资源,所以这里需要判断，该资源上传的日期，与当前日期之差是否超过7天
				if (!SortByCreatTime.isOverTime(wsFile)) {
					// 如果没有超时，执行下面的封装
					// 创建WsFriendsCircleShow对象
					WsFriendsCircleShow friendFile = new WsFriendsCircleShow();
					// 将每个资源项内容复制到WsFriendsCircleShow对象中去
					FileUtils.copyForFriendsCircleShows(wsFile, friendFile);
					// 此时，WsFriendsCircleShow对象中还有作者头像，作者名字，收藏次数没有添加
					// 作者头像
					// 在作者循环之中，作者头像信息可以直接从作者对象中拿
					String userHead = wsUser.getuHead();
					friendFile.setAuthorHead(userHead);
					// 作者名字
					// 作者名字也可以直接从作者对象中拿
					String username = wsUser.getUsername();
					friendFile.setAuthorName(username);
					// 收藏次数
					// 收藏次数可以调用收藏业务层代码，根据资源fid查出
					long beCollectNum = collectService.getCollectNumByFileId(wsFile.getfId());
					friendFile.setCollectNum(beCollectNum);
					// 所有属性拼装完成，将WsFriendsCircleShow对象放入到集合中去
					friendsCircleShows.add(friendFile);
				}
			}
		}
		// 此时的friendsCircleShows集合中装有了需要展示的数据，但是还未排序
		// 调用封装的工具类SortByCreatTime进行排序
		List<WsFriendsCircleShow> sortListByCreatTime = SortByCreatTime.getSortListByCreatTime(friendsCircleShows);
		// 根据资源上传时间排序完后，再放到域对象中去,传回前台页面
		request.getSession().setAttribute("friendsCircleShows", sortListByCreatTime);
		request.getSession().setAttribute("friendArticles", friendArticles);
		return "friendscirclepage";
	}
}
