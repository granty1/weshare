package com.weshare.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class TimeUtils {
	
	
	
	public static String getNowTime(){
		Date nowTime=new Date(); 
		SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd"); 
		return time.format(nowTime);
	}
	


	
	public static String getPriLetterTime(){
		Date nowTime = new Date();
		SimpleDateFormat time = new SimpleDateFormat("yyyy年MM月dd日  HH时mm分");
		return time.format(nowTime);
	}
	
	
	public static String getNewTime(){
		String nowTime = TimeUtils.getNowTime();
		String[] split = nowTime.split("-");
		int day = Integer.parseInt(split[2], 10);
		int  newday = day-7;
		if(newday>0){
		String newTime = split[0]+"-"+split[1]+"-"+newday;
		
		return newTime;	
		} else{
			int mouth = Integer.parseInt(split[1], 10);
			mouth = mouth-1;
			newday = 31 + newday;
			String newTime = split[0]+"-0"+mouth+"-"+newday;
			return newTime;
		}
	}		
}
