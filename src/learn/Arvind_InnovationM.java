package com.java.learn;

import java.util.Arrays;

public class Arvind_InnovationM {

//	static int counter = 0;

	public static void main(String[] args) {

		String a1 = "Arvind singh tomar Arvind Arvind singh singh singh";

		int counter = 0;

//		a1 = a1.toLowerCase();
		
		
		String[] splittedString = a1.split(" ");

		for (int i = 0; i < splittedString.length; i++) {

			counter = 0;

			for (int j = i + 1; j < splittedString.length; j++) {

				if (splittedString[i].equals(splittedString[j])) {

					counter++;

					splittedString[j] = "0";

				}

			}

//			if (counter > 1 ) {
			if (counter > 1 && splittedString[i] != "0") {

				System.out.print(splittedString[i] + " ");
			}

		}

	}

}

//for( int j = 1 ; i < splittedString.length  ; j++) {
//	
//	if(splittedString[i] == splittedString[i+1]) {
//		
//		System.out.print(splittedString[i]+" ");
//		
//	}	
//}