package com.wipro.functionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{
			numbers.add((int)(Math.random()*200));
		}
		Predicate<Integer> pred = (num)->{
			double rt = Math.sqrt(num);
			if(Math.floor(rt)==Math.ceil(rt)) {
				return true;
			}
			else
			{
				return false;
			}
		};
		System.out.println("Perfect Square Numbers : ");
		numbers.forEach((nm)->{
			if(pred.test(nm)) {
				System.out.println(nm);
			}
		});
	}

}
