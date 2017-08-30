
package com.hfxt.cmp.model.search;

/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime：2017-08-28
 */
public class NoticeSearch extends BaseSearch {


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
     * notice_title(765)
	 * dbValue == thisValue
	 */
    private String eqNoticeTitle;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkNoticeTitle;
    /**
     * notice_content(765)
	 * dbValue == thisValue
	 */
    private String eqNoticeContent;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkNoticeContent;
    /**
     * notice_newstime
	 * dbValue = thisValue (yyyy-MM-dd)
	 */
    private java.util.Date eqNoticeNewstime; 
    /**
	 * dbValue >= thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date geNoticeNewstime;
    /**
	 * dbValue < thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date ltNoticeNewstime;
    /**
     *notice_from_id(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqNoticeFromId;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neNoticeFromId;
    /**
     *notice_get_id(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqNoticeGetId;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neNoticeGetId;

    
    public Integer getEqId() {
        return eqId;
    }
    public Integer getNeId() {
        return neId;
    }
    
    public String getEqNoticeTitle() {
        return eqNoticeTitle;
    }
    public String getLkNoticeTitle() {
        return lkNoticeTitle;
    }
    
    public String getEqNoticeContent() {
        return eqNoticeContent;
    }
    public String getLkNoticeContent() {
        return lkNoticeContent;
    }
    
    public java.util.Date getEqNoticeNewstime() {
        return eqNoticeNewstime;
    }
    public java.util.Date getGeNoticeNewstime() {
        return geNoticeNewstime;
    }
    public java.util.Date getLtNoticeNewstime() {
        return ltNoticeNewstime;
    }
    
    public Integer getEqNoticeFromId() {
        return eqNoticeFromId;
    }
    public Integer getNeNoticeFromId() {
        return neNoticeFromId;
    }
    
    public Integer getEqNoticeGetId() {
        return eqNoticeGetId;
    }
    public Integer getNeNoticeGetId() {
        return neNoticeGetId;
    }
    public void setEqId(Integer eqId) {
		this.eqId = eqId;
	}
    public void setNeId(Integer neId) {
		this.neId = neId;
	}

	public void setEqNoticeTitle(String eqNoticeTitle) {
		this.eqNoticeTitle = eqNoticeTitle;
	}
    public void setLkNoticeTitle(String lkNoticeTitle) {
		this.lkNoticeTitle = lkNoticeTitle;
	}

	public void setEqNoticeContent(String eqNoticeContent) {
		this.eqNoticeContent = eqNoticeContent;
	}
    public void setLkNoticeContent(String lkNoticeContent) {
		this.lkNoticeContent = lkNoticeContent;
	}
    public void setEqNoticeNewstime(java.util.Date eqNoticeNewstime) {
		this.eqNoticeNewstime = eqNoticeNewstime;
	}
    public void setGeNoticeNewstime(java.util.Date geNoticeNewstime) {
		this.geNoticeNewstime = geNoticeNewstime;
	}
    public void setLtNoticeNewstime(java.util.Date ltNoticeNewstime) {
		this.ltNoticeNewstime = ltNoticeNewstime;
	}
    public void setEqNoticeFromId(Integer eqNoticeFromId) {
		this.eqNoticeFromId = eqNoticeFromId;
	}
    public void setNeNoticeFromId(Integer neNoticeFromId) {
		this.neNoticeFromId = neNoticeFromId;
	}
    public void setEqNoticeGetId(Integer eqNoticeGetId) {
		this.eqNoticeGetId = eqNoticeGetId;
	}
    public void setNeNoticeGetId(Integer neNoticeGetId) {
		this.neNoticeGetId = neNoticeGetId;
	}

}
