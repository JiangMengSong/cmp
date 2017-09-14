package com.hfxt.cmp.mapper;

import com.hfxt.cmp.model.EmpChecking;
import com.hfxt.cmp.search.Search;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpCheckingMapper {
    int deleteByPrimaryKey(Integer empcheckingid);

    int insert(@Param("empcheck") EmpChecking empchecking);

    EmpChecking selectByPrimaryKey(Integer empcheckingid);

    int update(@Param("empcheck") EmpChecking empchecking);

    List<EmpChecking> getEmpCheck(@Param("empcheck") Search empchecking);
}