package com.pangu.dao;

import com.pangu.po.TAnswer;
import com.pangu.po.TAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAnswerMapper {
    int countByExample(TAnswerExample example);

    int deleteByExample(TAnswerExample example);

    int deleteByPrimaryKey(Long idIndex);

    int insert(TAnswer record);

    int insertSelective(TAnswer record);

    List<TAnswer> selectByExample(TAnswerExample example);

    TAnswer selectByPrimaryKey(Long idIndex);

    int updateByExampleSelective(@Param("record") TAnswer record, @Param("example") TAnswerExample example);

    int updateByExample(@Param("record") TAnswer record, @Param("example") TAnswerExample example);

    int updateByPrimaryKeySelective(TAnswer record);

    int updateByPrimaryKey(TAnswer record);
}