package com.ibis.eis.service;

import java.util.ArrayList;

import com.ebis.eis.Dao.MedicalInsuranceDaoClass;
import com.ibis.eis.bean.Employee;

public class MedicalInsuranceServiceClass implements MedicalInsuranceServiceInterface {
	MedicalInsuranceDaoClass dao=new MedicalInsuranceDaoClass();
	
	@Override
	public String findInsuranceScheme(Employee e) {
		String insurance="";
		int salary=e.getSalary();
		String designation=(e.getDesignation()).toLowerCase();
		System.out.println(designation);
		if(((salary>5000) && (salary<20000)) && designation.equals("system associate")) {
			insurance= "Scheme C";
		}
		else if(((salary>=20000) &&(salary<40000)) && designation.equals("programmer")) {
			insurance= "Scheme B";
		}
		else if((salary>=40000) && designation.equals("manager")) {
			insurance= "Scheme A";
		}
		else {
			insurance=  "No Scheme";
		}
		return insurance;
		
		
	}

	

	@Override
	public ArrayList<Employee> displayEmployeeDetails() {
	
		return dao.displayEmployee();
		
	}



	@Override
	public void storeEmployeeDetails(Employee e) {
		String insurance_scheme=this.findInsuranceScheme(e);
		
		e.setInsuranceScheme(insurance_scheme);
		dao.storeEmployee(e);
		
		
		
	}

}
