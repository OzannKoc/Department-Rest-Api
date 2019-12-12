package com.ozan.department.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "APPLICATIONLOG")
public class ApplicationLog {
	@Id
	@SequenceGenerator(name = "log-numarator",sequenceName = "log_seq",allocationSize = 1)
	@GeneratedValue(generator = "log-numarator",strategy = GenerationType.SEQUENCE)
	private Integer id ;
	@Column(name = "METHOD_NAME")
	private String methodName ;
	@Column(name = "PARAMETERS")
	private String parameters ;
	@Column(name = "RETURN")
	private String returnData ;
	@Column(name = "TIME")
	private Long time ;
	public ApplicationLog() {
		
	}
	public ApplicationLog(String methodName, String parameters, String returnData, Long time) {
		
		this.methodName = methodName;
		this.parameters = parameters;
		this.returnData = returnData;
		this.time = time;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public String getParameters() {
		return parameters;
	}
	public void setParameters(String parameters) {
		this.parameters = parameters;
	}
	public String getReturnData() {
		return returnData;
	}
	public void setReturnData(String returnData) {
		this.returnData = returnData;
	}
	public Long getTime() {
		return time;
	}
	public void setTime(Long time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "ApplicationLog [id=" + id + ", methodName=" + methodName + ", parameters=" + parameters
				+ ", returnData=" + returnData + ", time=" + time + "]";
	}
	
	
	
	
	
}
