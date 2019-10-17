package com.ibis.eis.ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.ibis.eis.bean.Employee;
import com.ibis.eis.service.MedicalInsuranceServiceClass;
import com.ibis.eis.service.MedicalInsuranceServiceInterface;

public class MedicalInsuranceUI {

	public static void main(String[] args) throws Exception {
		MedicalInsuranceServiceInterface service = new MedicalInsuranceServiceClass();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String choice = "";
		while (!choice.equals("n")) {
			System.out.println("Enter the employee id:");
			int id = Integer.parseInt(br.readLine());

			System.out.println("Enter the employee name:");
			String name = br.readLine();

			System.out.println("Enter the employee designation:");
			String designation = br.readLine();

			System.out.println("Enter the employee salary:");
			int salary = Integer.parseInt(br.readLine());

			Employee e = new Employee(id, salary, name, designation);
			service.storeEmployeeDetails(e);

			System.out.println("\nDo you want to enter more employee data(y/n):");
			choice = br.readLine();

		}

		System.out.println(service.displayEmployeeDetails());

	}

}
