package com.ozan.department.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ozan.department.entity.ApplicationLog;
import com.ozan.department.entity.Departments;
@Repository
public class DepartmentsDAOImp implements DepartmentsDAO {
	@Autowired
	private SessionFactory sessionFactory ;
	@Override
	public List<Departments> getDepartmentsList() {
		
		Session session = sessionFactory.getCurrentSession();
		Query<Departments> query = session.createQuery("from Departments order by id ",Departments.class);
		List<Departments> deptList = query.getResultList();
		return deptList;
	}
	@Override
	public void saveDepartments(Departments dept) {
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(dept);
		
	}
	@Override
	public void removeDepartments(int deptId) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("delete from Departments where id= :param_id");
		query.setParameter("param_id",deptId);
		
		int rowsDeleted = query.executeUpdate();
		System.out.println(rowsDeleted + " rows deleted");
		
	}
	@Override
	public Departments updateDepartments(int deptId) {
		Session session = sessionFactory.getCurrentSession();
		Departments dept = session.get(Departments.class, deptId);
		return dept;
		
		
	}
	@Override
	public List<Departments> searchAll(String deptName, String mngrName, String lctName) {
		Session session = sessionFactory.getCurrentSession();
		Query query ;
		Integer mngrId = Integer.valueOf(mngrName);
		Integer lctId = Integer.valueOf(lctName);
		String kosul ="1=1";
		if(deptName!=null && deptName.trim().length()>0) {
			
			kosul+=" and lower(name) like "+"'%"+deptName.toLowerCase()+"%'";
		}
		if(mngrId !=0) 
			kosul+=" and emp="+mngrName;
		if(lctId !=0)
			kosul+=" and lct="+lctName ;
		
			query = session.createQuery("from Departments where "+kosul+" order by id");
			
			
		
		
		
		return  query.getResultList();
		
	}
	@Override
	public void setDbLog(ApplicationLog log) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(log);
		
	}
	

}
