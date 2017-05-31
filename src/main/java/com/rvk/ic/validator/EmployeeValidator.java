package com.rvk.ic.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.rvk.ic.controller.EmployeeForm;
import com.rvk.ic.dto.EmployeeDTO;
import com.rvk.ic.dto.PrivilegeDTO;
import com.rvk.ic.dto.RollDTO;
import com.rvk.ic.dto.UserDTO;

@Component
public class EmployeeValidator implements Validator {
	/*
	 * @Autowired
	 * 
	 * @Qualifier("emailValidator") EmailValidator emailValidator;
	 */

	public boolean supports(Class clazz) {
		return EmployeeDTO.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) 
	
	{
		if(target instanceof EmployeeForm){
		EmployeeForm user = (EmployeeForm) target;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "error.firstName", "First name is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "error.lastName", "Last name is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "error.email", "Email is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phonNo", "error.phonNo", "Phon number must is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "sex", "error.sex", "please select your gender.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "overview", "error.overview", "Please put your overview about buziness.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "city", "error.city", "city name is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "interest", "error.interest", "Please select the check box Intrest of area.");
	
		}else if (target instanceof UserDTO) {
			UserDTO user = (UserDTO) target;
		   //do Validation
		} else if (target instanceof RollDTO) {
			RollDTO user = (RollDTO) target;
			//do Validation
		}else if (target instanceof PrivilegeDTO ) {
			PrivilegeDTO user = (PrivilegeDTO) target;
			//do Validation
		}else if (target instanceof PrivilegeDTO ) {
			PrivilegeDTO user = (PrivilegeDTO) target;
			//do Validation
		}   

	}

}
