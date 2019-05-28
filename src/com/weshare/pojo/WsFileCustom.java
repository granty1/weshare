package com.weshare.pojo;

import java.io.Serializable;

/**
 * 资源包装类
* <p>Title: WsFileCustom</p>
* <p>Description: </p>
* <p>Project: WeShare</p>
* @author 印国林
* @date 2018年5月26日上午12:10:35
 */
public class WsFileCustom extends WsFile implements Serializable{
	private long fileid;
	private String filetitle;
	private String filename;
	private String filekind;
	private long downnum;
	private String authorname;
	
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public long getFileid() {
		return fileid;
	}
	public void setFileid(long fileid) {
		this.fileid = fileid;
	}
	public String getFiletitle() {
		return filetitle;
	}
	public void setFiletitle(String filetitle) {
		this.filetitle = filetitle;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getFilekind() {
		return filekind;
	}
	public void setFilekind(String filekind) {
		this.filekind = filekind;
	}
	public long getDownnum() {
		return downnum;
	}
	public void setDownnum(long downnum) {
		this.downnum = downnum;
	}

	
}
