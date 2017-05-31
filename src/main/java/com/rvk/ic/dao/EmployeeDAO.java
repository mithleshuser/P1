package com.rvk.ic.dao;

import java.util.List;

import com.rvk.ic.dto.EmployeeDTO;

public interface EmployeeDAO {
	public List<EmployeeDTO> getAllEmployees();

	public boolean createNewRecord(EmployeeDTO emp1);
}