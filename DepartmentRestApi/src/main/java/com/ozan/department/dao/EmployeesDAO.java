package com.ozan.department.dao;

import java.util.List;

import com.ozan.department.entity.Departments;
import com.ozan.department.entity.Employees;

public interface EmployeesDAO {

	public List<Employees> getEmployeesListe();

	public void saveEmployees(Employees emp);

	public void removeEmployees(int empId);

	public Employees updateEmployees(int empId);

	

}
