package com.ozan.department.dao;

import java.util.List;

import com.ozan.department.entity.Departments;
import com.ozan.department.entity.Employees;
import com.ozan.department.entity.Locations;

public interface LocationsDAO {

	public List<Locations> getLocationsList();

	public void saveLocations(Locations lct);

	public void removeLocations(int lctId);

	public Locations updateLocations(int lctId);

	

	

}
