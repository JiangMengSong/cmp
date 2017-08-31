package com.hfxt.cmp.mapper;

import com.hfxt.cmp.model.Interview;

public interface InterviewMapper {
    int deleteByPrimaryKey(Integer inteid);

    int insert(Interview record);

    int insertSelective(Interview record);

    Interview selectByPrimaryKey(Integer inteid);

    int updateByPrimaryKeySelective(Interview record);

    int updateByPrimaryKey(Interview record);
}