package com.wipro.functionalInterface;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{
			numbers.add((int)(Math.random()*100));
		}
		Consumer<ArrayList<Integer>> cons = (nums)->{
			nums.forEach(num->{
				if(num%2==0)
				{
					System.out.println(num+" even");
				}
				else
				{
					System.out.println(num+" odd");
				}
			});
		};
		cons.accept(numbers);
	}

}
