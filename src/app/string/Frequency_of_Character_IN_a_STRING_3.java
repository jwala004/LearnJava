package app.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// M-3 by taking input from user
public class Frequency_of_Character_IN_a_STRING_3 {

	public static void main(String[] args) throws IOException {
		// String s = "ABRAKADABRA";

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the String: ");
		String ss = bufferedReader.readLine();

		System.out.println("Enter the Character to find frequecy: ");
		char c = (char) System.in.read();

		int count = 0;

		for (int i = 0; i < ss.length(); i++) {

			if (c == ss.charAt(i)) {
				count++;
			}
		}

		System.out.println("Frequecy of " + c + " in " + ss + " is " + count);
	}

}
