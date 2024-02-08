package com.intrvw.questions;

import java.util.Scanner;

public class PalindromeStringCheck {

	private static String actualString = "abba";
	private static String reversedString = "";

	public static void main(String[] args) {
		checkPalindromeString(actualString);
	}

	private static boolean checkPalindromeString(String actualString) {

		for (int i = actualString.length() - 1; i >= 0; i--) {
			reversedString = reversedString + actualString.charAt(i);

		}

		if (actualString.equalsIgnoreCase(reversedString)) {
			System.out.println(reversedString + " is a Palindrome String.");
			return true;
		} else {
			System.out.println(reversedString + " is not a Palindrome String.");
			return false;
		}

	}

}
