package com.hfxt.cmp.service.check.impl;

import com.hfxt.cmp.model.EmpChecking;
import com.hfxt.cmp.model.StuChecking;
import com.hfxt.cmp.search.Search;
import com.hfxt.cmp.service.BaseService;
import com.hfxt.cmp.service.check.StuCheckService;
import common.poi.ExcelUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

    @Override
    public int insertAllemp(InputStream in, MultipartFile file) throws Exception {
        List<List<Object>> listob = ExcelUtil.getBankListByExcel(in,file.getOriginalFilename());
        List<StuChecking> stuCheckingList=new ArrayList<StuChecking>();

        for (int i = 0; i < listob.size(); i++) {
            List<Object> ob = listob.get(i);
            StuChecking stuChecking=new StuChecking();
            stuChecking.setStudent(studentMapper.getStuByName(String.valueOf(ob.get(0))));
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String dstr=String.valueOf(ob.get(1));
            java.util.Date date=sdf.parse(dstr);
            stuChecking.setChetime(date);
            stuChecking.setChestatus(Integer.parseInt(String.valueOf(ob.get(2))));
            stuChecking.setStucheckingdesc(String.valueOf(ob.get(3)));
            stuCheckingList.add(stuChecking);
        }
        return stuCheckinginMapper.insertAll(stuCheckingList);
    }
}
