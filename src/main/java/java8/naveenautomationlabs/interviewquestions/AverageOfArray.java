package java8.naveenautomationlabs.interviewquestions;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageOfArray {

	public static void main(String[] args) {

		/*
		 * Calculate average of array using Simple Loop and Java 8
		 * 
		 */

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

//		M1
		double sum = 0;

		for (int num : arr) {
			sum = sum + num;
		}

//		System.out.println("Average Of Array: "+sum/ arr.length);

//		M2 : Using Java8 Streams
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println(avg.getAsDouble());

	}

}
