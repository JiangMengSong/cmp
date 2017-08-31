package com.hfxt.cmp.mapper;

import com.hfxt.cmp.model.Subject;

public interface SubjectMapper {
    int deleteByPrimaryKey(Integer subid);

    int insert(Subject record);

    int insertSelective(Subject record);

    Subject selectByPrimaryKey(Integer subid);

    int updateByPrimaryKeySelective(Subject record);

    int updateByPrimaryKey(Subject record);
}