package com.java.lovecalci;

import java.util.Scanner;

public class loveCalcultor {
	
	static int total1=10;
	static int total2=20;
	static int total3=30;
	static int total4=40;
	static int total5=50;
	static int total6=60;
	static int total7=70;
	
	public static void main(String[] args) {

		while(true) {
			
		System.out.println("Enter Your name ");
		Scanner scanner1=new Scanner(System.in);
		String sc1=scanner1.nextLine();
		
		System.out.println("Enter Your name");
		Scanner scanner2=new Scanner(System.in);
		String sc2=scanner2.nextLine();
		
		int ii=0;	int j;
		
//		System.out.println("Love Percentage:  "+sc1.compareTo(sc2));
		
		 j = sc1.compareToIgnoreCase(sc2);
		 
		 
		 System.out.println(j);
		 
			if(j<=0) {
				
				ii=-j;
				System.out.println(ii+" "+j);
				
				
				}
			System.out.println(j);
		
		if(ii<=0 || j>=0 ) {
				
		if(ii >= 0 && ii < 10 || j >= 0 && j<10  ) {
			
			int percentage1=ii*100/total1;
			int percentage11=j*100/total1;
			
			System.out.println("Love Percentage:  "+percentage1+percentage11+ " %");
			
		}else if(ii >= 10 && ii < 20) {
			
			int percentage2=ii*100/total2;
			
			
			System.out.println("Love Percentage:  "+percentage2+" %");
			
		}else if(ii >= 20 && ii < 30) {
			
			int percentage3=ii*100/total3;
			
			System.out.println("Love Percentage:  "+percentage3+" %");
			
		}else if(ii >= 30 && ii < 40) {
			
			int percentage4=ii*100/total4;
			
			System.out.println("Love Percentage:  "+percentage4+" %");
		}else if(ii >= 40 && ii < 50) {
				
				int percentage5=ii*100/total5;
				
				System.out.println("Love Percentage:  "+percentage5+" %");
		
		}else {
			System.out.println("!!Love error!!  "+ii+" %");
		}
		
		
//		}else {
			
		}
		}
	}

}
