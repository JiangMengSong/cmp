
package com.hfxt.cmp.model.search;

/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime：2017-08-28
 */
public class InterviewSearch extends BaseSearch {


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
     * interview_time
	 * dbValue = thisValue (yyyy-MM-dd)
	 */
    private java.util.Date eqInterviewTime; 
    /**
	 * dbValue >= thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date geInterviewTime;
    /**
	 * dbValue < thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date ltInterviewTime;
    /**
     *student_id(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqStudentId;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neStudentId;
    /**
     * desc(765)
	 * dbValue == thisValue
	 */
    private String eqDesc;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkDesc;
    /**
     *employee_id(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqEmployeeId;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neEmployeeId;
    /**
     *creator_id(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqCreatorId;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neCreatorId;
    /**
     * create_time
	 * dbValue = thisValue (yyyy-MM-dd)
	 */
    private java.util.Date eqCreateTime; 
    /**
	 * dbValue >= thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date geCreateTime;
    /**
	 * dbValue < thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date ltCreateTime;
    /**
     *updater_id(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqUpdaterId;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neUpdaterId;
    /**
     * update_time
	 * dbValue = thisValue (yyyy-MM-dd)
	 */
    private java.util.Date eqUpdateTime; 
    /**
	 * dbValue >= thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date geUpdateTime;
    /**
	 * dbValue < thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date ltUpdateTime;
    /**
     *clazz_id(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqClazzId;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neClazzId;

    
    public Integer getEqId() {
        return eqId;
    }
    public Integer getNeId() {
        return neId;
    }
    
    public java.util.Date getEqInterviewTime() {
        return eqInterviewTime;
    }
    public java.util.Date getGeInterviewTime() {
        return geInterviewTime;
    }
    public java.util.Date getLtInterviewTime() {
        return ltInterviewTime;
    }
    
    public Integer getEqStudentId() {
        return eqStudentId;
    }
    public Integer getNeStudentId() {
        return neStudentId;
    }
    
    public String getEqDesc() {
        return eqDesc;
    }
    public String getLkDesc() {
        return lkDesc;
    }
    
    public Integer getEqEmployeeId() {
        return eqEmployeeId;
    }
    public Integer getNeEmployeeId() {
        return neEmployeeId;
    }
    
    public Integer getEqCreatorId() {
        return eqCreatorId;
    }
    public Integer getNeCreatorId() {
        return neCreatorId;
    }
    
    public java.util.Date getEqCreateTime() {
        return eqCreateTime;
    }
    public java.util.Date getGeCreateTime() {
        return geCreateTime;
    }
    public java.util.Date getLtCreateTime() {
        return ltCreateTime;
    }
    
    public Integer getEqUpdaterId() {
        return eqUpdaterId;
    }
    public Integer getNeUpdaterId() {
        return neUpdaterId;
    }
    
    public java.util.Date getEqUpdateTime() {
        return eqUpdateTime;
    }
    public java.util.Date getGeUpdateTime() {
        return geUpdateTime;
    }
    public java.util.Date getLtUpdateTime() {
        return ltUpdateTime;
    }
    
    public Integer getEqClazzId() {
        return eqClazzId;
    }
    public Integer getNeClazzId() {
        return neClazzId;
    }
    public void setEqId(Integer eqId) {
		this.eqId = eqId;
	}
    public void setNeId(Integer neId) {
		this.neId = neId;
	}
    public void setEqInterviewTime(java.util.Date eqInterviewTime) {
		this.eqInterviewTime = eqInterviewTime;
	}
    public void setGeInterviewTime(java.util.Date geInterviewTime) {
		this.geInterviewTime = geInterviewTime;
	}
    public void setLtInterviewTime(java.util.Date ltInterviewTime) {
		this.ltInterviewTime = ltInterviewTime;
	}
    public void setEqStudentId(Integer eqStudentId) {
		this.eqStudentId = eqStudentId;
	}
    public void setNeStudentId(Integer neStudentId) {
		this.neStudentId = neStudentId;
	}

	public void setEqDesc(String eqDesc) {
		this.eqDesc = eqDesc;
	}
    public void setLkDesc(String lkDesc) {
		this.lkDesc = lkDesc;
	}
    public void setEqEmployeeId(Integer eqEmployeeId) {
		this.eqEmployeeId = eqEmployeeId;
	}
    public void setNeEmployeeId(Integer neEmployeeId) {
		this.neEmployeeId = neEmployeeId;
	}
    public void setEqCreatorId(Integer eqCreatorId) {
		this.eqCreatorId = eqCreatorId;
	}
    public void setNeCreatorId(Integer neCreatorId) {
		this.neCreatorId = neCreatorId;
	}
    public void setEqCreateTime(java.util.Date eqCreateTime) {
		this.eqCreateTime = eqCreateTime;
	}
    public void setGeCreateTime(java.util.Date geCreateTime) {
		this.geCreateTime = geCreateTime;
	}
    public void setLtCreateTime(java.util.Date ltCreateTime) {
		this.ltCreateTime = ltCreateTime;
	}
    public void setEqUpdaterId(Integer eqUpdaterId) {
		this.eqUpdaterId = eqUpdaterId;
	}
    public void setNeUpdaterId(Integer neUpdaterId) {
		this.neUpdaterId = neUpdaterId;
	}
    public void setEqUpdateTime(java.util.Date eqUpdateTime) {
		this.eqUpdateTime = eqUpdateTime;
	}
    public void setGeUpdateTime(java.util.Date geUpdateTime) {
		this.geUpdateTime = geUpdateTime;
	}
    public void setLtUpdateTime(java.util.Date ltUpdateTime) {
		this.ltUpdateTime = ltUpdateTime;
	}
    public void setEqClazzId(Integer eqClazzId) {
		this.eqClazzId = eqClazzId;
	}
    public void setNeClazzId(Integer neClazzId) {
		this.neClazzId = neClazzId;
	}

}
