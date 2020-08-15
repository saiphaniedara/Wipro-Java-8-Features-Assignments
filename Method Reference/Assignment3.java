package com.wipro.methodReference;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		CheckPrimeInterface cpRef = CheckPrime::new;
		System.out.println("Enter a number to check whether it is Prime or not : ");
		int num = new Scanner(System.in).nextInt();
		cpRef.verifyPrime(num);
	}
}
