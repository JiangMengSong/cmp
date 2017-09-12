package com.hfxt.cmp.service.studnet;

import com.hfxt.cmp.model.StuExperiment;

import java.util.List;

public interface StuExperimentService {
    List<StuExperiment> getStuExperiment();

    int addStuExperiment(StuExperiment stuExp);

    int updateStuExperiment(StuExperiment stuExp);

    int delStuExperiment(Integer expId);
}
