package com.java.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitString {
	public static void main(String[] args) {
		String str = "Welcome to JavabyRangaReddy blog";
		String delimiter = " "; // here delimiter is space
		List<String> list = new ArrayList<String>(); // list is used to store the words
		int i, start = 0, end = 0;
		for (i = str.indexOf(delimiter); i != -1; i = str.indexOf(delimiter, i + 1)) {
			end = i;
			list.add(str.substring(start, end)); // by using substring we can get the one word
			start = i;
		}
		list.add(str.substring(end)); // this is used to add the last word

		// Converting list to array of strings
		String[] words = (String[]) list.toArray(new String[list.size()]);

		String arrayIntoString = Arrays.toString(words);
		
		System.out.print(arrayIntoString);
		
		

	}
}