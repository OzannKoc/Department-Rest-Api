package com.ozan.department.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ozan.department.dao.DepartmentsDAO;
import com.ozan.department.dao.EmployeesDAO;
import com.ozan.department.dao.LocationsDAO;
import com.ozan.department.entity.ApplicationLog;
import com.ozan.department.entity.Departments;
import com.ozan.department.entity.Employees;
import com.ozan.department.entity.Locations;

@Service
public class DepartmentsServiceImp implements DepartmentsService {
	@Autowired
	private DepartmentsDAO departmentsDAO ;
	@Autowired
	private EmployeesDAO employeesDAO ;
	@Autowired
	private LocationsDAO locationsDAO ;
	
	@Override
	@Transactional
	public List<Departments> getDepartmentsList() {
		
		return departmentsDAO.getDepartmentsList();
	}
	@Override
	@Transactional
	public void saveDepartments(Departments dept) {
		departmentsDAO.saveDepartments(dept);
		
	}
	@Override
	@Transactional
	public void removeDepartments(int deptId) {
		departmentsDAO.removeDepartments(deptId);
		
	}
	@Override
	@Transactional
	public Departments updateDepartments(int deptId) {
		return departmentsDAO.updateDepartments(deptId);
		
	}
	@Override
	@Transactional
	public List<Employees> getEmployeesList() {
		
		return employeesDAO.getEmployeesListe();
	}
	@Override
	@Transactional
	public Employees updateEmployees(int empId) {
		
		return employeesDAO.updateEmployees(empId);
	}
	@Override
	@Transactional
	public List<Locations> getLocationsList() {
		
		return locationsDAO.getLocationsList();
	}
	@Override
	@Transactional
	public Locations updateLocations(int lctId) {
		
		return locationsDAO.updateLocations(lctId);
	}
	@Override
	@Transactional
	public List<Departments> searchAll(String deptName, String mngrName, String lctName) {
		
		return departmentsDAO.searchAll(deptName,mngrName,lctName);
		
	}
	@Override
	@Transactional
	public void setDbLog(ApplicationLog log) {
		departmentsDAO.setDbLog(log);
	}
	
	
	

}
