package com.wipro.lambdaExpressions;

import java.util.Scanner;

public class MyClassWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		WordCount wc = (str)->{
			String[] words = str.split(" ");
			return words.length;
		};
		System.out.println("No of words in the given String : "+wc.count(s));
	}

}
