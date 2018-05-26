package com.pangu.service;

import java.util.List;

import com.pangu.po.TAnswer;
import com.pangu.po.TAnswerExample;

public interface IAnswerService {

	List<TAnswer> selectByExample(TAnswerExample example);
	
	TAnswer selectByPrimaryKey(Long idIndex);
	
	int insertSelective(TAnswer record);
}
