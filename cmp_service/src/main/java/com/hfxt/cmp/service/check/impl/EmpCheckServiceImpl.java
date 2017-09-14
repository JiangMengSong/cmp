package com.hfxt.cmp.service.check.impl;

import com.hfxt.cmp.mapper.EmpCheckingMapper;
import com.hfxt.cmp.mapper.EmployeeMapper;
import com.hfxt.cmp.model.EmpChecking;
import com.hfxt.cmp.model.StuChecking;
import com.hfxt.cmp.search.Search;
import com.hfxt.cmp.service.BaseService;
import com.hfxt.cmp.service.check.EmpCheckService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/9/4 0004.
 */
@Service("empCheckService")
public class EmpCheckServiceImpl extends BaseService implements EmpCheckService {
    @Override
    public List<EmpChecking> getEmpCheck(Search empChecking) {
        return  empCheckingMapper.getEmpCheck(empChecking);

    }

    @Override
    public int delete(Integer empcheckid) {
        return empCheckingMapper.deleteByPrimaryKey(empcheckid);
    }

    @Override
    public EmpChecking getCheckById(Integer empcheckid) {
        return empCheckingMapper.selectByPrimaryKey(empcheckid);
    }

    @Override
    public int update(EmpChecking empChecking) {
        return empCheckingMapper.update(empChecking);
    }

    @Override
    public int insert(EmpChecking empChecking) {
        return empCheckingMapper.insert(empChecking);
    }
}
