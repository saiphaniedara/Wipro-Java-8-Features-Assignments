package com.wipro.interfaces;

public class Car implements Vehicle, FourWheeler{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		Vehicle.super.message();
	}
	
}
