package app.calculator;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to Calc 1.0!");

		System.out.println("This is the main menu");

		System.out.println("Choose your exp<b></b>ression: ");

		System.out.println("1. Addition /n 2. Substraction/n 3. Multiplcation /n 4. Divide ");

		int choice = input.nextInt();

		switch (choice) {

		case 1:

			addition();

		case 2:

			substraction();

		case 3:

			multiplication();

		case 4:

			divide();

		}

	}

	static double addition() {

		Scanner math1 = new Scanner(System.in);

		double a;

		double b;

		double c;

		System.out.println("First Num");

		a = math1.nextInt();

		System.out.print("Second Num");

		b = math1.nextInt();
		double b1 = math1.nextInt();
		double b2 = math1.nextInt();
		double b3 = math1.nextInt();
		double b4 = math1.nextInt();

		c = a + b+b1+b2+b3+b4;

		System.out.println("The total value is " + c);

//		int dd=

		return c;

	}

	static void substraction() {

		Scanner math1 = new Scanner(System.in);

		double a;

		double b;

		double c;

		System.out.println("First Num");

		a = math1.nextInt();

		System.out.print("Second Num");

		b = math1.nextInt();

		c = a - b;

		System.out.println("The total value is " + c);

		return;

	}

	static void multiplication() {

		Scanner math1 = new Scanner(System.in);

		double a;

		double b;

		double c;

		System.out.println("First Num");

		a = math1.nextInt();

		System.out.print("Second Num");

		b = math1.nextInt();

		c = a * b;

		System.out.println("The total value is " + c);

		return;

	}

	static void divide() {

		Scanner math1 = new Scanner(System.in);

		double a;

		double b;

		double c;

		System.out.println("First Num");

		a = math1.nextInt();

		System.out.print("Second Num");

		b = math1.nextInt();

		c = a / b;

		System.out.println("The total value is " + c);

		return;

	}

}