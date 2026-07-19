package app.test;

import java.util.Scanner;

public class String_Test {

	public static void main(String[] args) {

		while (true) {

			Scanner scanner = new Scanner(System.in);

			String s1 = scanner.nextLine();

			String s2 = scanner.nextLine();

//		String s1 = "Jwala";
//
//		String s2 = "umar";

			int i = s1.compareTo(s2);

//			System.out.println(i);
			if (i < 0) {

				System.out.println(-i * 100);

			} else if (i < 5) {

				System.out.println("54.6%");

			}

		}
	}
}
