package com.weshare.pojo;

/**
 * 动态包装类
* <p>Title: WsArticleCustom</p>
* <p>Description: </p>
* <p>Project: WeShare</p>
* @author 印国林
* @date 2018年5月24日下午12:13:09
 */
public class WsArticleCustom extends WsArticle{
	
	//作者头像
	private String authorhead;
	
	//作者名字
	private String authorname;
	
	//动态id
	private long articleid;
	
	//动态标题
	private String articletitle;
	
	//动态发表时间
	private String articletime;
	
	//作者id
	
	private Long authorid;

	
	public long getArticleid() {
		return articleid;
	}

	public void setArticleid(long articleid) {
		this.articleid = articleid;
	}

	public String getArticletitle() {
		return articletitle;
	}

	public void setArticletitle(String articletitle) {
		this.articletitle = articletitle;
	}

	public String getArticletime() {
		return articletime;
	}

	public void setArticletime(String articletime) {
		this.articletime = articletime;
	}

	public String getAuthorhead() {
		return authorhead;
	}

	public void setAuthorhead(String authorhead) {
		this.authorhead = authorhead;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public Long getAuthorid() {
		return authorid;
	}

	public void setAuthorid(Long authorid) {
		this.authorid = authorid;
	}
	
	
}
