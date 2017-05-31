package com.rvk.ic.service;

import java.util.List;

import com.rvk.ic.dto.EmployeeDTO;

public interface EmployeeManager {
	public List<EmployeeDTO> getAllEmployees();

	public Boolean createNewRecord(EmployeeDTO emp1);
}
