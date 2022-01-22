package com.intrvw.questions;

import java.util.Scanner;

public class ReverseStringUserInput {

	private static String reversedString = "";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string to reverse: ");

		System.out.println("Reversed String: " + reverseString(scanner.next()));
	}

	private static String reverseString(String originalString) {

		for (int i = originalString.length() - 1; i >= 0; i--) {
			reversedString = reversedString + originalString.charAt(i);
		}
		return reversedString;
	}

}
