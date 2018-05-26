package com.pangu.dao;

import java.util.HashMap;
import java.util.List;


public interface IProblemDao {

	 List<HashMap<String,Object>> findProblemUserAnswerNum(long pro_id);
	 
}

