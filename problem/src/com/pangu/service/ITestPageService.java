package com.pangu.service;

import java.util.List;

import com.pangu.po.TTestPage;
import com.pangu.po.TTestPageExample;

public interface ITestPageService {

	List<TTestPage> selectByExample(TTestPageExample example);
	
	TTestPage selectByPrimaryKey(Long idIndex);
	
	int insertSelective(TTestPage record);
	
	int deleteByPrimaryKey(Long idIndex);
}
