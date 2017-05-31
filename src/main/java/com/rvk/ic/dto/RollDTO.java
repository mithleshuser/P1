package com.rvk.ic.dto;

import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;
//@Entity
public class RollDTO {
	/*@Id
	@Column(name = "R_ID")
	@GenericGenerator(name="R_IDincrs", strategy="increment")
	@GeneratedValue(generator ="R_IDincrs")*/
	private int r_id;

/*	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "R_ID_fk")*/
	private PrivilegeDTO[] prevleage;
	
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	public PrivilegeDTO[] getPrevleage() {
		return prevleage;
	}
	public void setPrevleage(PrivilegeDTO[] prevleage) {
		this.prevleage = prevleage;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(prevleage);
		result = prime * result + r_id;
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
		RollDTO other = (RollDTO) obj;
		if (!Arrays.equals(prevleage, other.prevleage))
			return false;
		if (r_id != other.r_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "RollDTO [r_id=" + r_id + ", prevleage=" + Arrays.toString(prevleage) + "]";
	}
	public RollDTO(int r_id, PrivilegeDTO[] prevleage) {
		super();
		this.r_id = r_id;
		this.prevleage = prevleage;
	}
	public RollDTO() {
		super();
	}
}
