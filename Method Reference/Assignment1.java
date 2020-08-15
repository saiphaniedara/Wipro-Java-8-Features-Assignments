package com.wipro.methodReference;

import java.util.Scanner;

public class Assignment1 {
	
	public static void main(String[] args) {
		
		FactorialDemo fdRef = new Factorial()::findFactorial;
		System.out.println("Enter a Number to find its factorial : ");
		int num = new Scanner(System.in).nextInt();
		System.out.println("Factorial = "+fdRef.factorial(num));
	}
}
