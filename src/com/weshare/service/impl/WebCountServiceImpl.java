package com.weshare.service.impl;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weshare.mapper.WsWebcountMapper;
import com.weshare.mapper.WsWebcountMapperCustom;
import com.weshare.pojo.Data;
import com.weshare.pojo.DataGrid;
import com.weshare.pojo.Num;
import com.weshare.pojo.PieGrid;
import com.weshare.pojo.WsWebCountCustom;
import com.weshare.pojo.WsWebcount;
import com.weshare.pojo.WsWebcountExample;
import com.weshare.pojo.WsWebcountExample.Criteria;
import com.weshare.service.WebCountService;
import com.weshare.utils.TimeUtils;
@Service
public class WebCountServiceImpl implements WebCountService{
	
	@Autowired
	private WsWebcountMapper wsWebcountMapper;
	
	@Autowired
	private WsWebcountMapperCustom wsWebcountMapperCustom;

	@Override
	public void firstClicks(String time) {

		WsWebcount webcount = new WsWebcount();
		webcount.setClicks((long)1);
		webcount.setRegisternums((long)0);
		webcount.setDatatime(time);
		wsWebcountMapper.insert(webcount);
		
	}

	@Override
	public long getClicks(String time) {
		WsWebcountExample example = new WsWebcountExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andDatatimeEqualTo(time);
		List<WsWebcount> selectByExample = wsWebcountMapper.selectByExample(example);
		if(selectByExample!=null && selectByExample.size()==1){
			return selectByExample.get(0).getClicks();
		}
		return 0;
	}

	@Override
	public void addRegisterNums(String time) {
		//判断是否为今天第一次注册
		WsWebcountExample example = new WsWebcountExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andDatatimeLike("%"+time+"%");
		List<WsWebcount> selectByExample = wsWebcountMapper.selectByExample(example);
		if(selectByExample!=null && selectByExample.size()==1){
			//说明这不是今天第一次访问
			//那么将该天对应的注册量++
			WsWebcount wsWebcount = selectByExample.get(0);
			Long registernums = wsWebcount.getRegisternums();
			wsWebcount.setRegisternums(registernums+1);			
		}
		
	}

	@Override
	public void getRegisterNums() {		
	}

	@Override
	public WsWebcount findWebcountByDay(String day) {
		WsWebcountExample example = new WsWebcountExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andDatatimeLike("%"+day+"%");
		List<WsWebcount> selectByExample = wsWebcountMapper.selectByExample(example);
		if(selectByExample!=null && selectByExample.size()==1){
			return selectByExample.get(0);
		}
		return null;
	}

	@Override
	public void addClicks(String time) {
		WsWebcountExample example = new WsWebcountExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andDatatimeLike("%"+time+"%");
		List<WsWebcount> selectByExample = wsWebcountMapper.selectByExample(example);
		if(selectByExample!=null && selectByExample.size()==1){
			 WsWebcount wsWebcount = selectByExample.get(0);
			 Long clicks = wsWebcount.getClicks();
			 wsWebcount.setClicks(clicks+1);
			 wsWebcountMapper.updateByExample(wsWebcount, example);
		}
		
	}

	@Override
	public DataGrid findFWDataGrid() {
		List<WsWebCountCustom> list = wsWebcountMapperCustom.findWebCount(TimeUtils.getNewTime());
		
		DataGrid dataGrid = new DataGrid();
		List<Data> datas = new ArrayList<>();
		List clicks = new ArrayList<>(); ;
		for (WsWebCountCustom wsWebCountCustom : list) {						
			clicks.add(wsWebCountCustom.getClicks());			
		}
		Data data = new Data();
		data.setData(clicks);
		data.setName("网站访问量");
		datas.add(data);
		
		dataGrid.setDatas(datas);
		
		String nowTime = TimeUtils.getNewTime();
		String[] split = nowTime.split("-");
		Integer.parseUnsignedInt(split[0], 10);
		
		dataGrid.setDay(Integer.parseUnsignedInt(split[2], 10));
		dataGrid.setMouth(Integer.parseUnsignedInt(split[1], 10));
		dataGrid.setYear(Integer.parseUnsignedInt(split[0], 10));
		return dataGrid;
	}

	@Override
	public DataGrid findZCDataGrid() {
List<WsWebCountCustom> list = wsWebcountMapperCustom.findWebCount(TimeUtils.getNewTime());
		
		DataGrid dataGrid = new DataGrid();
		List<Data> datas = new ArrayList<>();
		List clicks = new ArrayList<>(); ;
		for (WsWebCountCustom wsWebCountCustom : list) {						
			clicks.add(wsWebCountCustom.getRegisternums());			
		}
		Data data = new Data();
		data.setData(clicks);
		data.setName("网站注册量");
		datas.add(data);
		
		dataGrid.setDatas(datas);
		
		String nowTime = TimeUtils.getNewTime();
		String[] split = nowTime.split("-");
		Integer.parseUnsignedInt(split[0], 10);
		
		dataGrid.setDay(Integer.parseUnsignedInt(split[2], 10));
		dataGrid.setMouth(Integer.parseUnsignedInt(split[1], 10));
		dataGrid.setYear(Integer.parseUnsignedInt(split[0], 10));
		return dataGrid;
	}

	@Override
	public PieGrid findZYZBPieGrid() {
		int sum = 0;
		PieGrid pieGrid = new PieGrid();
		List datas = new ArrayList<>();
		//先求出每个职业的用户的数量

		List<Num> occus = wsWebcountMapperCustom.findCountByOccu();
		for (Num num : occus) {
			sum += num.getNum();
		}

		for (Num num : occus) {
			float baifenbi = (float)num.getNum()/(float)sum;
			float bfb = (float)Math.round(baifenbi*10000)/10000;
			Data data = new Data();
			data.setY(bfb*100);
			data.setName(num.getOccu());
			datas.add(data);
		}		
		pieGrid.setName("用户职业占比");
		pieGrid.setType("pie");
		pieGrid.setData(datas);
		
		return pieGrid;
	}

	@Override
	public PieGrid findCountByFileKind() {
		int sum = 0;
		PieGrid pieGrid = new PieGrid();
		List datas = new ArrayList<>();

		List<Num> kinds = wsWebcountMapperCustom.findCountByFileKind();
		for (Num num : kinds) {
			sum += num.getNum();
		}

		for (Num num : kinds) {
			float baifenbi = (float)num.getNum()/(float)sum;
			float bfb = (float)Math.round(baifenbi*10000)/10000;
			Data data = new Data();
			data.setY(bfb*100);
			data.setName(num.getFilekind());
			datas.add(data);
		}		
		pieGrid.setName("资源种类占比");
		pieGrid.setType("pie");
		pieGrid.setData(datas);
		
		return pieGrid;
	}

}
