package com.example.utils;

public class Util {

	public static void swap(int arr[], int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;

	}
	public static void printArrayHorizontallySpaced(int arr[])
	{
		int len = arr.length;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}
}
