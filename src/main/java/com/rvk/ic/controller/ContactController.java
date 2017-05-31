package com.rvk.ic.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.rvk.ic.dto.Contact;
import com.rvk.ic.dto.EmployeeDTO;
import com.rvk.ic.dto.InterestDTO;
import com.rvk.ic.dto.PrivilegeDTO;
import com.rvk.ic.dto.RollDTO;
import com.rvk.ic.dto.UserDTO;
import com.rvk.ic.service.EmployeeManager;
import com.rvk.ic.validator.EmployeeValidator;

@Controller
@SessionAttributes
public class ContactController {

	@Autowired
	EmployeeManager manager;

	@Autowired
	EmployeeValidator validator;

	@RequestMapping(method = RequestMethod.POST, value = "/employeeForm")
	public String setupForm(Map<String, Object> model) {
		EmployeeDTO emp = new EmployeeDTO();
		((Model) model).addAttribute("employee", emp);

		List<String> listOfCity = new ArrayList<String>();
		listOfCity.add("select"); // HELP ME!!!!
		listOfCity.add("Dhanbad");
		listOfCity.add("Ranchi");
		listOfCity.add("Jamui");
		listOfCity.add("Patna");
		model.put("listOfCity", listOfCity);

		List<InterestDTO> interestArea = new ArrayList<InterestDTO>();

		interestArea.add(new InterestDTO("IA1", "ESG"));
		interestArea.add(new InterestDTO("IA2", "EEG"));
		interestArea.add(new InterestDTO("IA3", "VMS"));
		interestArea.add(new InterestDTO("IA4", "ASG"));
		interestArea.add(new InterestDTO("IA5", "MSG"));
		model.put("interestArea", interestArea);
		System.out.println("A");
		return "addEmployee";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/creatEmployeForm")
	public String submitForm(Map<String, Object> model, @ModelAttribute("employee") EmployeeForm emp1,
			BindingResult result, SessionStatus status) {
		System.out.println("ready for validate");

		validator.validate(emp1, result);
		System.out.println("done validate");
		System.out.println("result.hasErrors() should true " + result.hasErrors());

		if (result.hasErrors()) {
			System.out.println("if hasError");
			List<String> listOfCity = new ArrayList<String>();
			listOfCity.add("null"); // HELP ME!!!!
			listOfCity.add("Dhanbad");
			listOfCity.add("Ranchi");
			listOfCity.add("Jamui");
			listOfCity.add("Patna");
			model.put("listOfCity", listOfCity);

			List<InterestDTO> interestArea = new ArrayList<InterestDTO>();
			interestArea.add(new InterestDTO("IA1", "ESG"));
			interestArea.add(new InterestDTO("IA2", "EEG"));
			interestArea.add(new InterestDTO("IA3", "VMS"));
			interestArea.add(new InterestDTO("IA4", "ASG"));
			interestArea.add(new InterestDTO("IA5", "MSG"));
			model.put("interestArea", interestArea);
			System.out.println("B");
			return "addEmployee";
		}
		EmployeeDTO empdto = copyTodto(emp1);

		Boolean flage = manager.createNewRecord(empdto);
		status.setComplete();
		System.out.println("record is created : ");
		model.put("msg", "Employee data submited succesfully");
		return "success";
	}

	private EmployeeDTO copyTodto(EmployeeForm emp1) {
		// Store the employee information in database
		EmployeeDTO empdto = new EmployeeDTO();
		empdto.setAge(emp1.getAge());
		empdto.setCenter(emp1.getCenter());
		empdto.setCity(emp1.getCity());
		empdto.setEmail(emp1.getEmail());
		empdto.setFirstName(emp1.getFirstName());
		empdto.setInterest(emp1.getInterest());
		String ksDate = emp1.getKnowLedgeDate();
		Date ks = new Date();
		if (null != ksDate && !"".equalsIgnoreCase(ksDate)) {
			DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
			try {
				ks = (Date) formatter.parse(ksDate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ks = new Date(ksDate);
		}
		empdto.setKnowLedgeDate(ks);
		empdto.setLanguage(emp1.getLanguage());
		empdto.setLastName(emp1.getLastName());
		empdto.setOverview(emp1.getOverview());
		empdto.setPhonNo(emp1.getPhonNo());
		empdto.setProfasnal(emp1.getProfasnal());
		empdto.setPwd(emp1.getPwd());
		empdto.setQualification(emp1.getQualification());
		empdto.setRe_pwd(emp1.getRe_pwd());
		empdto.setRvkIC_id(emp1.getRvkIC_id());
		empdto.setSc_no(emp1.getSc_no());
		empdto.setSex(emp1.getSex());
		return empdto;
	}

	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("contact") Contact contact, BindingResult result) {

		// write the code here to add contact
		System.out.println("write the code here to add contact");
		return "redirect:contact.html";
	}

	@RequestMapping("/contact")
	public ModelAndView showContacts() {
		System.out.println("contac command new Contact()");
		return new ModelAndView("contact", "command", new Contact());
	}
	
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/adminForm")
	public String adminForm(Map<String, Object> model) {

		UserDTO admin = new UserDTO();
		((Model) model).addAttribute("admin", admin);

		List<String> listOfRoll = new ArrayList<String>();
		listOfRoll.add("ROLL 1"); // HELP ME!!!!
		listOfRoll.add("ROLL 2");
		listOfRoll.add("ROLL 3");
		listOfRoll.add("ROLL 4");
		model.put("listOfRoll", listOfRoll);

		List<PrivilegeDTO> listOfPrivilege = new ArrayList<PrivilegeDTO>();

		listOfPrivilege.add(new PrivilegeDTO("PID1", "CREATE"));
		listOfPrivilege.add(new PrivilegeDTO("PID2", "UPDATE"));
		listOfPrivilege.add(new PrivilegeDTO("PID3", "DELEATE"));
		listOfPrivilege.add(new PrivilegeDTO("PID4", "SEARCH"));
		model.put("listOfPrivilege", listOfPrivilege);
		System.out.println("Admin A");
		return "addAdmin";

	}
	@RequestMapping(method = RequestMethod.POST, value = "/createAdminForm")
	public String submitAdminForm(Map<String, Object> model, @ModelAttribute("admin") UserDTO user, BindingResult result, SessionStatus status) {
		System.out.println("Admin validate");

		validator.validate(user, result);
		System.out.println("done Admin validate");
		System.out.println("result.hasErrors() : " +result.hasErrors());
		if (result.hasErrors()) {
			System.out.println("Admin if hasError");
			List<String> listOfRoll = new ArrayList<String>();
			listOfRoll.add("ROLL 1"); // HELP ME!!!!
			listOfRoll.add("ROLL 2");
			listOfRoll.add("ROLL 3");
			listOfRoll.add("ROLL 4");
			model.put("listOfRoll", listOfRoll);

			List<PrivilegeDTO> listOfPrivilege = new ArrayList<PrivilegeDTO>();

			listOfPrivilege.add(new PrivilegeDTO("PID1", "CREATE"));
			listOfPrivilege.add(new PrivilegeDTO("PID2", "UPDATE"));
			listOfPrivilege.add(new PrivilegeDTO("PID3", "DELEATE"));
			listOfPrivilege.add(new PrivilegeDTO("PID4", "SEARCH"));
			model.put("listOfPrivilege", listOfPrivilege);
			System.out.println("Admin B");
			return "addAdmin";
		}
		// Store the Admin information in database
		// manager.createNewRecord(admin);
		// Mark Session Complete
		
		status.setComplete();
		System.out.println("Admin C");
		model.put("msg", "Admin data submited succesfully");
		return "success";
	}

}
