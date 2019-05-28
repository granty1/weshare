package com.weshare.pojo;

import java.util.List;

public class DataGrid {
	
	private long year;
	
	private long mouth;
	
	private long day;
	
	private List<Data> datas;

	public long getYear() {
		return year;
	}

	public void setYear(long year) {
		this.year = year;
	}

	public long getMouth() {
		return mouth;
	}

	public void setMouth(long mouth) {
		this.mouth = mouth;
	}

	public long getDay() {
		return day;
	}

	public void setDay(long day) {
		this.day = day;
	}

	public List<Data> getDatas() {
		return datas;
	}

	public void setDatas(List<Data> datas) {
		this.datas = datas;
	}
	
	

}
