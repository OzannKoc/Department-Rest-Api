package com.ozan.department.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ozan.department.entity.Departments;
import com.ozan.department.entity.Employees;

@Repository
public class EmployeesImpDAO implements EmployeesDAO {
	@Autowired
	private SessionFactory sessionFactory ;
	
	
	@Override
	public List<Employees> getEmployeesListe() {
		Session session = sessionFactory.getCurrentSession();
		Query<Employees> query = session.createQuery("from Employees ",Employees.class);
		List<Employees> empList = query.getResultList();
		return empList;
	}

	@Override
	public void saveEmployees(Employees emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeEmployees(int empId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employees updateEmployees(int empId) {
		Session session = sessionFactory.getCurrentSession();
		Employees emp = session.get(Employees.class, empId);
		return emp;
	}


}
