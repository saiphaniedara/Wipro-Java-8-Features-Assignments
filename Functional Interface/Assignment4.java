package com.wipro.functionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee1> employees = new ArrayList<Employee1>();
		employees.add(new Employee1(101,"Sai Phani",15000));
		employees.add(new Employee1(102,"Sai Krishna",12000));
		employees.add(new Employee1(103,"Surya",10000));
		employees.add(new Employee1(104,"Sharath",8000));
		employees.add(new Employee1(105,"Pavan",8500));
		employees.add(new Employee1(106,"Bhargav",7000));
		employees.add(new Employee1(107,"Somesh",13000));
		employees.add(new Employee1(108,"Om Prasad",11000));
		employees.add(new Employee1(109,"Sandeep",9000));
		employees.add(new Employee1(110,"Mukesh",10500));
		Predicate<Employee1> pred = (emp)->{
			if(emp.getSalary()<10000)
			{
				return true;
			}
			else
			{
				return false;
			}
		};
		System.out.println("Employees whose salary is below 1000 : ");
		employees.forEach((e)->{
			if(pred.test(e))
			{
				System.out.println(e.getName());
			}
		});
	}

}
