
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

}
