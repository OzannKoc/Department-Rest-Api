package com.ozan.department.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "locations")
public class Locations {
	@Id
	@Column(name = "LOCATION_ID")
	private Integer id ;
	private String city ;
	
	public Locations() {
		
	}
	
	
	public Locations(String city) {
		
		this.city = city;
	}
	

	@Override
	public String toString() {
		return  city ;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}


	
	
	
	
}
