package com.wipro.interfaces;

public interface Vehicle {
	default void message()
	{
		System.out.println("Inside Vehicle");
	}
}
