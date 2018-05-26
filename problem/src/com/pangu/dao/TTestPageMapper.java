package com.pangu.dao;

import com.pangu.po.TTestPage;
import com.pangu.po.TTestPageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTestPageMapper {
    int countByExample(TTestPageExample example);

    int deleteByExample(TTestPageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TTestPage record);

    int insertSelective(TTestPage record);

    List<TTestPage> selectByExample(TTestPageExample example);

    TTestPage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TTestPage record, @Param("example") TTestPageExample example);

    int updateByExample(@Param("record") TTestPage record, @Param("example") TTestPageExample example);

    int updateByPrimaryKeySelective(TTestPage record);

    int updateByPrimaryKey(TTestPage record);
}