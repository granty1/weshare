package com.weshare.pojo;


/**
 * 朋友圈展示项pojo
* <p>Title: WsFriendsCircleShow</p>
* <p>Description: </p>
* <p>Project: WeShare</p>
* @author 印国林
* @date 2018年3月19日下午10:37:39
 */
public class WsFriendsCircleShow extends WsFile{
	
	//上传者名字
	private String authorName;
	//上传者头像
	private String authorHead;
	//收藏数
	private long collectNum;
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorHead() {
		return authorHead;
	}
	public void setAuthorHead(String authorHead) {
		this.authorHead = authorHead;
	}
	public long getCollectNum() {
		return collectNum;
	}
	public void setCollectNum(long collectNum) {
		this.collectNum = collectNum;
	} 
	
}
