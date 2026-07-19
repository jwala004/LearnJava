package com.app.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicate_Elements_from_An_ARRAY {

	public static void main(String[] args) {

		Integer[] a = { 1, 2, 3, 4, 5, 3, 3, 7, 9, 2, 3, 2 };

		for (int i = 0; i < a.length - 1; i++) {
//			int temp = 0;
			for (int j = i + 1; j < a.length - 1; j++) {

//				if ((a[i] == a[j]) && (i != j)) {
				if ((a[i] == a[j]) && (i != j)) {
					System.out.print(" " + a[j]);
					/*int temp = a[j];*/
//					break;
					/*System.out.print(" " + temp);*/
				}

			}

		}

	}

}
