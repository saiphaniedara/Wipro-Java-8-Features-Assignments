package com.wipro.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> words = new ArrayList<String>();
		words.add("sai");
		words.add("phani");
		words.add("surya");
		words.add("adda");
		words.add("nalan");
		words.add("bhargav");
		words.add("madam");
		words.add("manam");
		words.add("broom");
		words.add("naman");
		Predicate<String> pred = (word)->{
			if(word.equalsIgnoreCase(new String(new StringBuffer(word).reverse())))
			{
				return true;
			}
			else
			{
				return false;
			}
		};
		List<String> palindromes = words.stream().filter(pred::test).collect(Collectors.toList());
		System.out.println("Palindromes are : ");
		palindromes.forEach(System.out::println);
	}

}
