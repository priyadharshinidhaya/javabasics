package com.basic;

public class Leap {
	public static void main(String[] args)
	{
		for(int i=2018;i<=2100;i++)
		{
			if(i%400==0 || i%100!=0 && i%4==0)
			{
				System.out.println(i);
				
			}
			
		}
	}

}
