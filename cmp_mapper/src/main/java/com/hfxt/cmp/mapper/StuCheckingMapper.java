package com.hfxt.cmp.mapper;

import com.hfxt.cmp.model.EmpChecking;
import com.hfxt.cmp.model.StuChecking;
import com.hfxt.cmp.search.Search;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StuCheckingMapper {
    int deleteByPrimaryKey(Integer stucheckingid);

    int insert(@Param("stucheck") StuChecking stucheck);

    StuChecking selectByPrimaryKey(Integer stucheckingid);

    int update(@Param("stucheck") StuChecking stucheck);

    List<StuChecking> getStuCheck(@Param("stucheck") Search stucheck);

    int insertAll( List<StuChecking> empCheckingList);
}