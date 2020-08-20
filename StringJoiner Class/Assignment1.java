package com.wipro.stringJoiner;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Sai Phani");
		names.add("Surya");
		names.add("Sandeep");
		names.add("Sai Krishna");
		names.add("Binod");
		StringJoiner s1 = new StringJoiner(", ", "{", "}");
		names.forEach(s1::add);
		System.out.println(s1);
	}

}
