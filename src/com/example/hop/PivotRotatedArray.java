package com.example.hop;

public class PivotRotatedArray {

	// For Testing pivot point
	public static void main(String args[]) {

		int arr1[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
		System.out.println(searchInRotatedArrayWithoutFindingPivot(arr1, 0, arr1.length - 1,19));
		printPivot(arr1, searchInRotatedArrayWithoutFindingPivot(arr1, 0, arr1.length - 1,19));
		int arr2[] = { 3, 4, 5, 1, 2 };
		/*printPivot(arr2, findPivot(arr2, 0, arr2.length - 1));
		int arr3[] = { 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1 };
		printPivot(arr3, findPivot(arr3, 0, arr3.length - 1));
		int arr4[] = { 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1 };
		printPivot(arr4, findPivot(arr4, 0, arr4.length - 1));
*/
	}

	public static int searchInRotatedArrayWithoutFindingPivot(int arr[],
			int start, int end, int k) {

		int mid = start + (end - start) / 2;

		if (arr[mid] == k)
			return mid;
		if (end == start)
			return -1;

		// left half is sorted
		if (arr[mid] > arr[start]) {
			if (arr[mid] < k && arr[start] < k) {
				// k lies in left half
				end = mid - 1;
			} else {

				start = mid + 1;
			}

		} else {
			// right half is sorted

			// k lies in right half
			if (k > arr[mid] && k < arr[end]) {
				start = mid + 1;
			} else {
				end = end - 1;
			}
		}
	
		return searchInRotatedArrayWithoutFindingPivot(arr, start, end, k);
	}

	public static void printPivot(int arr[], int index) {
		if (index >= 0 && index <= arr.length - 1)
			System.out.println(arr[index]);
	}

	public static int findPivot(int arr[], int low, int high) {

		// System.out.println(":low:" + low + ":high:" + high);

		int mid = low + (high - low) / 2;

		// System.out.println("mid:" + mid + ":low:" + low + ":high:" + high);

		if (high - low == 1) {
			if (arr[low] >= arr[high])
				return low;
			return -1;
		}

		if (arr[mid] >= arr[high]) {
			// System.out.println("move right:" + mid + ":tigh:" + high);
			return findPivot(arr, mid, high);
		} else {
			// System.out.println("move left:" + mid + ":tigh:" + high);
			return findPivot(arr, low, mid);
		}

	}

}
