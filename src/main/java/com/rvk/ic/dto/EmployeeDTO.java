package com.rvk.ic.dto;

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
@Entity
public class EmployeeDTO implements Serializable 
{

	@Id
	@GenericGenerator(name = "custom_id", strategy = "com.rvk.ic.Utils.CustomIdentifier")
	@GeneratedValue(generator = "custom_id")
	private String rvkIC_id;
	private String sc_no;
	@Column(name = "FNAME", length = 100)
	private String firstName;
	@Column(name = "LNAME", length = 100)
	private String lastName;
	private int center;
	@Column(name = "EMAIL")
	private String email;
	private String city;
	private int phonNo;
	private String overview;
	private String sex;
	private Integer age;

	//@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name = "Date_Of_Knowledge")
	private Date knowLedgeDate;

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
	public Date getKnowLedgeDate() {
		return knowLedgeDate;
	}
	public void setKnowLedgeDate(Date knowLedgeDate) {
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
	@Override
	public String toString() {
		return "EmployeeDTO [rvkIC_id=" + rvkIC_id + ", sc_no=" + sc_no + ", firstName=" + firstName + ", lastName="
				+ lastName + ", center=" + center + ", email=" + email + ", city=" + city + ", phonNo=" + phonNo
				+ ", overview=" + overview + ", sex=" + sex + ", age=" + age + ", knowLedgeDate=" + knowLedgeDate
				+ ", language=" + language + ", qualification=" + qualification + ", profasnal=" + profasnal
				+ ", interest=" + Arrays.toString(interest) + ", pwd=" + pwd + ", re_pwd=" + re_pwd + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + center;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + Arrays.hashCode(interest);
		result = prime * result + ((knowLedgeDate == null) ? 0 : knowLedgeDate.hashCode());
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((overview == null) ? 0 : overview.hashCode());
		result = prime * result + phonNo;
		result = prime * result + ((profasnal == null) ? 0 : profasnal.hashCode());
		result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
		result = prime * result + ((qualification == null) ? 0 : qualification.hashCode());
		result = prime * result + ((re_pwd == null) ? 0 : re_pwd.hashCode());
		result = prime * result + ((rvkIC_id == null) ? 0 : rvkIC_id.hashCode());
		result = prime * result + ((sc_no == null) ? 0 : sc_no.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
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
		EmployeeDTO other = (EmployeeDTO) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (center != other.center)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (!Arrays.equals(interest, other.interest))
			return false;
		if (knowLedgeDate == null) {
			if (other.knowLedgeDate != null)
				return false;
		} else if (!knowLedgeDate.equals(other.knowLedgeDate))
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (overview == null) {
			if (other.overview != null)
				return false;
		} else if (!overview.equals(other.overview))
			return false;
		if (phonNo != other.phonNo)
			return false;
		if (profasnal == null) {
			if (other.profasnal != null)
				return false;
		} else if (!profasnal.equals(other.profasnal))
			return false;
		if (pwd == null) {
			if (other.pwd != null)
				return false;
		} else if (!pwd.equals(other.pwd))
			return false;
		if (qualification == null) {
			if (other.qualification != null)
				return false;
		} else if (!qualification.equals(other.qualification))
			return false;
		if (re_pwd == null) {
			if (other.re_pwd != null)
				return false;
		} else if (!re_pwd.equals(other.re_pwd))
			return false;
		if (rvkIC_id == null) {
			if (other.rvkIC_id != null)
				return false;
		} else if (!rvkIC_id.equals(other.rvkIC_id))
			return false;
		if (sc_no == null) {
			if (other.sc_no != null)
				return false;
		} else if (!sc_no.equals(other.sc_no))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
	
	
	
		
}