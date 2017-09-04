package com.hfxt.cmp.mapper;

import com.hfxt.cmp.model.StuExperiment;

import java.util.List;

public interface StuExperimentMapper {
    int deleteByPrimaryKey(Integer expid);

    int insert(StuExperiment record);

    int insertSelective(StuExperiment record);

    StuExperiment selectByPrimaryKey(Integer expid);

    int updateByPrimaryKeySelective(StuExperiment record);

    int updateByPrimaryKey(StuExperiment record);

    /**
     * 查询所有上机
     */
    List<StuExperiment> getStuExperiment();
}