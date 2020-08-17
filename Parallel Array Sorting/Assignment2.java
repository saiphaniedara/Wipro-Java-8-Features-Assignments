package com.wipro.parallelArraySort;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		Arrays.parallelSort(arr);
		String out = new String(arr);
		System.out.println("Input : "+str);
		System.out.println("Output : "+out);
	}

}
