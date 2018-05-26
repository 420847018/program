package com.pangu.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pangu.dao.TTestPageMapper;
import com.pangu.po.TTestPage;
import com.pangu.po.TTestPageExample;
import com.pangu.service.ITestPageService;

@Service("testPageService")
public class TestPageService implements ITestPageService{

	@Autowired
	private TTestPageMapper TTestPageMapper;
	

	public List<TTestPage> selectByExample(TTestPageExample example){
		return TTestPageMapper.selectByExample(example);
	}
	
	public TTestPage selectByPrimaryKey(Long idIndex){
		return TTestPageMapper.selectByPrimaryKey(idIndex);
	}
	
	public int insertSelective(TTestPage record){
		return TTestPageMapper.insertSelective(record);
	}
	
	public int deleteByPrimaryKey(Long idIndex){
		return TTestPageMapper.deleteByPrimaryKey(idIndex);
	}

}
