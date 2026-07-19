package com.java.lovecalci;

import java.util.RandomAccess;

public class RandomNumber_Generator implements RandomAccess {
	
	public void randomNumber() {
		
		for(int i=0;i<=100;) {
			
			System.out.println(i);
		}
	}
	public static void main(String[] args) {

	while(true) {
		
	RandomNumber_Generator randomNumber_Generator=	new RandomNumber_Generator();
	randomNumber_Generator.randomNumber();
		
	
		}
	}
}
