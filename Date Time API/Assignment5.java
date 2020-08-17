package com.wipro.dateTimeAPI;

import java.time.LocalTime;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time : "+currentTime);
		System.out.println("Time after 25 minutes : "+currentTime.plusMinutes(25));
	}

}
