package com.hfxt.cmp.controller.clazz;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hfxt.cmp.controller.BaseController;
import org.apache.poi.ss.usermodel.Workbook;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hfxt.cmp.model.Clazz;
import com.hfxt.cmp.model.EchartData;
import com.hfxt.cmp.model.Series;
import com.hfxt.cmp.service.clazz.ClazzService;
import com.hfxt.cmp.service.major.MajorService;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
@RequestMapping("/clazz")
@Scope("prototype")
public class ClazzController extends BaseController {
	@Autowired
	ClazzService clazzService;
	@Autowired
	MajorService majorService;

    public ClazzController(HttpSession session) {
        super(session);
    }

    /**
     * 查看所有班级信息
     * @param clazz
     * @return
     */
	@RequestMapping(value = "/clazzList.html", produces = "text/html;charset=UTF-8")
	public String clazzList(HttpServletRequest request, Clazz clazz) {
        if (getPower().isLogin()) return toLogin;
        request.setAttribute("clazzList",clazzService.getClazz(clazz));
		return "clazz/clazz-list";
	}

	/**
     * 跳转编辑班级信息
     */
    @RequestMapping(value = "/toAddClazz/{clazzId}",produces = "text/html;charset=utf-8")
    public String toAddClazz(HttpServletRequest request, @PathVariable Integer clazzId){
        if (getPower().isLogin()) return toLogin;
        if (clazzId != null && clazzId > 0) request.setAttribute("clazz",clazzService.selectByPrimaryKey(clazzId));
        request.setAttribute("majorList", majorService.majorList());
        return "clazz/clazz-add"; // 返回hello页面
    }
    /**
     * 编辑班级信息
     */
    @RequestMapping(value = "/addClazz",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String addClazz(Clazz clazz,HttpSession session){
        if (getPower().isLogin()) return toLogin;
        JSONObject result = new JSONObject();
        result.put("flag",false);
        if(clazz == null) return result.toString();
        if(clazz.getClazzid() != null && clazz.getClazzid() > 0 && clazzService.updateByPrimaryKeySelective(clazz) > 0 ) result.put("flag",true);
        else if(clazzService.insert(clazz) > 0) result.put("flag",true);
        return result.toString();
    }

    /**
     * 根据Id删除
     */
    @RequestMapping(value = "/delClazz/{clazzId}",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String delClazz(HttpSession session, @PathVariable Integer clazzId){
        if (getPower().isLogin()) return toLogin;
        JSONObject result = new JSONObject();
        if (null == clazzId || clazzId < 1){
            result.put("flag",false);
        }else{
            result.put("flag",true);
        }
        return result.toString();
    }
    /*
     *
     * 详细信息
     */
    @RequestMapping(value = "/clazzshow/{clazzId}",produces = "text/html;charset=utf-8")
    public String showClazz(HttpServletRequest request, @PathVariable Integer clazzId){
        if (getPower().isLogin()) return toLogin;
        request.setAttribute("clazz",clazzService.selectByPrimaryKey(clazzId));
        return "clazz/clazz-show"; // 返回hello页面
    }
    //柱状图
    @RequestMapping(value = "/getEcharsByZhu")
    @ResponseBody
    public EchartData BarData(Clazz clazz) {
        System.out.println("柱状图");
        List<String> category = new ArrayList<String>();
        List<Long> serisData=new ArrayList<Long>();
        List<Clazz> list = clazzService.getClazz(clazz);
        for (Clazz totalNum : list) {
            category.add(totalNum.getClassname());
            serisData.add(Long.parseLong(totalNum.getStunum().toString()));
        }
        List<String> legend = new ArrayList<String>(Arrays.asList(new String[] { "总人数" }));// 数据分组
        List<Series> series = new ArrayList<Series>();// 纵坐标
        series.add(new Series("总人数", "bar", serisData));
        EchartData data = new EchartData(legend, category, series);
        return data;
    }
    /**
     * 饼状图
     * @param
     * @return
     */
    @RequestMapping("/getEcharsByBing")
    @ResponseBody
    public EchartData PieData(Clazz clazz) {
        List<String> legend = new ArrayList<String>();
        List<Map> serisData=new ArrayList<Map>();

        List<Clazz> list = clazzService.getClazz(clazz);
        for (Clazz visit : list) {
            Map map =new HashMap();
            legend.add(visit.getClassname());
            map.put("value", visit.getStunum());
            map.put("name",visit.getClassname());
            serisData.add(map);
        }
        List<Series> series = new ArrayList<Series>();// 纵坐标
        series.add(new Series("总人数", "pie",serisData));
        EchartData data = new EchartData(legend,null, series);
        return data;
    }


    @RequestMapping("/getEcharsByZhe")
    @ResponseBody
    public EchartData lineData(Clazz clazz) {
        System.out.println("折线图");
        List<String> category = new ArrayList<String>();
        List<Long> serisData=new ArrayList<Long>();
        List<Clazz> list = clazzService.getClazz(clazz);
        for (Clazz totalNum : list) {
            category.add(totalNum.getClassname());
            serisData.add(Long.parseLong(totalNum.getStunum().toString()));
        }
        List<String> legend = new ArrayList<String>(Arrays.asList(new String[] { "总人数" }));// 数据分组
        List<Series> series = new ArrayList<Series>();// 纵坐标
        series.add(new Series("总人数", "line", serisData));
        EchartData data = new EchartData(legend, category, series);
        return data;
    }

    @RequestMapping(value = "/zhu.html", produces = "text/html;charset=UTF-8")
    public String zhu() {
        return "clazz/zhutu";
    }
    @RequestMapping(value = "/zhe.html", produces = "text/html;charset=UTF-8")
    public String zhe() {
        return "clazz/zhetu";
    }
    @RequestMapping(value = "/bing.html", produces = "text/html;charset=UTF-8")
    public String bing() {
        return "clazz/bingtu";
    }
    //excel导出
    @RequestMapping(value="ajaxExport.html",method={RequestMethod.GET,RequestMethod.POST})
    public  String  ajaxUploadExcel2(HttpServletRequest request,
                                     HttpServletResponse response,Clazz search) throws Exception {
        System.out.println("通过 jquery.form.js 提供的ajax方式导出文件！");
        OutputStream os = null;
        Workbook wb = null;    //工作薄

        try {
            //模拟数据库取值
            List<Clazz> lo = clazzService.getClazz(search);

            //导出Excel文件数据
            ExportExcelUtil util = new ExportExcelUtil();
            File file =util.getExcelDemoFile("/ExcelDemoFile/22.xls");
            String sheetName="Sheet1";
            wb = util.writeNewExcel(file, sheetName,lo);

            String fileName="用户.xls";
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-disposition", "attachment;filename="+ URLEncoder.encode(fileName, "utf-8"));
            os = response.getOutputStream();
            wb.write(os);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            os.flush();
            wb.close();
            os.close();
        }
        return null;
    }
}
