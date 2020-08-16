package com.wipro.functionalInterface;

import java.util.ArrayList;
import java.util.function.Function;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{
			nums.add((int)(Math.random()*100));
		}
		Function<ArrayList<Integer>,Integer> func = (numbers)->{
			int sum =0;
			for(Integer a : numbers)
			{
				sum+=a;
			}
			return sum;
		};
		System.out.println("Sum of Numbers in ArrayList = "+func.apply(nums));
	}

}
