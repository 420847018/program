package com.pangu.dao;

import com.pangu.po.TUserProAnswer;
import com.pangu.po.TUserProAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserProAnswerMapper {
    int countByExample(TUserProAnswerExample example);

    int deleteByExample(TUserProAnswerExample example);

    int deleteByPrimaryKey(Long idIndex);

    int insert(TUserProAnswer record);

    int insertSelective(TUserProAnswer record);

    List<TUserProAnswer> selectByExample(TUserProAnswerExample example);

    TUserProAnswer selectByPrimaryKey(Long idIndex);

    int updateByExampleSelective(@Param("record") TUserProAnswer record, @Param("example") TUserProAnswerExample example);

    int updateByExample(@Param("record") TUserProAnswer record, @Param("example") TUserProAnswerExample example);

    int updateByPrimaryKeySelective(TUserProAnswer record);

    int updateByPrimaryKey(TUserProAnswer record);
}