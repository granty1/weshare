package com.weshare.mapper;

import com.weshare.pojo.WsFile;
import com.weshare.pojo.WsFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WsFileMapper {
    int countByExample(WsFileExample example);

    int deleteByExample(WsFileExample example);

    int deleteByPrimaryKey(Long fId);

    int insert(WsFile record);

    int insertSelective(WsFile record);

    List<WsFile> selectByExample(WsFileExample example);

    WsFile selectByPrimaryKey(Long fId);

    int updateByExampleSelective(@Param("record") WsFile record, @Param("example") WsFileExample example);

    int updateByExample(@Param("record") WsFile record, @Param("example") WsFileExample example);

    int updateByPrimaryKeySelective(WsFile record);

    int updateByPrimaryKey(WsFile record);
    
	List<WsFile> selectByKeyWord(String keyWord);
	
	List<WsFile> selectAllFile();
	
	List<WsFile> selectAllFileByPage(long page);
	
	List<WsFile> selectTop3File();

}