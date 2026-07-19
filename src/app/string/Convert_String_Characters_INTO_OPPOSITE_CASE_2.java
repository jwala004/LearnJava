package app.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// M-2  
public class Convert_String_Characters_INTO_OPPOSITE_CASE_2 {
// My Name is Jwala Kumar
	void m() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String s = br.readLine();
		int i, l;
		char ch;
		l = s.length();
		for (i = 0; i < l; i++) {
			ch = s.charAt(i);
			if (Character.isUpperCase(ch))
				System.out.print(Character.toLowerCase(ch));
			else if (Character.isLowerCase(ch))
				System.out.print(Character.toUpperCase(ch));
			else
				System.out.print(ch);
		}
	}

	public static void main(String[] args) throws IOException {
		Convert_String_Characters_INTO_OPPOSITE_CASE_2 aa = new Convert_String_Characters_INTO_OPPOSITE_CASE_2();
		aa.m();

	}

}
