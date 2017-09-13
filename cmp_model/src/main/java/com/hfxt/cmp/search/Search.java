package com.hfxt.cmp.search;

import com.hfxt.cmp.model.Clazz;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Search {
    /**
     * 姓名(模糊查询)
     */
    private String name;

    /**
     * 班级Id
     */
    private Integer clazzId;

    /**
     * 开始时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;

    /**
     * 结束时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;

    public Search() {
    }

    public Search(String name, Integer clazzId, Date startDate, Date endDate) {
        this.name = name;
        this.clazzId = clazzId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getClazzId() {
        return clazzId;
    }

    public void setClazzId(Integer clazzId) {
        this.clazzId = clazzId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
