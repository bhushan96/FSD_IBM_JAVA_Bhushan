package com.ebis.eis.Dao;

import java.util.ArrayList;

import com.ibis.eis.bean.Employee;

public class MedicalInsuranceDaoClass implements MedicalInsuranceDaoInterface {
	private ArrayList<Employee> emp=new ArrayList<>();
	@Override
	public ArrayList<Employee> displayEmployee() {
		// TODO Auto-generated method stub
		return emp;
	}

	@Override
	public void storeEmployee(Employee e) {
	emp.add(e);
	}

}
