package com.rvk.ic.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

//@Entity
public class PrivilegeDTO {

	/*@Id
	@Column(name = "A_ID")*/
	private String p_id;
//	@Column
	private String prevlageName;
	

	public PrivilegeDTO() {
		super();
	}
	public PrivilegeDTO(String p_id, String prevlageName) {
		super();
		this.p_id = p_id;
		this.prevlageName = prevlageName;
	}
	public String getP_id() {
		return p_id;
	}
	public void setP_id(String p_id) {
		this.p_id = p_id;
	}
	public String getPrevlageName() {
		return prevlageName;
	}
	public void setPrevlageName(String prevlageName) {
		this.prevlageName = prevlageName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((p_id == null) ? 0 : p_id.hashCode());
		result = prime * result + ((prevlageName == null) ? 0 : prevlageName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrivilegeDTO other = (PrivilegeDTO) obj;
		if (p_id == null) {
			if (other.p_id != null)
				return false;
		} else if (!p_id.equals(other.p_id))
			return false;
		if (prevlageName == null) {
			if (other.prevlageName != null)
				return false;
		} else if (!prevlageName.equals(other.prevlageName))
			return false;
		return true;
	}
	
}
