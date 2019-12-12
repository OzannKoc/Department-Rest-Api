package com.ozan.department.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employees {
	@Id
	@Column(name = "EMPLOYEE_ID")
	private Integer id ;
	@Column(name = "FIRST_NAME")
	private String firstName ;
	@Column(name = "LAST_NAME")
	private String lastName ;
	
	public Employees() {
		
	}
	public Employees(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	@Override
	public String toString() {
		return  firstName + " " + lastName ;
	}
	
	

	
	


}
