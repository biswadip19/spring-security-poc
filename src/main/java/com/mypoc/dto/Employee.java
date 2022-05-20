package com.mypoc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {

	
	@JsonProperty(value = "Name")
	private String empName;
	
	@JsonProperty(value = "Employee Number")
	private String empNo;
	
	@JsonProperty(value = "Address1")
	private String address1;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}


		

}
