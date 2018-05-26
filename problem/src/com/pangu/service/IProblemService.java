package com.pangu.service;

import java.util.HashMap;
import java.util.List;

import com.pangu.po.TProblem;
import com.pangu.po.TProblemExample;

public interface IProblemService {

	List<TProblem> selectByExample(TProblemExample example);
	
	TProblem selectByPrimaryKey(Long idIndex);
	
	int insertSelective(TProblem record);
	
	List<HashMap<String, Object>> findProblemUserAnswerNum(long pro_id);
	
	int deleteByPrimaryKey(Long idIndex);
}
