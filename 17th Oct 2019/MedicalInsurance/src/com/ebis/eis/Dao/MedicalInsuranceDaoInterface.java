package com.ebis.eis.Dao;

import java.util.ArrayList;

import com.ibis.eis.bean.Employee;

public interface MedicalInsuranceDaoInterface {
public ArrayList<Employee> displayEmployee();
public void storeEmployee(Employee emp);
}
