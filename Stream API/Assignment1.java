package com.wipro.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> li = new ArrayList<Integer>();
		for(int i=0;i<20;i++)
		{
			li.add((int) (Math.random()*150));
		}
		List<Integer> even = li.stream().filter(num->num%2==0).collect(Collectors.toList());
		even.forEach(e->System.out.println(e));
	}

}
