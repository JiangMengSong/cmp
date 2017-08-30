package com.hfxt.cmp.model.vo;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public abstract class BaseVo implements Serializable {

	private static final long serialVersionUID = -8364830628770277137L;

	public interface ValidGroup_Admin_Add {
	}
	public interface ValidGroup_Admin_Edit {
	}
	
	

	

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
