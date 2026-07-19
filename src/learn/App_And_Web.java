package com.java.learn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class App_And_Web {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 1, 1, 2, 3, 4, 4, 4 };
		
		
		Arrays.sort(a); 
		
//		System.out.print(a+" ");
//		System.out.println();
		
		Set<Integer> s=new HashSet();

		for (int i = 0; i < a.length; i++) {

			int counter = 1;

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j] ) {

					counter++;

				}

			}

			System.out.println(a[i] + " " + counter);
		}
		
//		int	arr[] = { 1, 2, 3, 4, 5, 6, 1, 1, 2, 3, 4, 4, 4 };
//		
//		duplicatesInteger(arr);

	}
	
	 public static void duplicatesInteger(int arr[]){
		 
		  
		    Arrays.sort(arr);       
		    int count=0;
		    Set s=new HashSet();
		    for(int i=0;i<=arr.length-1;i++){
		        for(int j=i+1;j<=arr.length-1;j++){
		            if(arr[i]==arr[j] && s.add(arr[i])){
		                count=count+1;              
		                                }
		        }
		        System.out.println(count);
		    }
		}

}
