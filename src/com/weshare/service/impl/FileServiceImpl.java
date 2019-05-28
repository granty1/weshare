package com.weshare.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.weshare.mapper.WsCollectMapper;
import com.weshare.mapper.WsFileMapper;
import com.weshare.mapper.WsFileMapperCustom;
import com.weshare.mapper.WsUserMapper;
import com.weshare.pojo.PageResult;
import com.weshare.pojo.WsCollectExample;
import com.weshare.pojo.WsFile;
import com.weshare.pojo.WsFileCustom;
import com.weshare.pojo.WsFileExample;
import com.weshare.pojo.WsUser;
import com.weshare.pojo.WsUserExample;
import com.weshare.pojo.WsUserExample.Criteria;
import com.weshare.service.FileService;
import com.weshare.utils.TimeUtils;
import com.weshare.utils.WeShareResult;
/**
 * 文件相关操作ServiceImpl
* <p>Title: FileServiceImpl</p>
* <p>Description: </p>
* <p>Project: WeShare</p>
* @author 印国林
* @date 2018年3月9日下午12:42:38
 */
@Service
public class FileServiceImpl implements FileService {
	
	@Autowired
	private WsUserMapper wsUserMapper;
	
	@Autowired
	private WsFileMapper wsFileMapper;
	
	@Autowired
	private WsCollectMapper wsCollectMapper;
	
	@Autowired
	private WsFileMapperCustom wsFileMapperCustom;

	@Override
	public WeShareResult uploadFile(MultipartFile file, String username, WsFile wsFile, String realPath) {
		WsUserExample example = new WsUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<WsUser> selectByExample = wsUserMapper.selectByExample(example);
		WsUser wsUser = selectByExample.get(0);
		Long uId = wsUser.getuId();

		String filename = file.getOriginalFilename();

		File f = new File(realPath);

		if (!file.isEmpty()) {
			try {
				FileOutputStream fos = new FileOutputStream(realPath + "/" + filename);
				InputStream in = file.getInputStream();
				int b = 0;
				while ((b = in.read()) != -1) {
					fos.write(b);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		wsFile.setuId(uId);
		wsFile.setfCreat(TimeUtils.getNowTime());
		long size = file.getSize();
		double s = size / 1024;
		wsFile.setfSize(s);
		wsFile.setfName(filename);
		wsFile.setfPath(realPath + "/" + filename);
		wsFile.setfStatus(2);
		wsFile.setfDownnum((long) 0);
		wsFileMapper.insert(wsFile);
		
		return WeShareResult.ok(true);
	}
	
	@Override
	public WeShareResult uploadItemHeadImg(long uId, String path, MultipartFile file) {
		//获取文件名
		String filename = file.getOriginalFilename();
		//如果文件对象不为空
		if (!file.isEmpty()) {
			try {								
				//上传头像到指定目录下
				FileOutputStream fos = new FileOutputStream(path + "/" + filename);
				InputStream in = file.getInputStream();
				int b = 0;
				while ((b = in.read()) != -1) {
					fos.write(b);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			//上传完，将id 为uId的用户的u_head信息补全
			WsUser selectByPrimaryKey = wsUserMapper.selectByPrimaryKey(uId);
			selectByPrimaryKey.setuHead(filename);
			//再将根据uId查到的对象更新到数据库中去
			wsUserMapper.updateByPrimaryKey(selectByPrimaryKey);
		}
		return WeShareResult.ok(true);
	}


	@Override
	public List<WsFile> selectByUserId(long userId) {
		WsFileExample example = new WsFileExample();
		com.weshare.pojo.WsFileExample.Criteria criteria = example.createCriteria();
		criteria.andUIdEqualTo(userId);
		List<WsFile> list = wsFileMapper.selectByExample(example);
		return list;
	}

	@Override
	public WsFile getFileByFileName(String fileName) {
		WsFileExample example = new WsFileExample();
		com.weshare.pojo.WsFileExample.Criteria criteria = example.createCriteria();
		criteria.andFNameEqualTo(fileName);
		List<WsFile> list = wsFileMapper.selectByExample(example);
		return list.get(0);
	}

	@Override
	public List<WsFile> getFileByFileKind(String fileKind) {
		WsFileExample example = new WsFileExample();
		com.weshare.pojo.WsFileExample.Criteria criteria = example.createCriteria();
		criteria.andFKindEqualTo(fileKind);
		List<WsFile> selectByExample = wsFileMapper.selectByExample(example);
		return selectByExample;
	}

	@Override
	public List<WsFile> getAllFile() {
		List<WsFile> selectByExample = wsFileMapper.selectAllFile();
		return selectByExample;
	}
	
	@Override
	public List<WsFile> getAllFileByPage(long page) {
		List<WsFile> selectByExample = wsFileMapper.selectAllFileByPage(page*10+1);
		return selectByExample;
	}

	@Override
	public WsFile getFileByPrimaryKey(long fileId) {
		WsFile selectByPrimaryKey = wsFileMapper.selectByPrimaryKey(fileId);
		return selectByPrimaryKey;
	}

	@Override
	public List<WsFile> getFileListByKeyWord(String keyWord) {
		List<WsFile> selectByKeyWord = wsFileMapper.selectByKeyWord(keyWord);
		return selectByKeyWord;
	}

	@Override
	public void upDateFile(WsFile file) {
		wsFileMapper.updateByPrimaryKey(file);	
	}

	@Override
	public void deleteFileByFileName(String fileName) {
		WsFileExample example = new WsFileExample();
		com.weshare.pojo.WsFileExample.Criteria criteria = example.createCriteria();
		criteria.andFNameEqualTo(fileName);
		wsFileMapper.deleteByExample(example);		
	}

	@Override
	public List<WsFile> getTop3File() {
		List<WsFile> selectTop3File = wsFileMapper.selectTop3File();
		return selectTop3File;
	}

	@Override
	public void deleteFileByFid(long fId) {		
		//先删除所有收藏该资源的记录
		WsCollectExample example1 = new WsCollectExample();
		com.weshare.pojo.WsCollectExample.Criteria createCriteria2 = example1.createCriteria();
		createCriteria2.andFIdEqualTo(fId);
		wsCollectMapper.deleteByExample(example1);
		WsFileExample example = new WsFileExample();
		com.weshare.pojo.WsFileExample.Criteria createCriteria = example.createCriteria();
		createCriteria.andFIdEqualTo(fId);
		wsFileMapper.deleteByExample(example);
		
	}

	@Override
	public PageResult findFileManagerList(int pageNum,int pageSize,WsFileCustom wsFileCustom) {
		PageHelper.startPage(pageNum, pageSize);
		Page<WsFileCustom> list = (Page<WsFileCustom>) wsFileMapperCustom.findFileManagerList(wsFileCustom);
		return new PageResult(list.getTotal(), list.getResult());
	}

	@Override
	public PageResult findFilePassList(int pageNum, int pageSize,WsFileCustom wsFileCustom) {
		PageHelper.startPage(pageNum, pageSize);
		Page<WsFileCustom> list = (Page<WsFileCustom>) wsFileMapperCustom.findFilePassList(wsFileCustom);
		return new PageResult(list.getTotal(), list.getResult());
	}

	@Override
	public WeShareResult passFile(Long fId) {
		WsFile wsFile = wsFileMapper.selectByPrimaryKey(fId);
		wsFile.setfStatus(1);
		wsFileMapper.updateByPrimaryKey(wsFile);
		return new WeShareResult().ok();
	}

	


}
