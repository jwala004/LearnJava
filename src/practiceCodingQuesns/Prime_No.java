package com.app.practiceCodingQuesns;

public class Prime_No {

	public static void main(String[] args) {
		
		//int i =5;
		for (int i = 2; i < 100; i++) {

		if(i%1==0 && i%i==0) {
			System.out.println("Prime no:"+i);
		}else {
			//System.out.println("Non prime no:"+i);
			System.out.println("Non prime no:");
		}
		}
	}

}
