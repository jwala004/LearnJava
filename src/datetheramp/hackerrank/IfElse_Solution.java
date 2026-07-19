package datetheramp.hackerrank;

import java.util.Scanner;

public class IfElse_Solution {

	public static void main(String[] args) {
		while (true) {
			System.out.println("Enter the number to check the output :  ");
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();

			if (N % 3 == 0 && N%5!=0) {
				System.out.println("Three");
			} else if (N % 5 == 0 && N%3!=0) {
				System.out.println("Five");
			} else if (N % 3 == 0 && N % 5 == 0) {
				System.out.println("Fiftten");
			}

		}

	}
}