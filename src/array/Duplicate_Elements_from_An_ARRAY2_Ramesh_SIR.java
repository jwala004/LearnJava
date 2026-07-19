package com.app.array;

public class Duplicate_Elements_from_An_ARRAY2_Ramesh_SIR {

	public static void main(String[] args) {

		Integer[] a = { 1, 2, 3, 4, 5, 3, 3, 7, 9, 2, 3, 2, 5, 5, 1, 1, 13, 2, 3, 2, 2 };
		int count = 0;
		int flag = 0;

		for (int i = 0; i < a.length - 1; i++) {
			// int max = a[i];

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
//			System.out.println(count);
			if (count == 1) {
				flag++;
				System.out.println("Duplicate Elements : " + a[i]);
			}
			count = 0;
		}

		System.out.println("Total Duplicate Elements : " + flag);
	}
}
