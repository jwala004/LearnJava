package java8.naveenautomationlabs.matrixs;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixTranspose {

	/*
	 * Matrix Transpose:
	 * 
	 * Transpose of a matrix means converting rows into or as columns.
	 * 
	 * 
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of rows: ");

		int rows = sc.nextInt();

		System.out.println("Please enter number of columns: ");

		int colums = sc.nextInt();

		int matrix[][] = new int[rows][colums];
		int transpose[][] = new int[colums][rows];

		System.out.println("Please enter the data for the matrix: ");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colums; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("Print the input matrix: ");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colums; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Create the transpose matrix: ");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colums; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}

		System.out.println("Print the transpose matrix: ");

		for (int[] r : transpose) {
			System.out.println(Arrays.toString(r));
		}

	}

}
