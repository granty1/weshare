package com.weshare.pojo;

import java.util.List;

/**
 * 用户增强类
* <p>Title: WsUserDev</p>
* <p>Description: </p>
* <p>Project: WeShare</p>
* @author 印国林
* @date 2018年3月17日下午12:28:14
 */
public class WsUserDev extends WsUser{
	//是否被当前用户关注
	private String uFocus;
	//被关注数
	private long beFocusNum;
	//关注数
	private long focusNum;
	//用户的资源数
	private long filesNum;
	//动态数量
	private long articlesNum;
	//他们主页资源集合
	private List<WsFileDev> otherFileList;
	
	public long getArticlesNum() {
		return articlesNum;
	}
	public void setArticlesNum(long articlesNum) {
		this.articlesNum = articlesNum;
	}
	public long getFilesNum() {
		return filesNum;
	}
	public void setFilesNum(long filesNum) {
		this.filesNum = filesNum;
	}
	public String getuFocus() {
		return uFocus;
	}
	public void setuFocus(String uFocus) {
		this.uFocus = uFocus;
	}
	public long getBeFocusNum() {
		return beFocusNum;
	}
	public void setBeFocusNum(long beFocusNum) {
		this.beFocusNum = beFocusNum;
	}
	public long getFocusNum() {
		return focusNum;
	}
	public void setFocusNum(long focusNum) {
		this.focusNum = focusNum;
	}
	public List<WsFileDev> getOtherFileList() {
		return otherFileList;
	}
	public void setOtherFileList(List<WsFileDev> otherFileList) {
		this.otherFileList = otherFileList;
	}
	@Override
	public String toString() {
		return "WsUserDev [uFocus=" + uFocus + ", beFocusNum=" + beFocusNum + ", focusNum=" + focusNum + ", filesNum="
				+ filesNum + ", otherFileList=" + otherFileList + "]";
	}
	
}
