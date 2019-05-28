package com.weshare.mapper;

import com.weshare.pojo.WsFocus;
import com.weshare.pojo.WsFocusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WsFocusMapper {
    int countByExample(WsFocusExample example);

    int deleteByExample(WsFocusExample example);

    int insert(WsFocus record);

    int insertSelective(WsFocus record);

    List<WsFocus> selectByExample(WsFocusExample example);

    int updateByExampleSelective(@Param("record") WsFocus record, @Param("example") WsFocusExample example);

    int updateByExample(@Param("record") WsFocus record, @Param("example") WsFocusExample example);
}