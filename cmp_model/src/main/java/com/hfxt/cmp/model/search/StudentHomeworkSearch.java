
package com.hfxt.cmp.model.search;

/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime：2017-08-28
 */
public class StudentHomeworkSearch extends BaseSearch {


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
     * student_homework_time
	 * dbValue = thisValue (yyyy-MM-dd)
	 */
    private java.util.Date eqStudentHomeworkTime; 
    /**
	 * dbValue >= thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date geStudentHomeworkTime;
    /**
	 * dbValue < thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date ltStudentHomeworkTime;
    /**
     *subject_id(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqSubjectId;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neSubjectId;
    /**
     * student_homework_content(765)
	 * dbValue == thisValue
	 */
    private String eqStudentHomeworkContent;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkStudentHomeworkContent;
    /**
     * student_homework_submit(765)
	 * dbValue == thisValue
	 */
    private String eqStudentHomeworkSubmit;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkStudentHomeworkSubmit;
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
     *class_homework_id(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqClassHomeworkId;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neClassHomeworkId;

    
    public Integer getEqId() {
        return eqId;
    }
    public Integer getNeId() {
        return neId;
    }
    
    public java.util.Date getEqStudentHomeworkTime() {
        return eqStudentHomeworkTime;
    }
    public java.util.Date getGeStudentHomeworkTime() {
        return geStudentHomeworkTime;
    }
    public java.util.Date getLtStudentHomeworkTime() {
        return ltStudentHomeworkTime;
    }
    
    public Integer getEqSubjectId() {
        return eqSubjectId;
    }
    public Integer getNeSubjectId() {
        return neSubjectId;
    }
    
    public String getEqStudentHomeworkContent() {
        return eqStudentHomeworkContent;
    }
    public String getLkStudentHomeworkContent() {
        return lkStudentHomeworkContent;
    }
    
    public String getEqStudentHomeworkSubmit() {
        return eqStudentHomeworkSubmit;
    }
    public String getLkStudentHomeworkSubmit() {
        return lkStudentHomeworkSubmit;
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
    
    public Integer getEqClassHomeworkId() {
        return eqClassHomeworkId;
    }
    public Integer getNeClassHomeworkId() {
        return neClassHomeworkId;
    }
    public void setEqId(Integer eqId) {
		this.eqId = eqId;
	}
    public void setNeId(Integer neId) {
		this.neId = neId;
	}
    public void setEqStudentHomeworkTime(java.util.Date eqStudentHomeworkTime) {
		this.eqStudentHomeworkTime = eqStudentHomeworkTime;
	}
    public void setGeStudentHomeworkTime(java.util.Date geStudentHomeworkTime) {
		this.geStudentHomeworkTime = geStudentHomeworkTime;
	}
    public void setLtStudentHomeworkTime(java.util.Date ltStudentHomeworkTime) {
		this.ltStudentHomeworkTime = ltStudentHomeworkTime;
	}
    public void setEqSubjectId(Integer eqSubjectId) {
		this.eqSubjectId = eqSubjectId;
	}
    public void setNeSubjectId(Integer neSubjectId) {
		this.neSubjectId = neSubjectId;
	}

	public void setEqStudentHomeworkContent(String eqStudentHomeworkContent) {
		this.eqStudentHomeworkContent = eqStudentHomeworkContent;
	}
    public void setLkStudentHomeworkContent(String lkStudentHomeworkContent) {
		this.lkStudentHomeworkContent = lkStudentHomeworkContent;
	}

	public void setEqStudentHomeworkSubmit(String eqStudentHomeworkSubmit) {
		this.eqStudentHomeworkSubmit = eqStudentHomeworkSubmit;
	}
    public void setLkStudentHomeworkSubmit(String lkStudentHomeworkSubmit) {
		this.lkStudentHomeworkSubmit = lkStudentHomeworkSubmit;
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
    public void setEqClassHomeworkId(Integer eqClassHomeworkId) {
		this.eqClassHomeworkId = eqClassHomeworkId;
	}
    public void setNeClassHomeworkId(Integer neClassHomeworkId) {
		this.neClassHomeworkId = neClassHomeworkId;
	}

}
