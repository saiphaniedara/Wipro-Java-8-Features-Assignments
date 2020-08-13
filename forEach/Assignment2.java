package com.wipro.forEach;

import java.util.ArrayList;

public class Assignment2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employees = new ArrayList<Employee>();
		Employee employee = new Employee(101,"Sai Phani","Sangareddy",30000);
		employees.add(employee);
		employee = new Employee(102,"Surya","Karimnagar",10000);
		employees.add(employee);
		employee = new Employee(103,"Sai Krishna","Godaverikhani",25000);
		employees.add(employee);
		employee = new Employee(104,"Pavan","Wanaparthy",15000);
		employees.add(employee);
		employee = new Employee(105,"Sharath","Mahabubnagar",10000);
		employees.add(employee);
		employees.forEach(emp->{
			System.out.println("Employee ID : "+emp.getId());
			System.out.println("Employee Name : "+emp.getName());
			System.out.println("Employee Address : "+emp.getAddress());
			System.out.println("Employee Salary : "+emp.getSalary());
			System.out.println();
		});
	}

}
