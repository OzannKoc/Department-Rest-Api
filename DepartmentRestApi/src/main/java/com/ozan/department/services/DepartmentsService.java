package com.ozan.department.services;

import java.util.List;

import com.ozan.department.entity.ApplicationLog;
import com.ozan.department.entity.Departments;
import com.ozan.department.entity.Employees;
import com.ozan.department.entity.Locations;

public interface DepartmentsService {

	public List<Departments> getDepartmentsList();

	public void saveDepartments(Departments dept);

	public void removeDepartments(int deptId);

	public Departments updateDepartments(int deptId);
	
	public List<Employees> getEmployeesList();
	
	public Employees updateEmployees(int empId);

	public Locations updateLocations(int lctId);

	public List<Locations> getLocationsList();

	public List<Departments> searchAll(String deptName, String mngrName, String lctName);

	public void setDbLog(ApplicationLog log);

	

	

}
