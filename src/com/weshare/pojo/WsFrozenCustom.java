package com.weshare.pojo;

/**
 * 用户账号冻结类包装类
* <p>Title: WsFrozenCustom</p>
* <p>Description: </p>
* <p>Project: WeShare</p>
* @author 印国林
* @date 2018年5月25日下午6:18:32
 */
public class WsFrozenCustom extends WsFrozen{
	
	//被冻结用户的用户名
	private String username;
	//被冻结用户的id
	private long id;
	//被冻结用户的冻结时间
	private String frozentime;
	//被冻结的理由
	private String frozencause;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrozentime() {
		return frozentime;
	}

	public void setFrozentime(String frozentime) {
		this.frozentime = frozentime;
	}

	public String getFrozencause() {
		return frozencause;
	}

	public void setFrozencause(String frozencause) {
		this.frozencause = frozencause;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	

}
