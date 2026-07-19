package com.app.practiceCodingQuesns;

public class Fibonacci_series {
	public static void main(String[] args) {
		// Method - 1
		int a = 1,b = 1,k = 0;
     // System.out.print(a+" "+b);
		System.out.print("1 1");
		/*
		// here in this one, o/p will display from 1 and it will be like (1 1...... and so on).
		  To print the o/p from 0, make changes in sysout like ("0 1 1"), and it will display o/p from 0
		  and it will be like--(0 1 1...and so on.)

		
		*/
		while(k<=10) {
	
			k=a+b;
		System.out.print(" "+k);
		//System.out.print(k+ " ");
			a=b;
			b=k;
			}
  		}
	}

/*
	// Method - l̥2
	int a = 0,b = 1,k = 0;
	System.out.print(a+" "+b);

	//while(k<=10) {
	for (int i = 0; i <=10; i++) {
		k=a+b;
	System.out.print(" "+k);
	//System.out.print(k+ " ");
		a=b;
		b=k;
	*/
	
	/*	
	 // Method - 3
	  
	 int a=0,b=1,c = 0;
		System.out.print(a+" "+b);
		
		for (int i = 0; i <=10; i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;*/
			
// Method - 4(Using Recursion)
	