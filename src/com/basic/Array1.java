package com.basic;

public class Array1 {
	int arr[] = { 5, 3, 2, 7, 8, 0, 67 };
	int i, max, min;

	public void maxArray() {
		max = arr[0];
		for (i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Maximum is" + max);

	}

	public void minArray() {
		min = arr[0];
		for (i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}

		}
		System.out.println("Minimum is" + min);
	}

	public static void main(String args[]) {
		Array1 arr = new Array1();
		arr.maxArray();
		arr.minArray();
	}
}
