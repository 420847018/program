package com.pangu.dao;

import com.pangu.po.TProblem;
import com.pangu.po.TProblemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TProblemMapper {
    int countByExample(TProblemExample example);

    int deleteByExample(TProblemExample example);

    int deleteByPrimaryKey(Long idIndex);

    int insert(TProblem record);

    int insertSelective(TProblem record);

    List<TProblem> selectByExample(TProblemExample example);

    TProblem selectByPrimaryKey(Long idIndex);

    int updateByExampleSelective(@Param("record") TProblem record, @Param("example") TProblemExample example);

    int updateByExample(@Param("record") TProblem record, @Param("example") TProblemExample example);

    int updateByPrimaryKeySelective(TProblem record);

    int updateByPrimaryKey(TProblem record);
}