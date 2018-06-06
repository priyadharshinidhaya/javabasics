package com.basic;

public class Taxi extends Car {
	@Override
	public void brake() {
		System.out.println("taxi's brake");

	}
	public static void main(String[] args) {
		Car test1=new Taxi();
		test1.brake();		
		System.out.println(test1 instanceof Car);
	}
}
