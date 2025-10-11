package java8.naveenautomationlabs.strngg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLengthWithoutUsinglengthMethod {

	public static void main(String[] args) {
		/*
		 * How to find length of string in java without using length method?
		 * 
		 */

		String str = "jwala";

//		M1
		System.out.println(str.toCharArray().length);

//		M2
		System.out.println(str.lastIndexOf(""));

//		M3
		Matcher m = Pattern.compile("$").matcher(str);
		m.find();
		int len = m.end();
		System.out.println(len);

//		M4
		System.out.println(str.split("").length);

//		M5
		int counter = 0;
		for (int count : str.toCharArray()) {
			counter++;
		}
		System.out.println(counter);
		

	}

}
