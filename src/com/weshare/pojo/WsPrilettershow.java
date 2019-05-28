package com.weshare.pojo;

public class WsPrilettershow extends WsPriletter {

	private String authorName;
	
	private String authorHead;

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

	@Override
	public String toString() {
		return "WsPrilettershow [authorName=" + authorName + ", authorHead=" + authorHead + "]";
	}
	
	
}
