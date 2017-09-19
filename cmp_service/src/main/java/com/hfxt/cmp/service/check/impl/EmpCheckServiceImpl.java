package com.hfxt.cmp.service.check.impl;

import com.hfxt.cmp.mapper.EmpCheckingMapper;
import com.hfxt.cmp.mapper.EmployeeMapper;
import com.hfxt.cmp.model.EmpChecking;
import com.hfxt.cmp.model.StuChecking;
import com.hfxt.cmp.search.Search;
import com.hfxt.cmp.service.BaseService;
import com.hfxt.cmp.service.check.EmpCheckService;
import common.poi.ExcelUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

    @Override
    public int insertAllemp(InputStream in, MultipartFile file) throws Exception {
        List<List<Object>> listob = ExcelUtil.getBankListByExcel(in,file.getOriginalFilename());
        List<EmpChecking> empCheckingList=new ArrayList<EmpChecking>();

        for (int i = 0; i < listob.size(); i++) {
            List<Object> ob = listob.get(i);
            EmpChecking empChecking=new EmpChecking();
            empChecking.setEmployee(employeeMapper.getEmployeeByName(String.valueOf(ob.get(0))));
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String dstr=String.valueOf(ob.get(1));
            java.util.Date date=sdf.parse(dstr);
            empChecking.setChetime(date);
            empChecking.setChestatus(Integer.parseInt(String.valueOf(ob.get(2))));
            empChecking.setEmpcheckdesc(String.valueOf(ob.get(3)));
            empCheckingList.add(empChecking);
        }
       return empCheckingMapper.insertAll(empCheckingList);
    }


}
