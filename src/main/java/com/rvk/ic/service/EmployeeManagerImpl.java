package com.rvk.ic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rvk.ic.dao.EmployeeDAO;
import com.rvk.ic.dto.EmployeeDTO;

@Service
public class EmployeeManagerImpl implements EmployeeManager {

	@Autowired
	EmployeeDAO dao;

	public List<EmployeeDTO> getAllEmployees() {
		return dao.getAllEmployees();
	}

	@Override
	public Boolean createNewRecord(EmployeeDTO emp1) {
		// TODO Auto-generated method stub
		return dao.createNewRecord(emp1);
	}

}
