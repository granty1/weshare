package com.weshare.utils;

import com.weshare.pojo.WsPriletter;
import com.weshare.pojo.WsPrilettershow;
import com.weshare.pojo.WsUser;

/**
 * 封装PriLettershow对象工具类
* <p>Title: PriLetterutils</p>
* <p>Description: </p>
* <p>Project: WeShare</p>
* @author 印国林
* @date 2018年3月25日下午10:44:56
 */
public class PriLetterutils {
	
	public static void  finishShow(WsPriletter pri, WsPrilettershow show ,WsUser user){
		show.setpId(pri.getpId());
		show.setpAddre(pri.getpAddre());
		show.setpCreat(pri.getpCreat());
		show.setpReci(pri.getpReci());
		show.setpStatus(pri.getpStatus());
		show.setpText(pri.getpText());
		show.setpTitle(pri.getpTitle());
		show.setpType(pri.getpType());
		show.setAuthorHead(user.getuHead());
		show.setAuthorName(user.getUsername());
	}

}
