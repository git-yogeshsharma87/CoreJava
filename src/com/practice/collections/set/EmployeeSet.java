package com.practice.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

import com.practice.collections.list.employee.Employee;

public class EmployeeSet {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(1001,"JohnSmith","Engineering",9834.234f);
		Employee employee2 = new Employee(1002,"David Smith","Engineering",10200.234f);
		Employee employee3 = new Employee(1003,"Marry Smith","Operations",9010.234f);
		Employee employee4 = new Employee(1004,"Mark","HR",7834.234f);
		Employee employee5 = new Employee(1005,"Tony","HR",8834.234f);
		
		
		Set<Employee> employees = new LinkedHashSet<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		
		System.out.println(employees);
		
		
		for (Employee emp : employees) {
			System.out.println(emp.id);
			System.out.println(emp.name);

			System.out.println(emp.dept);

			System.out.println(emp.salary);
			System.out.println("--------------------");

		}
		
	}

}
