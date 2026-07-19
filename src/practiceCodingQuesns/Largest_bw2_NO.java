package com.app.practiceCodingQuesns;

import java.util.Scanner;

public class Largest_bw2_NO {
	  public static void main(String[] args) {
	// By taking input from the user
	System.out.println("Enter the 2 no's to check Greater b/w them: ");
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	int i1 = sc.nextInt();
	int i2 = sc.nextInt();
	if(i1>i2)
		System.out.println(i1);
	else
		System.out.println(i2);
	
	}
}

/*int i1=1;
int i2=2;
if(i1>i2)
	System.out.println(i1);
else
	System.out.println(i2);*/