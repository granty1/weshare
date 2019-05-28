package com.weshare.service;

import com.weshare.pojo.DataGrid;
import com.weshare.pojo.PieGrid;
import com.weshare.pojo.WsWebcount;

/**
 * 网站统计
* <p>Title: WebCountService</p>
* <p>Description: </p>
* <p>Project: WeShare</p>
* @author 印国林
* @date 2018年5月26日上午10:39:10
 */

public interface WebCountService {
	public void firstClicks(String time);
	
	public long getClicks(String time);
	
	public void addRegisterNums(String time);
	
	public void getRegisterNums();
	
	public void addClicks(String time);
	
	public WsWebcount findWebcountByDay(String day);
	
	public DataGrid findFWDataGrid();
	
	public DataGrid findZCDataGrid();
	
	public PieGrid findZYZBPieGrid();
	
	public PieGrid findCountByFileKind();

}
