package com.wipro.optionalClass;

import java.util.Optional;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] =new String[5];
		Optional<String> name = Optional.ofNullable(names[0]); 
		if(name.isPresent())
		{
			System.out.println(name.get().length());
		}
	}

}
