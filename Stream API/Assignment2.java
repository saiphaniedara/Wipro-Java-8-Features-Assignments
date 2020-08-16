package com.wipro.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment2 {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		Employee e1 = new Employee(101,"Sai Phani",19,"Hyderabad");
		employees.add(e1);
		e1 = new Employee(102, "Sai Krishna", 20, "Pune");
		employees.add(e1);
		e1 = new Employee(103, "Surya", 24, "Pune");
		employees.add(e1);
		e1 = new Employee(104, "Om Prasad", 20, "Hyderabad");
		employees.add(e1);
		e1 = new Employee(105, "Pavan", 21, "Chennai");
		employees.add(e1);
		List<Employee> empsFromPune = employees.stream().filter(emp->emp.getLocation().equalsIgnoreCase("Pune")).collect(Collectors.toList());
		empsFromPune.forEach(emp->System.out.println(emp.getEmpNo()+" "+emp.getName()+" "+emp.getAge()+" "+emp.getLocation()));
	}
}
