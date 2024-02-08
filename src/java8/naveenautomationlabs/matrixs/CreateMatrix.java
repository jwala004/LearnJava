package java8.naveenautomationlabs.matrixs;

import java.util.Arrays;
import java.util.Scanner;

public class CreateMatrix {

	/*
	 * How to Create Matrix In Java?
	 * 
	 * How to iterate a Matrix [2D Array]?
	 * 
	 * Matrix: Data arranged in the form of rows and columns.
	 * 
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no of rows: ");
		int rows = sc.nextInt();

		System.out.println("Enter total no of columns: ");
		int colms = sc.nextInt();

//		Create a 2D array
		int data[][] = new int[rows][colms];

		System.out.println("Please enter matrix data: ");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colms; j++) {
				data[i][j] = sc.nextInt();
			}
		}

//		Now, Print the matrix

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colms; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}

//		Now, Print the matrix in style 2

//		for (int[] ro : data) {
//			for (int x : ro) {
//				System.out.print(x + " ");
//			}
//			System.out.println();
//		}

//		Now, Print the matrix using toString() method
//		Best recommended approach
//		for(int [] rw : data) {
//			System.out.println(Arrays.toString(rw));
//		}

//		Now, Print the matrix using streams

//		Arrays.stream(data).forEach((e -> {
//			Arrays.stream(e).forEach((j) -> System.out.print(j +" "));
//			System.out.println();
//		}));
//		

	}

}
