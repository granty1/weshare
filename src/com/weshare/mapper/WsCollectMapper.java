package com.weshare.mapper;

import com.weshare.pojo.WsCollect;
import com.weshare.pojo.WsCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WsCollectMapper {
    int countByExample(WsCollectExample example);

    int deleteByExample(WsCollectExample example);

    int insert(WsCollect record);

    int insertSelective(WsCollect record);

    List<WsCollect> selectByExample(WsCollectExample example);

    int updateByExampleSelective(@Param("record") WsCollect record, @Param("example") WsCollectExample example);

    int updateByExample(@Param("record") WsCollect record, @Param("example") WsCollectExample example);
}