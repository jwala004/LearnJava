package com.app.array;

public class ArrayRetrieve {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		System.out.print("Elements of Array a: [");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" "+a[i]);
		}
		System.out.print( "]");
	}

}
