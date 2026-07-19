package com.app.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayInsert {

	public static void main(String[] args) {
	
		Integer[] a = { 1, 2, 3, 4, 5 };
//System.out.println(a.toString());
		System.out.println("Elements of Array a Before insert: " + Arrays.toString(a));
		/*
		 * for (int i = 0; i < a.length; i++) {
		 * System.out.print("Elements of Array a Before insert: " + a[i]); }
		 */
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(a));
//		list.add(699);
		list.add(3, 46);

		System.out.println("Elements of Array a After insert:" + list);
	}

}
