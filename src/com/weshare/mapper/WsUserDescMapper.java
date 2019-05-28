package com.weshare.mapper;

import com.weshare.pojo.WsUserDesc;
import com.weshare.pojo.WsUserDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WsUserDescMapper {
    int countByExample(WsUserDescExample example);

    int deleteByExample(WsUserDescExample example);

    int deleteByPrimaryKey(Long uId);

    int insert(WsUserDesc record);

    int insertSelective(WsUserDesc record);

    List<WsUserDesc> selectByExample(WsUserDescExample example);

    WsUserDesc selectByPrimaryKey(Long uId);

    int updateByExampleSelective(@Param("record") WsUserDesc record, @Param("example") WsUserDescExample example);

    int updateByExample(@Param("record") WsUserDesc record, @Param("example") WsUserDescExample example);

    int updateByPrimaryKeySelective(WsUserDesc record);

    int updateByPrimaryKey(WsUserDesc record);
}