package com.wipro.lambdaExpressions;

import java.util.ArrayList;
import java.util.Random;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		ArrayList<Integer> al = new ArrayList<Integer>(25);
		for(int i = 0;i<25;i++)
		{
			al.add(random.nextInt(200));
		}
		al.forEach(num->{
			Boolean isPrime = false;
			if(num==2 || num==3)
			{
				isPrime=true;
			}
			else
			{
				int r = (int) Math.sqrt(num);
				for(int j=2;j<=r;j++) {
					if(num%j==0)
					{
						break;
					}
					if(j==r)
					{
						isPrime=true;
					}
				}
				if(isPrime)
				{
					System.out.println(num);
				}
			}
		});

	}

}
