package com.wipro.dateTimeAPI;

import java.time.LocalTime;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time : "+currentTime);
		System.out.println("Time before 5 hours and 30 minutes : "+currentTime.minusHours(5).minusMinutes(30));
	}

}
