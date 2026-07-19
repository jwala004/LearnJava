package com.app.array;

public class Common_Elements_Between_TWO_ARRAYS_Using_Method_AS_Argumnet_M2 {

	public static void main(String[] args) {
		int[] i1 = { 1, 2, 3, 4, 5, 6 };
		// common elements bw ARRAY i1 and ARRAY i2 is= 4,2,1,5
		int[] i2 = { 7, 8, 9, 5, 4, 2, 1, 2, 4, 2, 2, 4, 4, 2, 4, 2 };

		Common_Elements_Between_TWO_ARRAYS_Using_Method_AS_Argumnet_M2.commonElements(i1, i2);

	}

	public static void commonElements(int[] i1, int[] i2) {
		for (int i = 0; i < i1.length - 1; i++) {

			for (int j = 0; j < i2.length - 1; j++) {

				if (i1[i] == i2[j]) {
					System.out.println(i1[i]);
				}
			}
		}
	}
}
