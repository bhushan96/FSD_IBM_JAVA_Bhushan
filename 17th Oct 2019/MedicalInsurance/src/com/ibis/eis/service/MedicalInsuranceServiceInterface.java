package com.ibis.eis.service;

import java.util.ArrayList;

import com.ibis.eis.bean.Employee;

public interface MedicalInsuranceServiceInterface {
	public String findInsuranceScheme(Employee e);
	public void storeEmployeeDetails(Employee e);
	public ArrayList<Employee> displayEmployeeDetails();
}
