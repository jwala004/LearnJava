package java8.naveenautomationlabs.javaprogram.interviewquestions;

public class Print1To100WithoutUsingNumber {

	public static void main(String[] args) {

		/*
		 * Output from 1 ....100 without using any numbers in your code
		 * 
		 */

//		M1
		int one = 'A' / 'A'; // 1
		String s1 = "1234567899";

		for (int i = one; i <= (s1.length() * s1.length()); i++) {
//			System.out.println(i);
		}

//		M2
//		ASCII value of a = 97, b = 98, c = 99, d = 100
		for (int i = one; i <= 'd'; i += one) {
			System.out.println(i);
		}

	}

}
