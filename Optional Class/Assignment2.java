package com.wipro.optionalClass;

import java.util.Optional;

public class Assignment2 {
	public String address;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2 a2 = new Assignment2();
		Optional<String> add = Optional.ofNullable(a2.address);
		System.out.println("When null : "+add.orElse("India"));
		a2.address="Sangareddy";
		add = Optional.ofNullable(a2.address);
		System.out.println("When not null : "+add.orElse("India"));
	}

}
