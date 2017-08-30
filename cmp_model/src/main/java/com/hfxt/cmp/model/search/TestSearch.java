
package com.hfxt.cmp.model.search;

/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime：2017-08-28
 */
public class TestSearch extends BaseSearch {


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
     * test_time
	 * dbValue = thisValue (yyyy-MM-dd)
	 */
    private java.util.Date eqTestTime; 
    /**
	 * dbValue >= thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date geTestTime;
    /**
	 * dbValue < thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date ltTestTime;
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
     *test_type(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqTestType;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neTestType;
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
     * test_content(765)
	 * dbValue == thisValue
	 */
    private String eqTestContent;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkTestContent;

    
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
    
    public java.util.Date getEqTestTime() {
        return eqTestTime;
    }
    public java.util.Date getGeTestTime() {
        return geTestTime;
    }
    public java.util.Date getLtTestTime() {
        return ltTestTime;
    }
    
    public Integer getEqEmployeeId() {
        return eqEmployeeId;
    }
    public Integer getNeEmployeeId() {
        return neEmployeeId;
    }
    
    public Integer getEqTestType() {
        return eqTestType;
    }
    public Integer getNeTestType() {
        return neTestType;
    }
    
    public String getEqDesc() {
        return eqDesc;
    }
    public String getLkDesc() {
        return lkDesc;
    }
    
    public String getEqTestContent() {
        return eqTestContent;
    }
    public String getLkTestContent() {
        return lkTestContent;
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
    public void setEqTestTime(java.util.Date eqTestTime) {
		this.eqTestTime = eqTestTime;
	}
    public void setGeTestTime(java.util.Date geTestTime) {
		this.geTestTime = geTestTime;
	}
    public void setLtTestTime(java.util.Date ltTestTime) {
		this.ltTestTime = ltTestTime;
	}
    public void setEqEmployeeId(Integer eqEmployeeId) {
		this.eqEmployeeId = eqEmployeeId;
	}
    public void setNeEmployeeId(Integer neEmployeeId) {
		this.neEmployeeId = neEmployeeId;
	}
    public void setEqTestType(Integer eqTestType) {
		this.eqTestType = eqTestType;
	}
    public void setNeTestType(Integer neTestType) {
		this.neTestType = neTestType;
	}

	public void setEqDesc(String eqDesc) {
		this.eqDesc = eqDesc;
	}
    public void setLkDesc(String lkDesc) {
		this.lkDesc = lkDesc;
	}

	public void setEqTestContent(String eqTestContent) {
		this.eqTestContent = eqTestContent;
	}
    public void setLkTestContent(String lkTestContent) {
		this.lkTestContent = lkTestContent;
	}

}
