package com.app.MyCodes;

import java.util.List;
import java.util.Scanner;

public class Codes{
	static List<Integer> oddnumbers(int l, int r){
	
	while(l!=r) {
		if(l%2==0) {
			
		}else {
			System.out.println(l);
			}
	l++;
	}	
	return null;	
}	

public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("Num 1: ");
	Integer num1=scanner.nextInt();
	System.out.println("Num 2: ");
	Integer num2=scanner.nextInt();
	Codes.oddnumbers(num1, num2);
	}
}
