package com.basic;

public class Array {
	int number=9876;
	int[] array=new int[10];
	public void arraySplitUp()
	{
		int t,s;
		t=number;
        
		for(int i=0;i<array.length;i++)
		{
			
			s=t%10;
			array[i]=s;
			System.out.println(array[i]);
			t=t/10;
			
		}
		
	}
	public static void main(String[] args)
	{
		Array a1=new Array();
		a1.arraySplitUp();
		
	}
}
	