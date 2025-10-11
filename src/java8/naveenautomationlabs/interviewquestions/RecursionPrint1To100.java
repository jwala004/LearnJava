package java8.naveenautomationlabs.interviewquestions;

import java.util.stream.IntStream;

public class RecursionPrint1To100 {

	static int fact = 1;

	public static void main(String[] args) {

		/*
		 * There are two ways to print from (1 to 100) without using any loop. 1.
		 * Recursion 2. Java Streams
		 * 
		 */

//		M1
//		int num = 5;
//		RecursionPrint1To100 rr = new RecursionPrint1To100();
//		rr.factorial(num);
//		System.out.println("Factorial of : " + num + " is " + fact);

//		M2
//		System.out.println("Factorial : " + factorial2(6));

		// M3
//		RecursionPrint1To100.factorial3(1);

//		M4 Create a generic method to print 1 to 100 
//		RecursionPrint1To100.factorial4(1, 100);

//		M5 using Streams
		IntStream.range(1, 101).forEach(e -> System.out.println(e));

	}

	private static void factorial4(int startNum, int endNum) {

		if (startNum <= endNum) {
			System.out.println(startNum);
			startNum++;
			factorial4(startNum, endNum);
		}

	}

	private static void factorial3(int num) {

		if (num <= 100) {
			System.out.println(num);
			num++;
			factorial3(num);
		}

	}

	private static int factorial2(int num) {

		int fact = 1;

		if (num > 1) {
			fact = num * factorial2(num - 1);
		}

		return fact;

	}

	private void factorial(int num) {

		if (num >= 1) {
			fact = fact * num;
			factorial(num - 1);
		}

	}
}
