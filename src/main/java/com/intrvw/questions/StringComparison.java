package com.intrvw.questions;

public class StringComparison {

	private static String str1 = "jwala";

	private static String str2 = "Jwala";

	public static void main(String[] args) {

		System.out.println("Using equals method for comparison: " + str1.equals(str2) + " " + str1 + " " + str2);

		System.out.println("Using equalsIgnoreCase method for comparison: " + str1.equalsIgnoreCase(str2) + " " + str1
				+ " " + str2);

		System.out.println("Using compareTo method for comparison: " + str1.compareTo(str2) + " " + str1 + " " + str2);

		System.out.println("Using compareToIgnoreCase method for comparison: " + str1.compareToIgnoreCase(str2) + " "
				+ str1 + " " + str2);

	}

}
