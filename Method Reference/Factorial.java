package com.wipro.methodReference;

public class Factorial {
	public int findFactorial(int a)
	{
		int fact = 1;
		for(int i=2;i<=a;i++)
		{
			fact*=i;
		}
		return fact;
	}
}
