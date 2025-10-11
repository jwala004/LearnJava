package com.intrvw.questions;

public class ConvertStringToCharArray {

	public static void main(String[] args) {

		String str = "jwala the boy";

		char[] c = str.toCharArray();

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + ",");
		}

	}

}
