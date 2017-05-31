package com.rvk.ic.dto;

import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

import org.hibernate.annotations.GenericGenerator;
//@Entity
public class UserDTO {
/*	@Id
	@Column(name = "A_ID")
	@GenericGenerator(name="incrs", strategy="increment")
	@GeneratedValue(generator ="incrs")*/
	private int u_id;
	private String userName;
	private String upwd;
/*	
    @OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "A_ID_R")*/
	private RollDTO[] roll;
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public RollDTO[] getRoll() {
		return roll;
	}
	public void setRoll(RollDTO[] roll) {
		this.roll = roll;
	}

}
