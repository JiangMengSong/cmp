package com.hfxt.cmp.service.check;

import com.hfxt.cmp.model.EmpChecking;
import com.hfxt.cmp.model.StuChecking;
import com.hfxt.cmp.search.Search;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;

/**
 * Created by Administrator on 2017/9/4 0004.
 */
@Transactional
public interface StuCheckService {
    List<StuChecking> getStuCheck(Search stuChecking);

    int delete(Integer stucheckid);

    int update(StuChecking stuChecking);

    int insert(StuChecking stuChecking);

    StuChecking getCheckById(Integer stucheckid);

    int insertAllemp(InputStream in, MultipartFile file) throws Exception;
}
