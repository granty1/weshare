package com.weshare.pojo;

public class WsFileDev extends WsFile {

	private String fAuthor;
	
	private String uHead;
	
	private String uCollect;



	public String getuCollect() {
		return uCollect;
	}

	public void setuCollect(String uCollect) {
		this.uCollect = uCollect;
	}

	public String getuHead() {
		return uHead;
	}

	public void setuHead(String uHead) {
		this.uHead = uHead;
	}

	public String getfAuthor() {
		return fAuthor;
	}

	public void setfAuthor(String fAuthor) {
		this.fAuthor = fAuthor;
	}
}
