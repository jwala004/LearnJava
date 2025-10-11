package com.intrvw.questions;

public class ConvertStringToCharacter {

	private static String str1 = "jwala";
	
	private static String str2 = "sharma";
	

	public static void main(String[] args) {

//	Method - 1
	convertToCharacterM1(str1);

	System.out.print("==============================================================================================\n");
	
//	Method - 2
	convertToCharacterM2(str2);
		

	}

	private static void convertToCharacterM1(String inputString) {
		for (int i = 0; i < inputString.length(); i++) {
			System.out.println("Character at " + i + " is: " + inputString.charAt(i));
		}
	}

	private static void convertToCharacterM2(String inputString) {
		
		char[] charArr = inputString.toCharArray();
		
		for (int i = 0; i < charArr.length; i++) {
			System.out.println("Character at " + i + " is: " + charArr[i]);
		}
	}
}
