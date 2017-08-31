
package com.hfxt.cmp.model.search;

/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime：2017-08-28
 */
public class ClazzSearch extends BaseSearch {


    /**
     *id(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqId;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neId;
    /**
     * class_name(765)
	 * dbValue == thisValue
	 */
    private String eqClassName;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkClassName;
    /**
     *teacher_id(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqTeacherId;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neTeacherId;
    /**
     *teacher_class_id(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqTeacherClassId;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neTeacherClassId;
    /**
     *student_num(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqStudentNum;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neStudentNum;
    /**
     *major_id(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqMajorId;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neMajorId;
    /**
     * class_code(765)
	 * dbValue == thisValue
	 */
    private String eqClassCode;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkClassCode;
    /**
     * class_status(765)
	 * dbValue == thisValue
	 */
    private Integer eqClassStatus;
    /**
	 * dbValue like %thisValue%
	 */
    private Integer lkClassStatus;
    /**
     * class_beginTime
	 * dbValue = thisValue (yyyy-MM-dd)
	 */
    private java.util.Date eqClassBeginTime; 
    /**
	 * dbValue >= thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date geClassBeginTime;
    /**
	 * dbValue < thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date ltClassBeginTime;
    /**
     * class_endTime
	 * dbValue = thisValue (yyyy-MM-dd)
	 */
    private java.util.Date eqClassEndTime; 
    /**
	 * dbValue >= thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date geClassEndTime;
    /**
	 * dbValue < thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date ltClassEndTime;
    /**
     * desc(765)
	 * dbValue == thisValue
	 */
    private String eqDesc;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkDesc;

    
    public Integer getEqId() {
        return eqId;
    }
    public Integer getNeId() {
        return neId;
    }
    
    public String getEqClassName() {
        return eqClassName;
    }
    public String getLkClassName() {
        return lkClassName;
    }
    
    public Integer getEqTeacherId() {
        return eqTeacherId;
    }
    public Integer getNeTeacherId() {
        return neTeacherId;
    }
    
    public Integer getEqTeacherClassId() {
        return eqTeacherClassId;
    }
    public Integer getNeTeacherClassId() {
        return neTeacherClassId;
    }
    
    public Integer getEqStudentNum() {
        return eqStudentNum;
    }
    public Integer getNeStudentNum() {
        return neStudentNum;
    }
    
    public Integer getEqMajorId() {
        return eqMajorId;
    }
    public Integer getNeMajorId() {
        return neMajorId;
    }
    
    public String getEqClassCode() {
        return eqClassCode;
    }
    public String getLkClassCode() {
        return lkClassCode;
    }
    
    public Integer getEqClassStatus() {
        return eqClassStatus;
    }
    public Integer getLkClassStatus() {
        return lkClassStatus;
    }
    
    public java.util.Date getEqClassBeginTime() {
        return eqClassBeginTime;
    }
    public java.util.Date getGeClassBeginTime() {
        return geClassBeginTime;
    }
    public java.util.Date getLtClassBeginTime() {
        return ltClassBeginTime;
    }
    
    public java.util.Date getEqClassEndTime() {
        return eqClassEndTime;
    }
    public java.util.Date getGeClassEndTime() {
        return geClassEndTime;
    }
    public java.util.Date getLtClassEndTime() {
        return ltClassEndTime;
    }
    
    public String getEqDesc() {
        return eqDesc;
    }
    public String getLkDesc() {
        return lkDesc;
    }
    public void setEqId(Integer eqId) {
		this.eqId = eqId;
	}
    public void setNeId(Integer neId) {
		this.neId = neId;
	}

	public void setEqClassName(String eqClassName) {
		this.eqClassName = eqClassName;
	}
    public void setLkClassName(String lkClassName) {
		this.lkClassName = lkClassName;
	}
    public void setEqTeacherId(Integer eqTeacherId) {
		this.eqTeacherId = eqTeacherId;
	}
    public void setNeTeacherId(Integer neTeacherId) {
		this.neTeacherId = neTeacherId;
	}
    public void setEqTeacherClassId(Integer eqTeacherClassId) {
		this.eqTeacherClassId = eqTeacherClassId;
	}
    public void setNeTeacherClassId(Integer neTeacherClassId) {
		this.neTeacherClassId = neTeacherClassId;
	}
    public void setEqStudentNum(Integer eqStudentNum) {
		this.eqStudentNum = eqStudentNum;
	}
    public void setNeStudentNum(Integer neStudentNum) {
		this.neStudentNum = neStudentNum;
	}
    public void setEqMajorId(Integer eqMajorId) {
		this.eqMajorId = eqMajorId;
	}
    public void setNeMajorId(Integer neMajorId) {
		this.neMajorId = neMajorId;
	}

	public void setEqClassCode(String eqClassCode) {
		this.eqClassCode = eqClassCode;
	}
    public void setLkClassCode(String lkClassCode) {
		this.lkClassCode = lkClassCode;
	}

	public void setEqClassStatus(Integer eqClassStatus) {
		this.eqClassStatus = eqClassStatus;
	}
    public void setLkClassStatus(Integer lkClassStatus) {
		this.lkClassStatus = lkClassStatus;
	}
    public void setEqClassBeginTime(java.util.Date eqClassBeginTime) {
		this.eqClassBeginTime = eqClassBeginTime;
	}
    public void setGeClassBeginTime(java.util.Date geClassBeginTime) {
		this.geClassBeginTime = geClassBeginTime;
	}
    public void setLtClassBeginTime(java.util.Date ltClassBeginTime) {
		this.ltClassBeginTime = ltClassBeginTime;
	}
    public void setEqClassEndTime(java.util.Date eqClassEndTime) {
		this.eqClassEndTime = eqClassEndTime;
	}
    public void setGeClassEndTime(java.util.Date geClassEndTime) {
		this.geClassEndTime = geClassEndTime;
	}
    public void setLtClassEndTime(java.util.Date ltClassEndTime) {
		this.ltClassEndTime = ltClassEndTime;
	}

	public void setEqDesc(String eqDesc) {
		this.eqDesc = eqDesc;
	}
    public void setLkDesc(String lkDesc) {
		this.lkDesc = lkDesc;
	}

}
