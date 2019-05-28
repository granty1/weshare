package com.weshare.utils;

import com.weshare.pojo.WsUser;
import com.weshare.pojo.WsUserDev;

/**
 * 用户工具类
* <p>Title: UserUtils</p>
* <p>Description: </p>
* <p>Project: WeShare</p>
* @author 印国林
* @date 2018年3月17日下午1:15:36
 */
public class UserUtils {

	public static void copy(WsUser user , WsUserDev userDev){
		userDev.setuHead(user.getuHead());
		userDev.setuId(user.getuId());
		userDev.setuIntegral(user.getuIntegral());
		userDev.setuOccu(user.getuOccu());
		userDev.setUsername(user.getUsername());
		userDev.setuSex(user.getuSex());
		userDev.setuSignature(user.getuSignature());
	}
}
