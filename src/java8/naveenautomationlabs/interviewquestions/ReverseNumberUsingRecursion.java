package java8.naveenautomationlabs.interviewquestions;

public class ReverseNumberUsingRecursion {

	/*
	 * Reverse A Number using Recursion
	 * 
	 * if the number starts with double zero, then logic fails.
	 * 
	 */

	public static void main(String[] args) {
		reverseNum(04);

//		reverseNumUsingRecursion(23451);
//		System.out.println();
//		reverseNumUsingRecursion(00451);

//		System.out.println(10 % 3); // returns reminder
//		System.out.println(10 / 3);  // returns quotient

	}

//	M1 : Using loop
	private static void reverseNum(int number) {

		while (number > 0) {
			int revNum = number % 10;
			System.out.print(revNum);
			number = number / 10;
		}
	}

//	M2 : Using recusion
	private static void reverseNumUsingRecursion(int number) {

		if (number < 10) {
			System.out.print(number);
			return;
		} else {
			System.out.print(number % 10);
			reverseNumUsingRecursion(number / 10);
		}
	}

}
