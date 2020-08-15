package com.wipro.methodReference;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterInterface ciRef = Counter::digitCount;
		System.out.println("Enter a number to find the no of digits in it : ");
		int num = new Scanner(System.in).nextInt();
		System.out.println("No of digits = "+ciRef.noOfDigits(num));
	}
}
