package com.hfxt.cmp.mapper;

import com.hfxt.cmp.model.StuExperiment;

public interface StuExperimentMapper {
    int deleteByPrimaryKey(Integer expid);

    int insert(StuExperiment record);

    int insertSelective(StuExperiment record);

    StuExperiment selectByPrimaryKey(Integer expid);

    int updateByPrimaryKeySelective(StuExperiment record);

    int updateByPrimaryKey(StuExperiment record);
}