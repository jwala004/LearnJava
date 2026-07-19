package app.test;

import java.util.Scanner;

public class ReverseNum_2 {

	public static void main(String[] args) {

		
		String s1 ="121333";
		System.out.println("[Before reversing String s1]: " + s1);

		StringBuilder sb = new StringBuilder(s1);

		String s2 = sb.reverse().toString();// storing String s1 after reversing it
		System.out.println("[After reversing String s1]: " + s2);
		if (s1.equals(s2)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}


	}

}
