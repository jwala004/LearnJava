package company.paytm;

import java.util.Arrays;

public class Array1 {

	/*
	 * Given an array, in the ascending order in which value of 1 is repeating.
	 * Replace the value of 1 at 4th index with 4.
	 * 
	 * Prior condtion:
	 * 
	 * 1. Do not extend/truncate the size of the array.
	 * 
	 * 2.
	 */
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 1, 5, 6 };

		Array1.replace2ndIndexIfOne(arr1);

		System.out.println(Arrays.toString(arr1));

	}

	private static void replace2ndIndexIfOne(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] == 1) {
				arr[i] = 4;
			}
		}

	}

}
