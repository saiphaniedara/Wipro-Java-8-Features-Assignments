package com.wipro.forEach;

import java.util.ArrayList;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> weekdays = new ArrayList<String>();
		weekdays.add("Sunday");
		weekdays.add("Monday");
		weekdays.add("Tuesday");
		weekdays.add("Wednesday");
		weekdays.add("Thursday");
		weekdays.add("Friday");
		weekdays.add("Saturday");
		weekdays.forEach(weekday->System.out.println(weekday));
	}

}
