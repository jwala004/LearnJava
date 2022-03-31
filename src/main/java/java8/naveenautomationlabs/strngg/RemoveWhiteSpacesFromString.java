package java8.naveenautomationlabs.strngg;

import groovyjarjarantlr.StringUtils;

public class RemoveWhiteSpacesFromString {

	/*
	 * How to remove white spaces from string?
	 */
	public static void main(String[] args) {

		String str = "    Selenium        is awesome   ";

//		M1

//		String[] strArry = str.split(" ");
//		for(int i = 0; i < strArry.length; i++) {
//			System.out.print(strArry[i]);
//		}

//		M2

		System.out.println(str.replaceAll("\\s", ""));

//		M3
		System.out.println();

	}

}
