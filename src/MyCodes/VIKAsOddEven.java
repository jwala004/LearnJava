package com.app.MyCodes;

import java.util.Scanner;

public class VIKAsOddEven {
	/*public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		  i = sc.nextInt();
		if( i%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
			
			//Scanner sc= new Scanner(System.in);
			//i=sc.nextInt();
		}dxr
	}
}
*/
// Pactoririnting Fal of number(My Logic)

/*public static void main(String[] args) {
	int j=10;
	for ( j= 1; j <=10; j++) {
		if(j%2==0)
		System.out.println( +j);
		
		
	}
}	
}*/

// Factor Printing logic(Vikas Logic - Using While loop)
	
	public static void main(String[] args) {
	
	int fact=1,i=1;
	while(i<=5) {
	fact=fact*i;

	i++;
	}
	
     System.out.println(fact);
}
}
  
	/*// Factor Printing logic(Vikas Logic - Using for loop)
	
   public static void main(String[] args) {
	
     
	int fact = 1;
	int i;
	for(i=1;i<=5;i++) {
	 fact = fact*i;
	}
	System.out.println(fact);
   }}*/