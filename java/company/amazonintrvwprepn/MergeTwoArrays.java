package company.amazonintrvwprepn;

import java.util.Arrays;

public class MergeTwoArrays {

	/*
	 * Java Program to Merge Two Arrays
	 * 
	 * Given two arrays, the task is to merge or concatenate them and store the
	 * result into another array.
	 * 
	 * Examples:
	 * 
	 * Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8}
	 * 
	 * Output: arr3[] = {1, 3, 4, 5, 2, 4, 6, 8}
	 * 
	 * Input: arr1[] = { 5, 8, 9}, arr2[] = {4, 7, 8}
	 * 
	 * Output: arr3[] = {5, 8, 9, 4, 7, 8}
	 */
	public static void main(String[] args) {

//		MergeTwoArrays.mergeTwoArrays();
		
		MergeTwoArrays.mergeTwoArraysWthOutUsngInbuiltFunc();

	}

//	Method 1: Using Predefined function
	private static void mergeTwoArrays() {
		// first array
		int[] a = { 10, 20, 30, 40 };

		// second array
		int[] b = { 50, 60, 70, 80 };

		// determines length of firstArray
		int a1 = a.length;

		// determines length of secondArray
		int b1 = b.length;

		// resultant array size
		int c1 = a1 + b1;

		// create the resultant array
		int[] c = new int[c1];

		// Using the pre-defined function arraycopy
		System.arraycopy(a, 0, c, 0, a1);
		System.arraycopy(b, 0, c, a1, b1);

		// Prints the resultant array
		System.out.println(Arrays.toString(c));
	}
	/*
	 * Time Complexity: O(M + N) Auxiliary Space: O(M + N)
	 * 
	 * Here, M is the length of array a and N is the length of array b.
	 */
	
//	Method 2: Without using pre-defined function
	private static void mergeTwoArraysWthOutUsngInbuiltFunc() {
		// first array
		int a[] = { 30, 25, 40 };
		// second array
		int b[] = { 45, 50, 55, 60, 65 };

		// determining length of first array
		int a1 = a.length;
		// determining length of second array
		int b1 = b.length;

		// resultant array size
		int c1 = a1 + b1;

		// Creating a new array
		int[] c = new int[c1];

		// Loop to store the elements of first
		// array into resultant array
		for (int i = 0; i < a1; i++) {
			// Storing the elements in
			// the resultant array
			c[i] = a[i];
		}

		// Loop to concat the elements of second
		// array into resultant array
		for (int i = 0; i < b1; i++) {
			// Storing the elements in the
			// resultant array
			c[a1 + i] = b[i];
		}

		// Loop to print the elements of
		// resultant array after merging
//		for (int i = 0; i < c1; i++) {
//			// print the element
//			System.out.println(c[i]);
//		}
		
		System.out.println(Arrays.toString(c));

	}

}
