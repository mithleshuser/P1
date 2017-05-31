package com.rvk.ic.controller;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author lenovo
 *
 */
public class EmployeeForm 
{

	private String rvkIC_id;
	private String sc_no;
	private String firstName;
	private String lastName;
	private int center;
	private String email;
	private String city;
	private int phonNo;
	private String overview;
	private String sex;
	private Integer age;

	//@Temporal(TemporalType.TIMESTAMP)
	private String knowLedgeDate;

	private String language;
	private String qualification;
	private String profasnal;
	// private Address address;
	private String[] interest;
	private String pwd;
	private String re_pwd;
	
	
	public String getRvkIC_id() {
		return rvkIC_id;
	}
	public void setRvkIC_id(String rvkIC_id) {
		this.rvkIC_id = rvkIC_id;
	}
	public String getSc_no() {
		return sc_no;
	}
	public void setSc_no(String sc_no) {
		this.sc_no = sc_no;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getCenter() {
		return center;
	}
	public void setCenter(int center) {
		this.center = center;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPhonNo() {
		return phonNo;
	}
	public void setPhonNo(int phonNo) {
		this.phonNo = phonNo;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getKnowLedgeDate() {
		return knowLedgeDate;
	}
	public void setKnowLedgeDate(String knowLedgeDate) {
		this.knowLedgeDate = knowLedgeDate;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getProfasnal() {
		return profasnal;
	}
	public void setProfasnal(String profasnal) {
		this.profasnal = profasnal;
	}
	public String[] getInterest() {
		return interest;
	}
	public void setInterest(String[] interest) {
		this.interest = interest;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getRe_pwd() {
		return re_pwd;
	}
	public void setRe_pwd(String re_pwd) {
		this.re_pwd = re_pwd;
	}
	
	
	
		
}