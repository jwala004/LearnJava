package company.amazonintrvwprepn;

import java.util.Scanner;

public class SumOfDigitsInNumber {

	public static void main(String[] args) {

		int num1 = 12345;

		int num2 = 1234598765;

//		SumOfDigitsInNumber.sumOfDigitsOfNum(num1); // 15
//
//		System.out.println();// to just add new line
//
//		SumOfDigitsInNumber.sumOfDigitsOfNum(num2); // 50
//
//		System.out.println();// to just add new line

//		Taking user input
//		SumOfDigitsInNumber.sumOfDigitsOfNumTakingUserInput();

//		Running the function for infinite, until you manually kill the operation
//		while (true) {
//			SumOfDigitsInNumber.sumOfDigitsOfNumTakingUserInput();
//			System.out.println();// to just add new line
//		}

	}

	private static void sumOfDigitsOfNum(int number) {

		int modulus, sum = 0;

		while (number != 0) {
			modulus = number % 10;
			sum += modulus;
			number = number / 10;
		}

		System.out.print("Sum of digits is: " + sum);

	}

	private static void sumOfDigitsOfNumTakingUserInput() {

		int number, modulus, sum = 0;
		System.out.print("Enter the number: ");

		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();

		while (number != 0) {
			modulus = number % 10;
			sum += modulus;
			number = number / 10;
		}

		System.out.print("Sum of digits is: " + sum);
	}

}
