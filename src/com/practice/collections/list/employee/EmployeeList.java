package com.practice.collections.list.employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(1001,"JohnSmith","Engineering",9834.234f);
	
		Employee employee2 = new Employee(1002,"David Smith","Engineering",10200.234f);
		Employee employee3 = new Employee(1003,"Marry Smith","Operations",9010.234f);
		Employee employee4 = new Employee(1004,"Mark","HR",7834.234f);
		Employee employee5 = new Employee(1005,"Tony","HR",8834.234f);


		//create list of employee
		
		List<Employee> listOfEmployees = new ArrayList<Employee>();
	
		//insert 
		
		listOfEmployees.add(employee1);
		listOfEmployees.add(employee2);
		
		
		// insert data at an index 
		listOfEmployees.add(0,employee4);
		
		// replace 
		listOfEmployees.set(1, employee5);
		
		System.out.println(listOfEmployees);

		//iterate over list 
		Iterator<Employee> itr = listOfEmployees.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----");
		for(Employee emp : listOfEmployees) {
			System.out.println(emp);
		}
	}

}
