package com.hfxt.cmp.mapper;

import com.hfxt.cmp.model.ExperimentType;

public interface ExperimentTypeMapper {
    int deleteByPrimaryKey(Integer typid);

    int insert(ExperimentType record);

    int insertSelective(ExperimentType record);

    ExperimentType selectByPrimaryKey(Integer typid);

    int updateByPrimaryKeySelective(ExperimentType record);

    int updateByPrimaryKey(ExperimentType record);
}