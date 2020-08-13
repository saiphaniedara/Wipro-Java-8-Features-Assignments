package com.wipro.interfaces;

import java.util.Scanner;

public class Assignment2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = (a,b,c)->a+b+c;
		Test t2 = (a,b,c)->a*b*c;
		System.out.println("Enter Number 1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Number 2 : ");
		int num2 = sc.nextInt();
		System.out.println("Enter Number 3 : ");
		int num3 = sc.nextInt();
		System.out.println("Sum of "+num1+", "+num2+" and "+num3+" is "+t1.myFunction(num1, num2, num3));
		System.out.println("Product of "+num1+", "+num2+" and "+num3+" is "+t2.myFunction(num1, num2, num3));
	}

}
