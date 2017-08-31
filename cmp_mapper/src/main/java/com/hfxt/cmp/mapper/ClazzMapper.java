package com.hfxt.cmp.mapper;

import com.hfxt.cmp.model.Clazz;

public interface ClazzMapper {
    int deleteByPrimaryKey(Integer clazzid);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    Clazz selectByPrimaryKey(Integer clazzid);

    int updateByPrimaryKeySelective(Clazz record);

    int updateByPrimaryKey(Clazz record);
}