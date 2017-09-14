package com.hfxt.cmp.service.check.impl;

import com.hfxt.cmp.model.StuChecking;
import com.hfxt.cmp.search.Search;
import com.hfxt.cmp.service.BaseService;
import com.hfxt.cmp.service.check.StuCheckService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/9/5 0005.
 */
@Service("stuCheckService")
public class StuCheckServiceImpl extends BaseService implements StuCheckService
{
    @Override
    public List<StuChecking> getStuCheck(Search stuChecking) {
        return stuCheckinginMapper.getStuCheck(stuChecking);
    }

    @Override
    public int delete(Integer stucheckid) {
        return stuCheckinginMapper.deleteByPrimaryKey(stucheckid);
    }

    @Override
    public int update(StuChecking stuChecking) {
        return stuCheckinginMapper.update(stuChecking);
    }

    @Override
    public int insert(StuChecking stuChecking) {
        return stuCheckinginMapper.insert(stuChecking);
    }

    @Override
    public StuChecking getCheckById(Integer stucheckid) {
        return stuCheckinginMapper.selectByPrimaryKey(stucheckid);
    }
}
