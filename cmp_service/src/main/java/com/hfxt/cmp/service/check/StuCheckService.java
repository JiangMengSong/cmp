package com.hfxt.cmp.service.check;

import com.hfxt.cmp.model.EmpChecking;
import com.hfxt.cmp.model.StuChecking;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/9/4 0004.
 */
@Transactional
public interface StuCheckService {
    List<StuChecking> getStuCheck(StuChecking  stuChecking);

    int delete(Integer stucheckid);

    int update(StuChecking  stuChecking);

    int insert(StuChecking  stuChecking);

    StuChecking getCheckById(Integer stucheckid);
}
