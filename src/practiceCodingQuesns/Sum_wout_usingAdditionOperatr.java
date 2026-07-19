package com.app.practiceCodingQuesns;
import java.util.Scanner;

public class Sum_wout_usingAdditionOperatr {
	
	 public static void main(String[] args) 
	 {
	  int a, b;
	  int sum;
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter any two integers: ");
	  a = sc.nextInt();
	  b = sc.nextInt();
	  sum = a - ~b - 1;
	  System.out.print("Sum of two integers: " + sum);
	 }
	}