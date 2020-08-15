package com.wipro.methodReference;

public class CheckPrime {
	public CheckPrime(int num)
	{
		Boolean isPrime=false;
		if(num==2 ||num==3)
		{
			isPrime = true;
		}
		else
		{
			int r =(int)Math.sqrt(num);
			for(int i=2;i<=r;i++)
			{
				if(num%i==0)
				{
					break;
				}
				if(i==r)
				{
					isPrime = true;
				}
			}
		}
		if(isPrime)
		{
			System.out.println("Is a Prime");
		}
		else
		{
			System.out.println("Not a Prime");
		}
	}
}
