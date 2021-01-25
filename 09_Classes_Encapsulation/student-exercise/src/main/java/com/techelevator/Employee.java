package com.techelevator;

public class Employee {
	private int  employeeId;
	private String firstName;
	private String lastName;
	private String department;
	private double annualSalary;
	
	public Employee(int employeeId, String firstName, String lastName, double salary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.annualSalary = salary;
		
	}
	
	//Create a method called `raiseSalary` that accepts a `double` called `percent` and returns `void`. The method increases the current annual salary by the percentage provided. For example, 5.5 represents 5.5%.
	public void raiseSalary(double percent) {
		if (percent > 0.00){
			annualSalary = annualSalary * (1.0 + (percent/ 100));
			}
		
	}
	
	public String getFullName() {
		return lastName + ", " + firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}

}
