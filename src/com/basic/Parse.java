package com.basic;

public class Parse {
	public static void main(String[] args) {
		double sum=0;
		for(int i=0;i<args.length;i++)
		{
			
			double no=Double.parseDouble(args[i]);
			sum=sum+no;
		}
		System.out.println(sum);
		
		
	}

}
