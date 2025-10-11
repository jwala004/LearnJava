package com.intrvw.questions;

public class ReverseString {

	private static String originalString = "jwala";
	private static String reversedString = "";

	public static void main(String[] args) {

//		System.out.println("Reversed String M1: "+reverseString(originalString));
		System.out.println("Reversed String M2: "+reverseStringM2(originalString));
	}

	private static String reverseString(String originalString) {

		for (int i = originalString.length() - 1; i >= 0; i--) {
			reversedString = reversedString + originalString.charAt(i);
		}
		return reversedString;
	}
	
//	Reverse string using toCharArray(), 1st converting the string into character array, then iterating them.
	private static String reverseStringM2(String originalString) {
		
		char[] strArray = originalString.toCharArray();

		for (int i = strArray.length - 1; i >= 0; i--) {
			reversedString = reversedString + strArray[i];
		}
		return reversedString;
	}

}
