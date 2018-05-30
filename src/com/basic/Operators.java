package com.basic;

public class Operators {
	public static void main(String[] args)
	{
		int count=100,num=10;
		count++;
		System.out.println(count);
		count--;
		System.out.println(count);
		System.out.println(count*num);
		boolean isTrue=false;
		System.out.println(!isTrue);
		System.out.println(count==10 && isTrue);
		System.out.println(count==10 || !isTrue);
		System.out.println(count==10 & isTrue);
		num=num<<2;
		System.out.println(num);
		System.out.println(num%2==0 ? "divisible":"not divisible");
			
	}

}
