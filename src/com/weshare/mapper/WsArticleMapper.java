package com.weshare.mapper;

import com.weshare.pojo.WsArticle;
import com.weshare.pojo.WsArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WsArticleMapper {
    int countByExample(WsArticleExample example);

    int deleteByExample(WsArticleExample example);

    int deleteByPrimaryKey(Long aId);

    int insert(WsArticle record);

    int insertSelective(WsArticle record);

    List<WsArticle> selectByExampleWithBLOBs(WsArticleExample example);

    List<WsArticle> selectByExample(WsArticleExample example);

    WsArticle selectByPrimaryKey(Long aId);

    int updateByExampleSelective(@Param("record") WsArticle record, @Param("example") WsArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") WsArticle record, @Param("example") WsArticleExample example);

    int updateByExample(@Param("record") WsArticle record, @Param("example") WsArticleExample example);

    int updateByPrimaryKeySelective(WsArticle record);

    int updateByPrimaryKeyWithBLOBs(WsArticle record);

    int updateByPrimaryKey(WsArticle record);
}