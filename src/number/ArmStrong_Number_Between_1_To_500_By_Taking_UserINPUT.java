package number;

import java.util.Scanner;

public class ArmStrong_Number_Between_1_To_500_By_Taking_UserINPUT {

	public static void main(String[] args) {

		System.out.println("ArmStrong Number's between 1 to 500 are : ");
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter 1st number : ");
		int a = sc.nextInt();

		System.out.println(" Enter 2nd number : ");
		int b = sc.nextInt();

		for (int temp = a; temp < b; temp++) {

			int remainder;
			int result = 0;
			
			int temp1 = temp;//(we did all the calculations on temp1 variable and kept our original number as it is.)
			
			while (temp1 != 0) {
				remainder = temp1 % 10;
				result = ((remainder * remainder * remainder) + result);
				temp1 = temp1 / 10;

			}
			if (result == temp) {

				System.out.print(result + " ");
			}
		}
	}
}

