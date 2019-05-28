package com.weshare.utils;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.weshare.pojo.WsFile;
import com.weshare.pojo.WsFriendsCircleShow;

/**
 * 实现根据文件上传时间排序的功能
* <p>Title: SortByCreatTime</p>
* <p>Description: </p>
* <p>Project: WeShare</p>
* @author 印国林
* @date 2018年3月19日下午11:21:42
 */
public class SortByCreatTime {

	public static List<WsFriendsCircleShow> getSortListByCreatTime(List<WsFriendsCircleShow> list) {
		Collections.sort(list, new Comparator<WsFriendsCircleShow>() {
			@Override
			public int compare(WsFriendsCircleShow f1, WsFriendsCircleShow f2) {
				if(getDays(f1.getfCreat()) > getDays(f2.getfCreat())){
					return -1;
				}
				if(getDays(f1.getfCreat()) == getDays(f2.getfCreat())){
					return 0;
				}
				return 1;
			}
		});
		return list;
	}
	
	
	
	/**
	 * 将yyyy-MM-dd格式字符串日期转换成long型天数
	 * @param time
	 * @return
	 */
	public static long getDays(String time){
		String[] strings = time.split("-",10);
		int year = Integer.parseInt(strings[0], 10);
		int month = Integer.parseInt(strings[1], 10);
		int day = Integer.parseInt(strings[2], 10);
		//年按照365天算， 月按照30天算，
		long days = year*365 + month * 30 + day;
		return days;		
	}
	
	
	
	/**
	 * 判断文件对象上传时间是否过时（与当前时间比较是否超过七天）
	 * @param file
	 * @return
	 */
	public static boolean isOverTime(WsFile file){
		long days = getDays(file.getfCreat());
		Date nowTime = new Date();
		SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd");
		String format = time.format(nowTime);
		long nowdays = getDays(format);
		if((nowdays - days) > 7 ){
			return true;
		} else {
			return false;
		}		
	}
	
	@Test
	public void run(){
		String fIds = "1231";
		Integer fileId = Integer.parseInt(fIds, 10);
		System.out.println(fileId);
	}
}
