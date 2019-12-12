package com.ozan.department.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class Departments {
	@Id
	@SequenceGenerator(name = "department-numarator" ,sequenceName = "departments_seq",allocationSize = 10)
	@GeneratedValue(generator = "department-numarator",strategy = GenerationType.SEQUENCE)
	@Column(name = "DEPARTMENT_ID")
	private Integer id ;
	@Column(name = "DEPARTMENT_NAME")
	private String name ;
	
	@OneToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name = "MANAGER_ID")
	private Employees emp ;
	
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name = "LOCATION_ID")
	private Locations lct ;
	
	public Departments() {
		
	}
	public Departments(String name) {
		
		this.name = name;
	
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Employees getEmp() {
		return emp;
	}
	public void setEmp(Employees emp) {
		this.emp = emp;
	}
	public Locations getLct() {
		return lct;
	}
	public void setLct(Locations lct) {
		this.lct = lct;
	}
	@Override
	public String toString() {
		return "Departments [id=" + id + ", name=" + name + ", emp=" + emp + ", lct=" + lct + "]";
	}
	
	
	
	
	
	
}
