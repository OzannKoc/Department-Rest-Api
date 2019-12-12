package com.ozan.department.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ozan.department.entity.Employees;
import com.ozan.department.entity.Locations;
@Repository
public class LocationsImpDAO implements LocationsDAO {
	@Autowired
	private SessionFactory sessionFactory ;
	@Override
	public List<Locations> getLocationsList() {
		Session session = sessionFactory.getCurrentSession();
		Query<Locations> query = session.createQuery("from Locations ",Locations.class);
		List<Locations> lctList = query.getResultList();
		return lctList;
	}

	@Override
	public void saveLocations(Locations lct) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeLocations(int lctId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Locations updateLocations(int lctId) {
		Session session = sessionFactory.getCurrentSession();
		Locations lct = session.get(Locations.class, lctId);
		return lct;
	}

}
