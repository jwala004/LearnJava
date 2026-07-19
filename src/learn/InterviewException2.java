package com.java.learn;

public class InterviewException2 {

	public static void main(String[] args) {

		try {

//			return 5/0;

			System.out.println(5/0);

		} catch (ArithmeticException e) {

			System.out.println("ArithmeticException catch block");

		} catch (Exception e) {

			System.out.println("Exception catch block");

		} finally {

			System.out.println("finally block");

		}

	}

}
