package com.wipro.stringJoiner;

import java.util.StringJoiner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner s1 = new StringJoiner("-");
		s1.add("Hyderabad");
		s1.add("Bangalore");
		s1.add("Mumbai");
		s1.add("Chennai");
		s1.add("Goa");
		StringJoiner s2 = new StringJoiner("-");
		s2.add("Delhi");
		s2.add("Pune");
		s2.add("Gurgaon");
		s2.add("Jhansi");
		System.out.println(s2.merge(s1));
		System.out.println(s1.merge(s2));
	}

}
