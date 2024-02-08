package java8.naveenautomationlabs.interviewquestions;

import java.util.Arrays;

public class PasswordStore {

	/*
	 * Why password should be stored in char array char[] instead of string? The
	 * main reason is that, String is basically immutable in Java. So, even if we
	 * change iton runtime, the previous And if there is need to store in String,
	 * then we should not store it directly.
	 */
	public static void main(String[] args) {

		String pwd = "jwala909";

		System.out.println("password is: " + pwd);

		char[] c = { 'a', 'b', 'c', 'd', 'e', '1' };
		System.out.println("password is: " + c);

		Arrays.fill(c, '*');
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}

	}

}
