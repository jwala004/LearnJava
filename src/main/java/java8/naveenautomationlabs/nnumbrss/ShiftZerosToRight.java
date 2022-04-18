package java8.naveenautomationlabs.nnumbrss;

import java.util.Arrays;

public class ShiftZerosToRight {

	public static void main(String[] args) {

		int arr[] = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };

//		shiftZerostoEnd(arr);

//		System.out.println("Array after pushing zeros to the back: ");

//		for (int i = 0; i < arr.length; i++) {
////			System.out.print(arr[i] + " ");
//		}

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		System.out.println("SOrted array");
		
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

//		for (int i = 0; i < arr.length; i++) {
////			System.out.print(arr[i] + " ");
//		}
//		

	}

	private static void shiftZerostoEnd(int[] arry) {

		int count = 0; // Count of non-zero elements

		// Traverse the array. If element encountered is
		// non-zero, then replace the element at index 'count'
		// with this element
		for (int i = 0; i < arry.length; i++) {
			if (arry[i] != 0) {
				arry[count++] = arry[i]; // here count is incremented
			}
		}

		System.out.println("============>" + count);

		// Now all non-zero elements have been shifted to
		// front and 'count' is set as index of first 0.
		// Make all elements 0 from count to end.
		while (count < arry.length) {
			arry[count++] = 0;
		}

		System.out.println("============>" + count);

	}

}
