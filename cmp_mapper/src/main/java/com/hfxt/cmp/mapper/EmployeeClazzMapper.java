package com.hfxt.cmp.mapper;

import com.hfxt.cmp.model.EmployeeClazz;

public interface EmployeeClazzMapper {
    int deleteByPrimaryKey(Integer empclazzid);

    int insert(EmployeeClazz record);

    int insertSelective(EmployeeClazz record);

    EmployeeClazz selectByPrimaryKey(Integer empclazzid);

    int updateByPrimaryKeySelective(EmployeeClazz record);

    int updateByPrimaryKey(EmployeeClazz record);
}