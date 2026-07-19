package com.app.array;

public class Even_AND_Odd_Elements_Of_AN_ARRAY_in_2_Seprate_ARRAYS {

	public static void main(String[] args) {

		int[] i1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.print("Even elements of ARRAY: [");
		for (int i = 0; i < 10; i++) {
			if (i1[i] % 2 == 0) {
				System.out.print(" " + i1[i]);
			}
		}
		System.out.print(" ]");
		System.out.println(" ");
		System.out.print("Odd elements of ARRAY: [");
		for (int i = 0; i < 10; i++) {
			if (i1[i] % 2 != 0) {
				System.out.print(" " + i1[i]);
			}
		}
		System.out.print(" ]");

	}
}
