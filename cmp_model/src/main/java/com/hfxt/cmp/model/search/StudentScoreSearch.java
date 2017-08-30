
package com.hfxt.cmp.model.search;

/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime：2017-08-28
 */
public class StudentScoreSearch extends BaseSearch {


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
     *test_id(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqTestId;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neTestId;
    /**
     * test_evaluate(765)
	 * dbValue == thisValue
	 */
    private String eqTestEvaluate;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkTestEvaluate;
    /**
     *student_score(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqStudentScore;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neStudentScore;
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
    
    public Integer getEqTestId() {
        return eqTestId;
    }
    public Integer getNeTestId() {
        return neTestId;
    }
    
    public String getEqTestEvaluate() {
        return eqTestEvaluate;
    }
    public String getLkTestEvaluate() {
        return lkTestEvaluate;
    }
    
    public Integer getEqStudentScore() {
        return eqStudentScore;
    }
    public Integer getNeStudentScore() {
        return neStudentScore;
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
    public void setEqTestId(Integer eqTestId) {
		this.eqTestId = eqTestId;
	}
    public void setNeTestId(Integer neTestId) {
		this.neTestId = neTestId;
	}

	public void setEqTestEvaluate(String eqTestEvaluate) {
		this.eqTestEvaluate = eqTestEvaluate;
	}
    public void setLkTestEvaluate(String lkTestEvaluate) {
		this.lkTestEvaluate = lkTestEvaluate;
	}
    public void setEqStudentScore(Integer eqStudentScore) {
		this.eqStudentScore = eqStudentScore;
	}
    public void setNeStudentScore(Integer neStudentScore) {
		this.neStudentScore = neStudentScore;
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

}
