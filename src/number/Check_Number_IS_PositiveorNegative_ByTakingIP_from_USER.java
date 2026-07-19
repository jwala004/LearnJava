package number;

import java.util.Scanner;

public class Check_Number_IS_PositiveorNegative_ByTakingIP_from_USER {

	public static void main(String[] args) {

		while (true) {
			System.out.println("Enter the Number to check Positive or Negative : ");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			if (a > 0) {
				System.out.println("Positive number");
			} else {
				System.out.println("Negative number");
			}

		}

	}
}