package com.javan.collections;

public class Company {

	@Override
	public String toString() {
		return "This is CompanyName" + companyName + "This is EmployerNumber" + employeeNumber;
	}
	

	private String companyName;
	private int employeeNumber;
	
	
	public Company(String companyName, int employeeNumber) {
		super();
		this.companyName = companyName;
		this.employeeNumber = employeeNumber;
	}
	
	public int getEmployeeNumber() {
		return employeeNumber;
	}


	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
}
