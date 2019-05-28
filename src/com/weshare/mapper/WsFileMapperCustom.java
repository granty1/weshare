package com.weshare.mapper;

import com.weshare.pojo.WsFile;
import com.weshare.pojo.WsFileCustom;
import com.weshare.pojo.WsFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WsFileMapperCustom {
    public List<WsFileCustom> findFileManagerList(WsFileCustom wsFileCustom);
    
    public List<WsFileCustom> findFilePassList(WsFileCustom wsFileCustom);

}