package com.hfxt.cmp.mapper;

import com.hfxt.cmp.model.StuExperiment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StuExperimentMapper {
    /**
     * 获取所有上机
     */
    List<StuExperiment> getStuExperiment();

    /**
     * 发布上机
     */
    int addStuExperiment(@Param("stuExp")StuExperiment stuExp);

    /**
     * 修改上机信息
     */
    int updateStuExperiment(@Param("stuExp")StuExperiment stuExp);

    /**
     * 删除上机信息
     */
    int delStuExperiment(@Param("expId")Integer expId);
}