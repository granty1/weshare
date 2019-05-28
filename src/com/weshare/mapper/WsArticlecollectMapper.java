package com.weshare.mapper;

import com.weshare.pojo.WsArticlecollect;
import com.weshare.pojo.WsArticlecollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WsArticlecollectMapper {
    int countByExample(WsArticlecollectExample example);

    int deleteByExample(WsArticlecollectExample example);

    int insert(WsArticlecollect record);

    int insertSelective(WsArticlecollect record);

    List<WsArticlecollect> selectByExample(WsArticlecollectExample example);

    int updateByExampleSelective(@Param("record") WsArticlecollect record, @Param("example") WsArticlecollectExample example);

    int updateByExample(@Param("record") WsArticlecollect record, @Param("example") WsArticlecollectExample example);
}