package com.pangu.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pangu.dao.TAnswerMapper;
import com.pangu.po.TAnswer;
import com.pangu.po.TAnswerExample;
import com.pangu.service.IAnswerService;

@Service("answerService")
public class AnswerService implements IAnswerService{

	@Autowired
	private TAnswerMapper tAnswerMapper;

	public List<TAnswer> selectByExample(TAnswerExample example){
		return tAnswerMapper.selectByExample(example);
	}
	
	public TAnswer selectByPrimaryKey(Long idIndex){
		return tAnswerMapper.selectByPrimaryKey(idIndex);
	}
	
	public int insertSelective(TAnswer record){
		return tAnswerMapper.insertSelective(record);
	}

}
