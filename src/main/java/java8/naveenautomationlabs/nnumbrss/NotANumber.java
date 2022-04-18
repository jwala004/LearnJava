package java8.naveenautomationlabs.nnumbrss;

public class NotANumber {

	public static void main(String[] args) {

		/*
		 * What is NaN? Not a number? How is NaN defined in diffrent languages? NaN
		 * occurs when we try to perform arithmetic operation with floating numbers. For
		 * example, 2.0/0.0
		 */

//		System.out.println(2.0/0.0);
//		System.out.println(0.0/0.0);
//		System.out.println(Math.sqrt(-1));

//		System.out.println(Float.NaN == Float.NaN); // false, we cann't compare two undefined entities or numbers
//		System.out.println(Float.NaN != Float.NaN); // true

		/*-----------------------------------------------------------*/
//		What will be the output when you divide a number by zero?

//		System.out.println(1/0); // java.lang.ArithmeticException: / by zero
//		System.out.println(0/0); // java.lang.ArithmeticException: / by zero
//		System.out.println(0 / 1); // 0
//		System.out.println(1.0 / 0); // dividing any floating point number or double data type number with zero,
										// results into infinity or viceversa dividing zero with any floating point
										// number or
//	double data type number results into infinity also

//		System.out.println(199 / 0.0);
		
//		Print a long number with and without 'L'
//		If we will not use 'L' with long number, then it will be treated as 32 bit number as integer.
//		Adding 'L' as suffix, will make it as 64 bit number.
		
		long numWithoutL = 1000*60*60*24*365;
		long numWithL = 1000*60*60*24*365L;
		
		System.out.println(numWithoutL);
		System.out.println(numWithL);
		
	}

}
