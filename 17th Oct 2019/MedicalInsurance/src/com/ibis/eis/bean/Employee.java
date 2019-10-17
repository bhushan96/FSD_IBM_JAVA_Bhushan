package com.ibis.eis.bean;

public class Employee {
	int id,salary;
	String name,designation,insuranceScheme;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	public Employee(int id, int salary, String name, String designation, String insuranceScheme) {
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}
	public Employee(int id, int salary, String name, String designation) {
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}
	

}
