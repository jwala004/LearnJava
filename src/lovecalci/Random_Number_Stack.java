package com.java.lovecalci;

import java.util.Random;

// M-1

//public class Random_Number_Stack {
//
//	public static  int getRandom(int[] array) {
//	    int rnd = new Random().nextInt(array.length);
//	    return array[rnd];
//	}
//	
//	public static void main(String[] args) {
//		
//		int[] array= {1,2,3,4,5,55,6,66,7,777,888,88,8,8888,90,100};
//		
//		int ii = Random_Number_Stack.getRandom(array);
//		
//		System.out.println(ii);
//		
//	}
//
//}

// M-2

public class Random_Number_Stack {

	public static int getRandom(int[] array) {
	    int rnd = new Random().nextInt(array.length);
	     int iii =array[rnd];
	     
	     System.out.println(iii);
	     return iii;
	     
	}
	
	public static void main(String[] args) {
		
		int[] array= {1,2,3,4,5,55,6,66,7,777,888,88,8,8888,90,100};
		
	    Random_Number_Stack.getRandom(array);
		
	}

}
