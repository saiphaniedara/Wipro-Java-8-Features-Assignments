package com.wipro.functionalInterface;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<ArrayList<Integer>> supp = ()->{
			int num=1;
			ArrayList<Integer> primes = new ArrayList<Integer>();
			Boolean isPrime;
			for(int i=0;i<10;i++)
			{
				isPrime = false;
				while(!isPrime)
				{
					if(num==2 || num==3)
					{
						isPrime = true;
					}
					else
					{
						int r = (int)Math.sqrt(num);
						for(int k=2;k<=r;k++)
						{
							if(num%k==0)
							{
								break;
							}
							if(k==r)
							{
								isPrime=true;
							}
						}
						if(!isPrime)
						{
							num++;
						}
					}
				}
				primes.add(num);
				num++;
			}
			return primes;
		};
		ArrayList<Integer> first10Primes = supp.get();
		System.out.println("First 10 Prime Numbers are :");
		first10Primes.forEach(System.out::println);
	}

}
