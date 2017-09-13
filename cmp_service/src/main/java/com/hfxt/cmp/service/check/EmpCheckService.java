package com.hfxt.cmp.service.check;

import com.hfxt.cmp.model.EmpChecking;
import com.hfxt.cmp.model.StuChecking;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/9/4 0004.
 */
@Transactional
public interface EmpCheckService {
    List<EmpChecking> getEmpCheck(EmpChecking  empChecking);

    int delete(Integer empcheckid);

    EmpChecking getCheckById(Integer empcheckid);

    int update(EmpChecking empChecking);

    int insert(EmpChecking empChecking);

}
