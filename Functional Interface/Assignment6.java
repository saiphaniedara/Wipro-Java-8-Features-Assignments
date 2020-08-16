package com.wipro.functionalInterface;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Assignment6 {
	public static void main(String[] args) {
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
		Consumer<ArrayList<String>> cons = (ws)->{
			for(String w: ws)
			{
				int ind = ws.indexOf(w);
				ws.set(ind, new String(new StringBuffer(w).reverse()));
			}
		};
		cons.accept(words);
		words.forEach(System.out::println);
	}
}
