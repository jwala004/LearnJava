package java8.naveenautomationlabs.matrixs;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {

	/*
	 * Matrix Addition and Subtraction in Java
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
		int matrix1[][] = new int[rows][colms];
		int matrix2[][] = new int[rows][colms];
		int sum[][] = new int[rows][colms];

		System.out.println("Please enter matrix data 1: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colms; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Please enter matrix data 2: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colms; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}

//		Now, Print the matrix1 using toString() method
		System.out.println("Print the matrix1 data: ");
		for (int[] rw1 : matrix1) {
			System.out.println(Arrays.toString(rw1));
		}

//		Now, Print the matrix2 using toString() method
		System.out.println("Print the matrix2 data: ");
		for (int[] rw2 : matrix2) {
			System.out.println(Arrays.toString(rw2));
		}
		
//		Sum of 2 matrices
		System.out.println("Sum of 2 matrices: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colms; j++) {
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
				System.out.print(sum[i][j] +" ");
			}
			System.out.println();
		}
		

	}

}
