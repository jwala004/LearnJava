package app.test;

import java.util.Scanner;

public class Hemendra {

	public static void main(String[] args) {

	System.out.println("Enter the no N");
	Scanner scanner=new Scanner(System.in);
	int n= scanner.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++) {
		System.out.println(2*i);
		sum=sum+2*i;
		
		/*if(i%2==0) {
			sum=sum+i;
		
			System.out.println(i);
//System.out.println(i+" "+sum);	
		}*/
	}
	System.out.println("Sum of all the elemnets: "+sum);
	}
	}
		
		//sum=sum*2;
		
//	for(int i =n;i>=1;i--) {
//	
	//System.out.println(sum);

	
//without taking i/p form the user
/*int sum=0;
for (int i = 1; i <=5; i++) {
	sum = sum+i;
	System.out.println(" "+i+" "+sum);
    
	System.out.println("Sum of the elements: "+sum);
	*/
/*sum=2*i;
System.out.println(sum);*/
