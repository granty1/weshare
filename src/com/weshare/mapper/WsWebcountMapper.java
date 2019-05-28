package com.weshare.mapper;

import com.weshare.pojo.WsWebcount;
import com.weshare.pojo.WsWebcountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WsWebcountMapper {
    int countByExample(WsWebcountExample example);

    int deleteByExample(WsWebcountExample example);

    int insert(WsWebcount record);

    int insertSelective(WsWebcount record);

    List<WsWebcount> selectByExample(WsWebcountExample example);

    int updateByExampleSelective(@Param("record") WsWebcount record, @Param("example") WsWebcountExample example);

    int updateByExample(@Param("record") WsWebcount record, @Param("example") WsWebcountExample example);
}