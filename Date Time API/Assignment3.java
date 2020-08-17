package com.wipro.dateTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate joiningDate = LocalDate.of(2020, 9, 20);
		LocalDate leavingDate = LocalDate.of(2025, 7, 15);
		System.out.println("Joining Date : "+joiningDate);
		System.out.println("Leaving Date : "+leavingDate);
		Period period = Period.between(joiningDate, leavingDate);
		System.out.println("Experience : ");
		System.out.println("No of years : "+period.getYears());
		System.out.println("No of Months : "+period.getMonths());
		System.out.println("No of Days : "+period.getDays());
	}

}
