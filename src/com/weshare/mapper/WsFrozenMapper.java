package com.weshare.mapper;

import com.weshare.pojo.WsFrozen;
import com.weshare.pojo.WsFrozenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WsFrozenMapper {
    int countByExample(WsFrozenExample example);

    int deleteByExample(WsFrozenExample example);

    int deleteByPrimaryKey(Long uId);

    int insert(WsFrozen record);

    int insertSelective(WsFrozen record);

    List<WsFrozen> selectByExample(WsFrozenExample example);

    WsFrozen selectByPrimaryKey(Long uId);

    int updateByExampleSelective(@Param("record") WsFrozen record, @Param("example") WsFrozenExample example);

    int updateByExample(@Param("record") WsFrozen record, @Param("example") WsFrozenExample example);

    int updateByPrimaryKeySelective(WsFrozen record);

    int updateByPrimaryKey(WsFrozen record);
}