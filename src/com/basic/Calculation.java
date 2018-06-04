package com.basic;

public class Calculation {
	public static void main(String[] args) {
		Calculation calc = new Calculation();
		boolean retValue = calc.isMultiple(2, 6);
		calc.isEven(4);
		
		calc.perfectNumber(6);
		System.out.println(calc.celcius(98));
		System.out.println(calc.isEven(3));
		System.out.println(retValue);
		calc.reverse();
	}

	public boolean isMultiple(int one, int second) {
		int three = second % one;
		return (three == 0) ? true : false;

	}
	public boolean isEven(int four)
	{
		return (four%2==0)? true:false;
	}
	public double celcius(int fahrenheit)
	{
		double celsius;
		celsius= (5.0 / 9.0) * ( fahrenheit - 32 );	
		return celsius;
	}
	
	public void perfectNumber(int num)
	{
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			sum=sum+i;	
		}
		if(sum==num)
		System.out.println("Given number is perfect number");
		else
		System.out.println("Not a perfect number");	
		
	}
	public void reverse()
	{
		int remainder,reversedNumber=0,number=9876;
		while(number != 0)
	    {
	        remainder = number%10;
	        reversedNumber = reversedNumber*10 + remainder;
	        number /= 10;
	    }

	    System.out.println("Reversed Number is "+reversedNumber);

		}
		
	}
    

