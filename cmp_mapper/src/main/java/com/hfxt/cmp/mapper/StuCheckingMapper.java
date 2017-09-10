package com.hfxt.cmp.mapper;

import com.hfxt.cmp.model.EmpChecking;
import com.hfxt.cmp.model.StuChecking;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StuCheckingMapper {
    int deleteByPrimaryKey(Integer stucheckingid);

    int insert(StuChecking record);

    int insertSelective(StuChecking record);

    StuChecking selectByPrimaryKey(Integer stucheckingid);

    int updateByPrimaryKeySelective(StuChecking record);

    int updateByPrimaryKey(StuChecking record);

    List<StuChecking> getStuCheck(@Param("stucheck") StuChecking  stuChecking);
}