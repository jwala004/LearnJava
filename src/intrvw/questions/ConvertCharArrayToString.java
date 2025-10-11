package com.intrvw.questions;

public class ConvertCharArrayToString {

	public static void main(String[] args) {
		char[] ch = {'a', 'e', 'i', 'o', 'u'};

//		M-1
        String st = String.valueOf(ch);
//      M-2
        String st2 = new String(ch);

        System.out.println(st);
        System.out.println(st2);
	}

}
