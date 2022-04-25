package java8.naveenautomationlabs.matrixs;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {

	/*
	 * Matrix Multiplication - Product of two Matrices
	 * 
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows in the first matrix: ");
		int rowsInFirst = sc.nextInt();

		System.out.println("Enter the number of columns in the first matrix or rows in second matrix: ");
		int colsInFirstAndRowsInSecond = sc.nextInt();

		System.out.println("Enter the number of columns in the second matrix: ");
		int colsInSecond = sc.nextInt();

		int matrix1[][] = new int[rowsInFirst][colsInFirstAndRowsInSecond];
		int matrix2[][] = new int[colsInFirstAndRowsInSecond][colsInSecond];
		int product[][] = new int[rowsInFirst][colsInSecond];

		System.out.println("Enter the data for first matrix: ");
		for (int i = 0; i < rowsInFirst; i++) {
			for (int j = 0; j < colsInFirstAndRowsInSecond; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter the data for second matrix: ");
		for (int i = 0; i < colsInFirstAndRowsInSecond; i++) {
			for (int j = 0; j < colsInSecond; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}

		System.out.println("Print first matrix: ");
		for (int i = 0; i < rowsInFirst; i++) {
			for (int j = 0; j < colsInFirstAndRowsInSecond; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Print second matrix: ");
		for (int i = 0; i < colsInFirstAndRowsInSecond; i++) {
			for (int j = 0; j < colsInSecond; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}

//		Get the product:
		for (int i = 0; i < rowsInFirst; i++) {
			for (int j = 0; j < colsInSecond; j++) {
				for (int k = 0; k < colsInFirstAndRowsInSecond; k++) {
					product[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}

//		Print the final product:
		System.out.println("Print product final data: ");
		for (int[] r : product) {
			System.out.println(Arrays.toString(r));
		}

	}

}
