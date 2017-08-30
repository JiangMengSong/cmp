
package com.hfxt.cmp.model.search;

/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime：2017-08-28
 */
public class ClazzExperimentSearch extends BaseSearch {


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
     *teacher_id(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqTeacherId;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neTeacherId;
    /**
     *class_id(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqClassId;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neClassId;
    /**
     * class_experiment_content(765)
	 * dbValue == thisValue
	 */
    private String eqClassExperimentContent;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkClassExperimentContent;
    /**
     * class_experiment_time
	 * dbValue = thisValue (yyyy-MM-dd)
	 */
    private java.util.Date eqClassExperimentTime; 
    /**
	 * dbValue >= thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date geClassExperimentTime;
    /**
	 * dbValue < thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date ltClassExperimentTime;
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
     * class_experiment_performance(765)
	 * dbValue == thisValue
	 */
    private String eqClassExperimentPerformance;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkClassExperimentPerformance;
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
    
    public Integer getEqTeacherId() {
        return eqTeacherId;
    }
    public Integer getNeTeacherId() {
        return neTeacherId;
    }
    
    public Integer getEqClassId() {
        return eqClassId;
    }
    public Integer getNeClassId() {
        return neClassId;
    }
    
    public String getEqClassExperimentContent() {
        return eqClassExperimentContent;
    }
    public String getLkClassExperimentContent() {
        return lkClassExperimentContent;
    }
    
    public java.util.Date getEqClassExperimentTime() {
        return eqClassExperimentTime;
    }
    public java.util.Date getGeClassExperimentTime() {
        return geClassExperimentTime;
    }
    public java.util.Date getLtClassExperimentTime() {
        return ltClassExperimentTime;
    }
    
    public String getEqDesc() {
        return eqDesc;
    }
    public String getLkDesc() {
        return lkDesc;
    }
    
    public String getEqClassExperimentPerformance() {
        return eqClassExperimentPerformance;
    }
    public String getLkClassExperimentPerformance() {
        return lkClassExperimentPerformance;
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
    public void setEqTeacherId(Integer eqTeacherId) {
		this.eqTeacherId = eqTeacherId;
	}
    public void setNeTeacherId(Integer neTeacherId) {
		this.neTeacherId = neTeacherId;
	}
    public void setEqClassId(Integer eqClassId) {
		this.eqClassId = eqClassId;
	}
    public void setNeClassId(Integer neClassId) {
		this.neClassId = neClassId;
	}

	public void setEqClassExperimentContent(String eqClassExperimentContent) {
		this.eqClassExperimentContent = eqClassExperimentContent;
	}
    public void setLkClassExperimentContent(String lkClassExperimentContent) {
		this.lkClassExperimentContent = lkClassExperimentContent;
	}
    public void setEqClassExperimentTime(java.util.Date eqClassExperimentTime) {
		this.eqClassExperimentTime = eqClassExperimentTime;
	}
    public void setGeClassExperimentTime(java.util.Date geClassExperimentTime) {
		this.geClassExperimentTime = geClassExperimentTime;
	}
    public void setLtClassExperimentTime(java.util.Date ltClassExperimentTime) {
		this.ltClassExperimentTime = ltClassExperimentTime;
	}

	public void setEqDesc(String eqDesc) {
		this.eqDesc = eqDesc;
	}
    public void setLkDesc(String lkDesc) {
		this.lkDesc = lkDesc;
	}

	public void setEqClassExperimentPerformance(String eqClassExperimentPerformance) {
		this.eqClassExperimentPerformance = eqClassExperimentPerformance;
	}
    public void setLkClassExperimentPerformance(String lkClassExperimentPerformance) {
		this.lkClassExperimentPerformance = lkClassExperimentPerformance;
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

}
