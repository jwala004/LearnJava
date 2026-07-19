package com.app.array;

// M-1 to find Common elements between two Arrays

public class Common_Elements_Between_TWO_ARRAYS {

	public static void main(String[] args) {
		int count = 0;
		int[] i1 = { 1, 2, 3, 4, 5, 6 };
		// common elements bw ARRAY i1 and ARRAY i2 is= 4,2,1,5
		int[] i2 = { 7, 8, 9, 5, 4, 2, 1, 2, 4, 2, 2, 4, 4, 2, 4, 2 };

		for (int i = 0; i < i1.length - 1; i++) {

			for (int j = 0; j < i2.length - 1; j++) {

				if (i1[i] == i2[j]) {
					count++;
				}
			}

			if (count >0) {
				System.out.println("Common Elements between ARRAY i1 and ARRAY i2 is : " + i1[i]);
			}
			count = 0;
		}
	}
}
