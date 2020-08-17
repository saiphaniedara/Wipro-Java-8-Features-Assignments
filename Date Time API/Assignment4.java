package com.wipro.dateTimeAPI;

import java.time.LocalDate;

public class Assignment4 {
	public static void main(String[] args) {
		LocalDate todayDate = LocalDate.now();
		System.out.println("Current Year : "+todayDate.getYear());
		System.out.println("Is it a Leap Year : "+todayDate.isLeapYear());
	}
}
