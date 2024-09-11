package GrossInheritance;

public class GrossEmployee { // Employee class

//private Strings for employeeName, employeeNumber, and employeeDate
	private String employeeName;
	private String employeeNumber;
	private String employeeDate;
	
//default constructor
	public GrossEmployee() {
		
	}

//constructor for name, number, and date
	public GrossEmployee(String employeeName, String employeeNumber, String employeeDate) {
		this.employeeName = employeeName;
		this.employeeNumber = employeeNumber;
		this.employeeDate = employeeDate;
	}

//Getter for employeeName
	public String getemployeeName() {
		return employeeName;
	}

//setter for employeeName
	public void setemployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

//getter for employeeNumber
	public String getemployeeNumber() {
		return employeeNumber;
	}

//setter for employeeNumber
	public void setemployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

//getter for employeeDate
	public String getemployeeDate() {
		return employeeDate;
	}

//setter for employeeDate
	public void setemployeeDate(String employeeDate) {
		this.employeeDate = employeeDate;
	}

// toString() method which displays info to console
	
	public String toString() {
	System.out.println("Employee Name =" + employeeName);
	System.out.println("Employee No =" + employeeNumber);
	System.out.println("Hiredate =" + employeeDate);
	return "";
	}
}