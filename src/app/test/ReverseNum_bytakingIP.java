package app.test;

import java.util.Scanner;

public class ReverseNum_bytakingIP {

	public static void main(String[] args) {
		
		while (true) {
			System.out.println("Enter the String/Number to check:  ");
			Scanner sc = new Scanner(System.in);
			String s1 = sc.nextLine();

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
}
