package com.app.array;

import java.util.Arrays;
//Method 2 insert an element into an array

public class ArrayInsert_2 {

	public static void main(String[] args) {

		Integer[] a = { 1, 2, 3, 4, 5 };
		int Index_position = 1;

		int newValue = 55;

		System.out.println("Original Array : " + Arrays.toString(a));

		for (int i = a.length-1; i > 1; i--) {

			a[i] = a[i - 1];
		}
		a[Index_position] = newValue;

		System.out.println("New Array: " + Arrays.toString(a));
//when u will print the values of Array after inserting/updating new element here in this case, 
//then the last element will not be printed(or get omitted),because arrays are not growable in nature,like collections
//so, when we will print the values, last element will be omitted.
		
	}

}
