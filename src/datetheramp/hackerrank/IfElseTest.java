package datetheramp.hackerrank;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {

		System.out.println("Enter no.to check condition:");
		while (true) {
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("fifteen");
			} else if (i % 5 == 0) {
				System.out.println("five");
			} else if (i%3==0) {
				System.out.println("three");
			} else {

			}
		}
	}
}