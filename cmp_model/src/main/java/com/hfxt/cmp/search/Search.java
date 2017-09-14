package com.hfxt.cmp.search;

import com.hfxt.cmp.model.Clazz;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Search {
    /**
     * 姓名(模糊查询)
     */
    private String seaName;

    /**
     * 班级Id
     */
    private Integer clazzId;

    /**
     * 开始时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;

    /**
     * 结束时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;

    public Search() {
    }

    public Search(String seaName, Integer clazzId, Date startDate, Date endDate) {
        this.seaName = seaName;
        this.clazzId = clazzId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getSeaName() {
        return seaName;
    }

    public void setSeaName(String seaName) {
        this.seaName = seaName;
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
