package com.intrvw.questions;

import java.util.Scanner;

public class PalindromeStringCheckUserInput {

	public static String actualString = "jwala";
	public static String reversedString = "";

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input String: ");

		checkPalindromeString(scanner.next());
	}

	public static boolean checkPalindromeString(String actualString) {

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
