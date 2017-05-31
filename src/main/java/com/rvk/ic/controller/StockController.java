package com.rvk.ic.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.rvk.ic.dto.EmployeeDTO;
import com.rvk.ic.dto.InterestDTO;
import com.rvk.ic.dtostock.Product;

@Controller
@SessionAttributes
public class StockController {
	@RequestMapping(method = RequestMethod.POST, value = "/proentry")
	public String submitForm(Map<String, Object> model,@ModelAttribute("product") Product product, BindingResult result, SessionStatus status) {

		
		//return "productentry";
		return "success";
	
	}
}
