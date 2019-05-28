package com.weshare.utils;

import java.util.Random;

import org.junit.Test;

/**
 * 生成页数工具类
* <p>Title: PageUtils</p>
* <p>Description: </p>
* <p>Project: WeShare</p>
* @author 印国林
* @date 2018年3月26日下午12:54:51
 */
public class PageUtils {

	
	public static long getPage(long allPage , long nowPage){
		Random random = new Random();
        int s = random.nextInt((int)allPage);
        if(s == nowPage){
        	return s+1;
        }else{
        	return s;
        }
	}
	

}
