package com.hfxt.cmp.mapper;

import com.hfxt.cmp.model.StuChecking;

public interface StuCheckingMapper {
    int deleteByPrimaryKey(Integer stucheckingid);

    int insert(StuChecking record);

    int insertSelective(StuChecking record);

    StuChecking selectByPrimaryKey(Integer stucheckingid);

    int updateByPrimaryKeySelective(StuChecking record);

    int updateByPrimaryKey(StuChecking record);
}