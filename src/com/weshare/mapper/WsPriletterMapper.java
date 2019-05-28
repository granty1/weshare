package com.weshare.mapper;

import com.weshare.pojo.WsPriletter;
import com.weshare.pojo.WsPriletterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WsPriletterMapper {
    int countByExample(WsPriletterExample example);

    int deleteByExample(WsPriletterExample example);

    int deleteByPrimaryKey(Long pId);

    int insert(WsPriletter record);

    int insertSelective(WsPriletter record);

    List<WsPriletter> selectByExample(WsPriletterExample example);

    WsPriletter selectByPrimaryKey(Long pId);

    int updateByExampleSelective(@Param("record") WsPriletter record, @Param("example") WsPriletterExample example);

    int updateByExample(@Param("record") WsPriletter record, @Param("example") WsPriletterExample example);

    int updateByPrimaryKeySelective(WsPriletter record);

    int updateByPrimaryKey(WsPriletter record);
    
    List<WsPriletter> selectLetterByStatus(long userId);


    
}