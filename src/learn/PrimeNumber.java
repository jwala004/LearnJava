package com.java.learn;

public class PrimeNumber {

	static int counter = 0;

	static int numToCheck = 31;

	public static void main(String[] args) {

		for (int i = 1; i < numToCheck; i++) {

			if (numToCheck % i == 0) {

				counter++;

			}

		}

		if (counter > 2) {

			System.out.println(numToCheck + " is not a Prime Number.");
//			break;
		} else {

			System.out.println(numToCheck + " is a Prime Number.");
//			break;
		}

	}

}
