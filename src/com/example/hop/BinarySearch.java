package com.example.hop;

public class BinarySearch {
	
	public static int binarySearch(int arr[], int start, int end, int k) {

		int mid = start + (end - start) / 2;
		if (arr[mid] == k)
			return mid;
		if (start == end)
			return -1;
		if (arr[mid] > k) {
			return binarySearch(arr, start, mid - 1, k);
		} else {
			return binarySearch(arr, mid + 1, end, k);
		}

	}

	public static void main(String arg[]) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(binarySearch(arr, 0, arr.length - 1, 9));
	}

}