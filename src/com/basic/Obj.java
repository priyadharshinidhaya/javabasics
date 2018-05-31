package com.basic;

public class Obj {

	public void changeInt(int i) {

		i = 0;
		i = i + 10;
	}

	public static void main(String[] args) {
		Obj ob1 = new Obj();
		int count = 100;
		ob1.changeInt(count);
		System.out.println(count);
	}
}