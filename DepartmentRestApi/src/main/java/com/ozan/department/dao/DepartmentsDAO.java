package com.ozan.department.dao;

import java.util.List;

import com.ozan.department.entity.ApplicationLog;
import com.ozan.department.entity.Departments;

public interface DepartmentsDAO {

	public List<Departments> getDepartmentsList();

	public void saveDepartments(Departments dept);

	public void removeDepartments(int deptId);

	public Departments updateDepartments(int deptId);

	public List<Departments> searchAll(String deptName, String mngrName, String lctName);

	public void setDbLog(ApplicationLog log);

	

}
