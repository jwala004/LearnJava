package java8.naveenautomationlabs.nnumbrss;

public class PrimeNumberbetween1To100 {

	/*
	 * Program to display the prime numbers from 1 to 100
	 */

	public static void main(String[] args) {

		PrimeNumberbetween1To100.primeNum();

//		
//		PrimeNumberbetweenNum1AndNum2.primeNum2();
	}

//	M1
	private static void primeNum() {

		for (int i = 1; i <= 100; i++) {

			int counter = 0;

			for (int num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
//				Print Prime numbers
				System.out.print(i + " ");
			}
		}
	}

//	M2
	private static void primeNum2() {
		// Empty String
		String primeNumbers = "";

		for (int i = 1; i <= 100; i++) {
			int counter = 0;
			for (int num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
//			Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 100 are : " + primeNumbers);
	}

}
