package com.wipro.dateTimeAPI;

import java.time.LocalDate;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate todayDate = LocalDate.now();
		System.out.println("Today's Date : "+todayDate);
		System.out.println("Date after 10 Days : "+todayDate.plusDays(10));
	}

}
