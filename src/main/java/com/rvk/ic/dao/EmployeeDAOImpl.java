package com.rvk.ic.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rvk.ic.dto.EmployeeDTO;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	public SessionFactory sessionFactory;

	
	@Override
	public boolean createNewRecord(EmployeeDTO emp1) {

		Session session = sessionFactory.openSession();
		Transaction transaction = (Transaction) session.beginTransaction();
		session.save(emp1);
		try {
			transaction.commit();
			session.flush();
			session.close();
		} catch (SecurityException | IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;

	}
	
	
	
	public List<EmployeeDTO> getAllEmployees() 
	{
		List<EmployeeDTO> employees = new ArrayList<EmployeeDTO>();
		
		EmployeeDTO vo1 = new EmployeeDTO();

		vo1.setFirstName("Lokesh");
		vo1.setLastName("Gupta");
		employees.add(vo1);
		
		EmployeeDTO vo2 = new EmployeeDTO();
		
		vo2.setFirstName("Raj");
		vo2.setLastName("Kishore");
		employees.add(vo2);
		
		return employees;
	}

	
}