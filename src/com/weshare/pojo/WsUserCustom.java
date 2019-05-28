package com.weshare.pojo;

import java.io.Serializable;

/**
 * 用户包装类
* <p>Title: WsUserCustom</p>
* <p>Description: </p>
* <p>Project: WeShare</p>
* @author 印国林
* @date 2018年5月24日下午10:15:25
 */
public class WsUserCustom extends WsUser implements Serializable{
	//用户id
	private long id;
	//上传资源数量
	private long filenum;
	//发表动态数
	private long articlenum;
	//用户名
	private String username;
	//用户积分
	private String integral;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIntegral() {
		return integral;
	}
	public void setIntegral(String integral) {
		this.integral = integral;
	}
	public long getFilenum() {
		return filenum;
	}
	public void setFilenum(long filenum) {
		this.filenum = filenum;
	}
	public long getArticlenum() {
		return articlenum;
	}
	public void setArticlenum(long articlenum) {
		this.articlenum = articlenum;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	

}
