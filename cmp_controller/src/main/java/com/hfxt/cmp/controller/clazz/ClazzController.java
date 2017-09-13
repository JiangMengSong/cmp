package com.hfxt.cmp.controller.clazz;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hfxt.cmp.model.Clazz;
import com.hfxt.cmp.model.EchartData;
import com.hfxt.cmp.model.Series;
import com.hfxt.cmp.service.clazz.ClazzService;
import com.hfxt.cmp.service.major.MajorService;

@Controller
@RequestMapping("/clazz")
public class ClazzController {
	@Autowired
	ClazzService clazzService;
	@Autowired
	MajorService majorService;

    /**
     * 查看所有班级信息
     * @param clazz
     * @return
     */
	@RequestMapping(value = "/clazzList.html", produces = "text/html;charset=UTF-8")
	public String clazzList(HttpServletRequest request, Clazz clazz) {
        if (null == request.getSession().getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        request.setAttribute("clazzList",clazzService.getClazz(clazz));
		return "clazz/clazz-list";
	}

	/**
     * 跳转编辑班级信息
     */
    @RequestMapping(value = "/toAddClazz/{clazzId}",produces = "text/html;charset=utf-8")
    public String toAddClazz(HttpServletRequest request, @PathVariable Integer clazzId){
        if (null == request.getSession().getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
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
        if (null == session.getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
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
        if (null == session.getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        JSONObject result = new JSONObject();
        if (null == clazzId || clazzId < 1){
            result.put("data",false);
        }else{
            result.put("data",true);
        }
        return result.toString();
    }
    /*
     *
     * 详细信息
     */
    @RequestMapping(value = "/clazzshow/{clazzId}",produces = "text/html;charset=utf-8")
    public String showClazz(HttpServletRequest request, @PathVariable Integer clazzId){
        if (null == request.getSession().getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
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
     * @param <T>
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
}
