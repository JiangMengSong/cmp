package com.hfxt.cmp.mapper;

import java.util.List;

import com.hfxt.cmp.model.Clazz;

public interface ClazzMapper {
    int deleteByPrimaryKey(Integer clazzid);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    Clazz selectByPrimaryKey(Integer clazzid);

    int updateByPrimaryKeySelective(Clazz record);

    int updateByPrimaryKey(Clazz record);
    
    List<Clazz> getClazz(Clazz clazz);
}