package com.weshare.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * 分页结果包装类
 * @author Administrator
 *
 */
public class PageResult implements Serializable{

	//总记录数
	private long total;
	
	//记录列表
	private List rows;
	
	

	public PageResult(long total, List rows) {
		super();
		this.total = total;
		this.rows = rows;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}
	
	
}
