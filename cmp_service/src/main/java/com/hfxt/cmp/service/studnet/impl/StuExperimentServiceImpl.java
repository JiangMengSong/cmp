package com.hfxt.cmp.service.studnet.impl;

import com.hfxt.cmp.model.StuExperiment;
import com.hfxt.cmp.service.BaseService;
import com.hfxt.cmp.service.studnet.StuExperimentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("stuExperimentService")
public class StuExperimentServiceImpl extends BaseService implements StuExperimentService {
    @Override
    public List<StuExperiment> getStuExperiment() {
        return stuExperimentMapper.getStuExperiment();
    }
}
