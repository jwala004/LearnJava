package com.intrvw.questions;

public class CapitalizeFirstCharacterofString {

	public static void main(String[] args) {
		String input = "my name is ranjan";
		String[] inputArr = input.split(" ");

//		System.out.print("Before capitalizing each first character of text in the array: ");
//		for (String word : inputArr) {
//
//			System.out.print(word + " ");
//		}

		System.out.print("\n" + "After capitalizing each first character of text in the array: ");
		for (String word : inputArr) {

			System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1, word.length()) + " ");
		}
	}

}
