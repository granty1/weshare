package com.weshare.mapper;

import java.util.List;

import com.weshare.pojo.Num;
import com.weshare.pojo.WsWebCountCustom;

public interface WsWebcountMapperCustom {
    
	public List<WsWebCountCustom> findWebCount(String time);
	
	public List<Num> findCountByOccu();
	
	public List<Num> findCountByFileKind();
}