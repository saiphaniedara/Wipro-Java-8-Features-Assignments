package com.wipro.optionalClass;

import java.util.Optional;

public class Assignment3 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(101,"Phani");
		Optional<Employee> emp = Optional.ofNullable(e1);
		emp.orElseThrow(()->new InvalidEmployeeException("Invalid Employee"));
		Employee e2=null;
		emp = Optional.ofNullable(e2);
		emp.orElseThrow(()->new InvalidEmployeeException("Invalid Employee"));
		
	}

}
