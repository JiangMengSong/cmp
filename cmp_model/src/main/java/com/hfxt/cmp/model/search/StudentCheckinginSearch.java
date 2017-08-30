
package com.hfxt.cmp.model.search;

/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime：2017-08-28
 */
public class StudentCheckinginSearch extends BaseSearch {


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
     *student_id(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqStudentId;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neStudentId;
    /**
     * student_checkingin_time
	 * dbValue = thisValue (yyyy-MM-dd)
	 */
    private java.util.Date eqStudentCheckinginTime; 
    /**
	 * dbValue >= thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date geStudentCheckinginTime;
    /**
	 * dbValue < thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date ltStudentCheckinginTime;
    /**
     *student_checkingin_status(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqStudentCheckinginStatus;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neStudentCheckinginStatus;
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
     *classId(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqClassId;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neClassId;

    
    public Integer getEqId() {
        return eqId;
    }
    public Integer getNeId() {
        return neId;
    }
    
    public Integer getEqStudentId() {
        return eqStudentId;
    }
    public Integer getNeStudentId() {
        return neStudentId;
    }
    
    public java.util.Date getEqStudentCheckinginTime() {
        return eqStudentCheckinginTime;
    }
    public java.util.Date getGeStudentCheckinginTime() {
        return geStudentCheckinginTime;
    }
    public java.util.Date getLtStudentCheckinginTime() {
        return ltStudentCheckinginTime;
    }
    
    public Integer getEqStudentCheckinginStatus() {
        return eqStudentCheckinginStatus;
    }
    public Integer getNeStudentCheckinginStatus() {
        return neStudentCheckinginStatus;
    }
    
    public String getEqDesc() {
        return eqDesc;
    }
    public String getLkDesc() {
        return lkDesc;
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
    
    public Integer getEqClassId() {
        return eqClassId;
    }
    public Integer getNeClassId() {
        return neClassId;
    }
    public void setEqId(Integer eqId) {
		this.eqId = eqId;
	}
    public void setNeId(Integer neId) {
		this.neId = neId;
	}
    public void setEqStudentId(Integer eqStudentId) {
		this.eqStudentId = eqStudentId;
	}
    public void setNeStudentId(Integer neStudentId) {
		this.neStudentId = neStudentId;
	}
    public void setEqStudentCheckinginTime(java.util.Date eqStudentCheckinginTime) {
		this.eqStudentCheckinginTime = eqStudentCheckinginTime;
	}
    public void setGeStudentCheckinginTime(java.util.Date geStudentCheckinginTime) {
		this.geStudentCheckinginTime = geStudentCheckinginTime;
	}
    public void setLtStudentCheckinginTime(java.util.Date ltStudentCheckinginTime) {
		this.ltStudentCheckinginTime = ltStudentCheckinginTime;
	}
    public void setEqStudentCheckinginStatus(Integer eqStudentCheckinginStatus) {
		this.eqStudentCheckinginStatus = eqStudentCheckinginStatus;
	}
    public void setNeStudentCheckinginStatus(Integer neStudentCheckinginStatus) {
		this.neStudentCheckinginStatus = neStudentCheckinginStatus;
	}

	public void setEqDesc(String eqDesc) {
		this.eqDesc = eqDesc;
	}
    public void setLkDesc(String lkDesc) {
		this.lkDesc = lkDesc;
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
    public void setEqClassId(Integer eqClassId) {
		this.eqClassId = eqClassId;
	}
    public void setNeClassId(Integer neClassId) {
		this.neClassId = neClassId;
	}

}
