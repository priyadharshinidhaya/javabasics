package com.basic;

public class Rectangle {
	float length;
	float breadth;
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
	    if(length>0&&length<20)
		{
		this.length=length;
		}
	}
	public float getBreadth() {
		return breadth;
	}
	public void setBreadth(float breadth) {
		if(breadth>0&&breadth<20)
		{
		this.breadth=breadth;
		}
		
	}
	public void area()
	{
		float area=length*breadth;
		System.out.println(area);
	}
	public void perimeter()
	{
		float perimeter=2*(length+breadth);
		System.out.println(perimeter);
		
	}
	public static void main(String[] args)
	{
		Rectangle r1=new Rectangle();
		r1.setLength(19);
		r1.setBreadth(10);
		r1.area();
		r1.perimeter();
	}

}
