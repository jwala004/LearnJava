package com.intrvw.questions;

public class StringFormatMethod {

	public static void main(String[] args) {

		String a = "Test1";
		String b = "Test2";
		String c = "Test3";
		
//		M-1
		System.out.println("Hello "+a+" Hello "+b+" Hello "+c);
		
//		M-2 using String.format() method
		System.out.println(String.format("Hello %s Hello %s Hello %s", a,b,c));
		
	}

}
