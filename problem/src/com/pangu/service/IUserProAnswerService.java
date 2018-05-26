package com.pangu.service;

import java.util.List;

import com.pangu.po.TUserProAnswer;
import com.pangu.po.TUserProAnswerExample;

public interface IUserProAnswerService {

	List<TUserProAnswer> selectByExample(TUserProAnswerExample example);
	
	TUserProAnswer selectByPrimaryKey(Long idIndex);
	
	int insertSelective(TUserProAnswer record);
}
