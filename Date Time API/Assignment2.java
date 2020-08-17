package com.wipro.dateTimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate todayDate = LocalDate.now();
		System.out.println("Today's Date : "+todayDate);
		LocalDate nextMonth2ndSun = todayDate.plusMonths(1).with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
		System.out.println("Date of next month second sunday : "+nextMonth2ndSun);
	}

}
