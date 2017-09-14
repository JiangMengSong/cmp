package com.hfxt.cmp.service.subject.impl;

import com.hfxt.cmp.model.Subject;
import com.hfxt.cmp.service.BaseService;
import com.hfxt.cmp.service.subject.SubjectService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by JQY on 2017/9/12.
 */
@Service("subjectService")
public class SubjectServiceImpl extends BaseService implements SubjectService {

    @Override
    public List<Subject> getAll() {
        return subMapper.getAll();
    }

    @Override
    public int deletesub(Integer subid) {
        return subMapper.deletesub(subid);
    }

    @Override
    public int addsub(Subject subject) {
        return subMapper.addsub(subject);
    }

    @Override
    public int updatesub(Subject subject) {
        return subMapper.updatesub(subject);
    }

    @Override
    public Subject selectbyname(String subname) {
        return subMapper.selectbyname(subname);
    }

    @Override
    public Subject selectbyid(Integer subid) {
        return subMapper.selectbyid(subid);
    }

    @Override
    public List<Subject> getlist(Subject subject) {
        return subMapper.getlist(subject);
    }
}
