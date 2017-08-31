package com.hfxt.cmp.mapper;

import com.hfxt.cmp.model.EmpChecking;

public interface EmpCheckingMapper {
    int deleteByPrimaryKey(Integer empcheckingid);

    int insert(EmpChecking record);

    int insertSelective(EmpChecking record);

    EmpChecking selectByPrimaryKey(Integer empcheckingid);

    int updateByPrimaryKeySelective(EmpChecking record);

    int updateByPrimaryKey(EmpChecking record);
}