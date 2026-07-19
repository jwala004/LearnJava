package com.app.practiceCodingQuesns;

public class Array_LargestNo {

	public static void main(String[] args) {
		int a[]= {1,1,1777777,11,111,111111};
		int x=a[0];
		int y=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>x ) {
				x=a[i];
				
			}
		}
			for (int i1 = 0; i1 < a.length; i1++) {
				if(a[i1]<y ) {
			    y=a[i1];
				}
		        }
		System.out.println("largest element of the Array is=  "    +x);	
		System.out.println("Smallest element of the Array is= "   +y);	
	}
	}


	/*
	 // logic to find the largest element of an Array
	 if(a[i]>x) {
	 
		x=a[i];
	}
	
}
System.out.println("largest element of the Array is"+x);
 
 */