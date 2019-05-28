package com.weshare.mapper;

import com.weshare.pojo.WsUser;
import com.weshare.pojo.WsUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WsUserMapper {
    int countByExample(WsUserExample example);

    int deleteByExample(WsUserExample example);

    int deleteByPrimaryKey(Long uId);

    int insert(WsUser record);

    int insertSelective(WsUser record);

    List<WsUser> selectByExample(WsUserExample example);

    WsUser selectByPrimaryKey(Long uId);

    int updateByExampleSelective(@Param("record") WsUser record, @Param("example") WsUserExample example);

    int updateByExample(@Param("record") WsUser record, @Param("example") WsUserExample example);

    int updateByPrimaryKeySelective(WsUser record);

    int updateByPrimaryKey(WsUser record);
       
}