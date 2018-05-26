package com.pangu.service.impl;



import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pangu.dao.IProblemDao;
import com.pangu.dao.TProblemMapper;
import com.pangu.po.TProblem;
import com.pangu.po.TProblemExample;
import com.pangu.service.IProblemService;

@Service("problemService")
public class ProblemService implements IProblemService{

	@Autowired
	private TProblemMapper tProblemMapper;
	@Autowired
	private IProblemDao problemDao;

	public List<TProblem> selectByExample(TProblemExample example){
		return tProblemMapper.selectByExample(example);
	}
	
	public TProblem selectByPrimaryKey(Long idIndex){
		return tProblemMapper.selectByPrimaryKey(idIndex);
	}
	
	public int insertSelective(TProblem record){
		return tProblemMapper.insertSelective(record);
	}
	
	public List<HashMap<String, Object>> findProblemUserAnswerNum(long pro_id){
		return problemDao.findProblemUserAnswerNum(pro_id);
	}
	
	public int deleteByPrimaryKey(Long idIndex){
		return tProblemMapper.deleteByPrimaryKey(idIndex);
	}

}
