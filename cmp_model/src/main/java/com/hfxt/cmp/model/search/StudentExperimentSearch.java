
package com.hfxt.cmp.model.search;

/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime：2017-08-28
 */
public class StudentExperimentSearch extends BaseSearch {


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
     *subject_id(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqSubjectId;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neSubjectId;
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
     * student_experiment_content(765)
	 * dbValue == thisValue
	 */
    private String eqStudentExperimentContent;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkStudentExperimentContent;
    /**
     * student_experiment_time
	 * dbValue = thisValue (yyyy-MM-dd)
	 */
    private java.util.Date eqStudentExperimentTime; 
    /**
	 * dbValue >= thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date geStudentExperimentTime;
    /**
	 * dbValue < thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date ltStudentExperimentTime;
    /**
     * student_experiment_submit(765)
	 * dbValue == thisValue
	 */
    private String eqStudentExperimentSubmit;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkStudentExperimentSubmit;
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
     *class_experiment_id(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqClassExperimentId;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neClassExperimentId;
    /**
     * statement(765)
	 * dbValue == thisValue
	 */
    private String eqStatement;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkStatement;

    
    public Integer getEqId() {
        return eqId;
    }
    public Integer getNeId() {
        return neId;
    }
    
    public Integer getEqSubjectId() {
        return eqSubjectId;
    }
    public Integer getNeSubjectId() {
        return neSubjectId;
    }
    
    public Integer getEqStudentId() {
        return eqStudentId;
    }
    public Integer getNeStudentId() {
        return neStudentId;
    }
    
    public String getEqStudentExperimentContent() {
        return eqStudentExperimentContent;
    }
    public String getLkStudentExperimentContent() {
        return lkStudentExperimentContent;
    }
    
    public java.util.Date getEqStudentExperimentTime() {
        return eqStudentExperimentTime;
    }
    public java.util.Date getGeStudentExperimentTime() {
        return geStudentExperimentTime;
    }
    public java.util.Date getLtStudentExperimentTime() {
        return ltStudentExperimentTime;
    }
    
    public String getEqStudentExperimentSubmit() {
        return eqStudentExperimentSubmit;
    }
    public String getLkStudentExperimentSubmit() {
        return lkStudentExperimentSubmit;
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
    
    public Integer getEqClassExperimentId() {
        return eqClassExperimentId;
    }
    public Integer getNeClassExperimentId() {
        return neClassExperimentId;
    }
    
    public String getEqStatement() {
        return eqStatement;
    }
    public String getLkStatement() {
        return lkStatement;
    }
    public void setEqId(Integer eqId) {
		this.eqId = eqId;
	}
    public void setNeId(Integer neId) {
		this.neId = neId;
	}
    public void setEqSubjectId(Integer eqSubjectId) {
		this.eqSubjectId = eqSubjectId;
	}
    public void setNeSubjectId(Integer neSubjectId) {
		this.neSubjectId = neSubjectId;
	}
    public void setEqStudentId(Integer eqStudentId) {
		this.eqStudentId = eqStudentId;
	}
    public void setNeStudentId(Integer neStudentId) {
		this.neStudentId = neStudentId;
	}

	public void setEqStudentExperimentContent(String eqStudentExperimentContent) {
		this.eqStudentExperimentContent = eqStudentExperimentContent;
	}
    public void setLkStudentExperimentContent(String lkStudentExperimentContent) {
		this.lkStudentExperimentContent = lkStudentExperimentContent;
	}
    public void setEqStudentExperimentTime(java.util.Date eqStudentExperimentTime) {
		this.eqStudentExperimentTime = eqStudentExperimentTime;
	}
    public void setGeStudentExperimentTime(java.util.Date geStudentExperimentTime) {
		this.geStudentExperimentTime = geStudentExperimentTime;
	}
    public void setLtStudentExperimentTime(java.util.Date ltStudentExperimentTime) {
		this.ltStudentExperimentTime = ltStudentExperimentTime;
	}

	public void setEqStudentExperimentSubmit(String eqStudentExperimentSubmit) {
		this.eqStudentExperimentSubmit = eqStudentExperimentSubmit;
	}
    public void setLkStudentExperimentSubmit(String lkStudentExperimentSubmit) {
		this.lkStudentExperimentSubmit = lkStudentExperimentSubmit;
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
    public void setEqClassExperimentId(Integer eqClassExperimentId) {
		this.eqClassExperimentId = eqClassExperimentId;
	}
    public void setNeClassExperimentId(Integer neClassExperimentId) {
		this.neClassExperimentId = neClassExperimentId;
	}

	public void setEqStatement(String eqStatement) {
		this.eqStatement = eqStatement;
	}
    public void setLkStatement(String lkStatement) {
		this.lkStatement = lkStatement;
	}

}
