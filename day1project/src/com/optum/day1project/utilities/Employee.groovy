package com.optum.day1project.utilities

class Employee {
	private long employeeId
	private String name
	public Employee(int employeeId,String name) {
		this.employeeId=employeeId
		this.name=name
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
