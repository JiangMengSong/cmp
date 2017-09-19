package com.hfxt.cmp.service.studnet.impl;

import com.hfxt.cmp.model.StuExperiment;
import com.hfxt.cmp.model.Student;
import com.hfxt.cmp.search.Search;
import com.hfxt.cmp.service.BaseService;
import com.hfxt.cmp.service.studnet.StuExperimentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("stuExperimentService")
public class StuExperimentServiceImpl extends BaseService implements StuExperimentService {
    @Override
    public List<StuExperiment> getStuExperiment() {
        return stuExperimentMapper.getStuExperiment();
    }

    @Override
    public int addStuExperiment(StuExperiment stuExp,Integer clazzId) {
        try{
            for (Student stu : studentMapper.getStudent(new Search(null,clazzId,null,null),stuExp.getEmployee())){
                stuExp.setStudent(stu);
                stuExperimentMapper.addStuExperiment(stuExp);
            }
            return 1;
        }catch (Exception e){
            return -1;
        }
    }

    @Override
    public int updateStuExperiment(StuExperiment stuExp) {
        return stuExperimentMapper.updateStuExperiment(stuExp);
    }

    @Override
    public int delStuExperiment(Integer expId) {
        return stuCheckinginMapper.deleteByPrimaryKey(expId);
    }
}
