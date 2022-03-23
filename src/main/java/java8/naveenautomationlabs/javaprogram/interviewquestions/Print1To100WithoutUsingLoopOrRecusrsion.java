package java8.naveenautomationlabs.javaprogram.interviewquestions;

import java.util.Arrays;
import java.util.BitSet;

public class Print1To100WithoutUsingLoopOrRecusrsion {

//	Not a important question
	public static void main(String[] args) {

		/*
		 * Print from to 1 to 100 without using any loop and recursion: 1. Arrays
		 * fill method 2. BitSet Class
		 */

		// 1. Arrays fill method
		Object num[] = new Object[100];
		Arrays.fill(num, new Object() {
			int count = 0;

			@Override
			public String toString() {
				return Integer.toString(++count);

			}
		});

		System.out.println(Arrays.toString(num));
		System.out.println();

//		2. BitSet:
		String set = new BitSet() {
			{
				set(1, 101);
			}
		}.toString();
		System.out.append(set, 1, set.length());

	}

}
