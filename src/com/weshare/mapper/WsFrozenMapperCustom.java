package com.weshare.mapper;

import com.weshare.pojo.WsFrozen;
import com.weshare.pojo.WsFrozenCustom;
import com.weshare.pojo.WsFrozenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WsFrozenMapperCustom {
	
	public List<WsFrozenCustom> frozenUserList();
	
}