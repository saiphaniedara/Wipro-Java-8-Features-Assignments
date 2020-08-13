package com.wipro.lambdaExpressions;

import java.util.ArrayList;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sai");
		al.add("Phani");
		al.add("Edara");
		al.add("Surya");
		al.add("Krishna");
		al.add("Pavan");
		al.add("Sharath");
		al.add("Sandeep");
		al.add("Anish");
		al.add("Nikhil");
		al.forEach(name->{
			if(name.length()%2!=0)
			{
				System.out.println(name);
			}
		});
	}

}
