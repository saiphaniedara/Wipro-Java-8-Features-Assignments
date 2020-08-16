package com.wipro.functionalInterface;

import java.util.ArrayList;
import java.util.function.Function;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employees = new ArrayList<Employee>();
		Employee e1 = new Employee(101, "Sai Phani", "Hyderabad", 30000);
		employees.add(e1);
		e1 = new Employee(102, "Sai Krishna", "Karimnagar", 25000);
		employees.add(e1);
		e1 = new Employee(103, "Surya", "Mancherial", 20000);
		employees.add(e1);
		e1 = new Employee(104, "Om Prasad", "Ranga Reddy", 25000);
		employees.add(e1);
		e1 = new Employee(105, "Pavan", "Wanaparthy", 20000);
		employees.add(e1);
		Function<ArrayList<Employee>, ArrayList<String>> func = (emps)->{
			ArrayList<String> empLocations = new ArrayList<String>();
			for(Employee e: emps)
			{
				empLocations.add(e.getLocation());
			}
			return empLocations;
		};
		ArrayList<String> locations = func.apply(employees);
		System.out.println("Employee Locations : \n");
		locations.forEach(System.out::println);
	}

}
