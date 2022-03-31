package java8.naveenautomationlabs.interviewquestions;

public class MaxAndMinNumber {

	/*
	 * Find out Max and Min number out of three given integer positive numbers
	 */

	int num1 = 10;
	int num2 = 20;
	int num3 = 30;

	public static void main(String[] args) {

//		returnNum(1111, 11, 111);

		int minval = min(17, min(21, 31));
		System.out.println("Minimum value: " + minval);

		int maxval = max(17, max(21, 31));
		System.out.println("Maximum value: " + maxval);

//		M3
//		checkMaxNum(17, 2, 3);
	}

	private static int min(int a, int b) {
		return ((a <= b) ? a : b);
	}

//	M2
	private static int max(int a, int b) {
		return ((a >= b) ? a : b);
	}

//	M1
	private static int returnNum(int num1, int num2, int num3) {

		if (num1 >= num2 && num1 >= num3) {
			System.out.println("Max number: " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("Max number: " + num2);
		} else if (num3 >= num1 && num3 >= num2) {
			System.out.println("Max number: " + num3);
		} else if (num1 <= num2 && num1 <= num3) {
			System.out.println("Min number: " + num1);
		} else if (num2 <= num1 && num2 <= num3) {
			System.out.println("Min number: " + num2);
		} else if (num3 <= num1 && num3 <= num2) {
			System.out.println("Min number: " + num3);
		}

		return 1;
	}

//	M3
	private static void checkMaxNum(int a, int b, int c) {
//		finding maximum number 
		if (a >= b) {
			if (a >= c)
				System.out.println("Max number: " + a);
			else
				System.out.println("Max number: " + c);
		} else {
			if (b >= c)
				System.out.println("Max number: " + b);
			else
				System.out.println("Max number: " + c);
		}

//		finding minimum number 
		if (a <= b) {
			if (a <= c)
				System.out.println("Min number: " + a);
			else
				System.out.println("Min number: " + c);
		} else {
			if (b <= c)
				System.out.println("Min number: " + b);
			else
				System.out.println("Min number: " + c);
		}

		/*
		 * Alogrithm to find the maximum number between three numbers
		 * 
		 * 1.Start
		 * 
		 * 2. Read the three numbers to be compared, as A, B and C.
		 * 
		 * 3. Check if A is greater than B.
		 * 
		 * 3.1 If true, then check if A is greater than C.
		 * 
		 * 3.1.1 If true, print 'A' as the greatest number.
		 * 
		 * 3.1.2 If false, print 'C' as the greatest number.
		 * 
		 * 3.2 If false, then check if B is greater than C.
		 * 
		 * 3.1.1 If true, print 'B' as the greatest number.
		 * 
		 * 3.1.2 If false, print 'C' as the greatest number.
		 * 
		 * 4. End Same goes for minimum in place of greatest use smallest.
		 */

	}

}
