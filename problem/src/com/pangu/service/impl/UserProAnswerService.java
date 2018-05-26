package com.pangu.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pangu.dao.TUserProAnswerMapper;
import com.pangu.po.TUserProAnswer;
import com.pangu.po.TUserProAnswerExample;
import com.pangu.service.IUserProAnswerService;

@Service("userProAnswerService")
public class UserProAnswerService implements IUserProAnswerService{

	@Autowired
	private TUserProAnswerMapper tUserProAnswerMapper;

	public List<TUserProAnswer> selectByExample(TUserProAnswerExample example){
		return tUserProAnswerMapper.selectByExample(example);
	}
	
	public TUserProAnswer selectByPrimaryKey(Long idIndex){
		return tUserProAnswerMapper.selectByPrimaryKey(idIndex);
	}
	
	public int insertSelective(TUserProAnswer record){
		return tUserProAnswerMapper.insertSelective(record);
	}

}
