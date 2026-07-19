package hackerrank;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */

		char[] ch = A.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			char s2 = ch[i];
			System.out.print(s2);
			// System.out.print(ch[i]);

			/*if (ch == s2) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}*/
		}

	}
}
