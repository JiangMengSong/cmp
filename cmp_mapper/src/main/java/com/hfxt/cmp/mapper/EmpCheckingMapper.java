package com.hfxt.cmp.mapper;

import com.hfxt.cmp.model.EmpChecking;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpCheckingMapper {
    int deleteByPrimaryKey(Integer empcheckingid);

    int insert(EmpChecking record);

    int insertSelective(EmpChecking record);

    EmpChecking selectByPrimaryKey(Integer empcheckingid);

    int updateByPrimaryKeySelective(EmpChecking record);

    int updateByPrimaryKey(EmpChecking record);

    List<EmpChecking> getEmpCheck(@Param("empcheck") EmpChecking  empcheck);
}