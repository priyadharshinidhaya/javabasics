package com.basic;


public class Array2 {

	int arr[] = { 5, 3, 2, 7 };

	public void reverse() {

		for (int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		Array2 arr1 = new Array2();
		arr1.reverse();

	}
}
