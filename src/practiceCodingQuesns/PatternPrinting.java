package com.app.practiceCodingQuesns;

public class PatternPrinting {

	
	/*public static void main(String[] args) {
		
	for(int i=1;i<=4;i++) {
	
	for(int j=1;j<=4;j++) {
	
    System.out.print("* ");
	}
    System.out.println(" ");*/
	
	//Code for Printing the below pattern
	
//	*  
//	* *  
//	* * *  
//	* * * *  

	
	
	/*public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {
		
		for(int j=1;j<=i;j++) {
		
	    System.out.print("* ");
		}
	    System.out.println(" ");

    }
	}
    }
    */
	
//Code for Printing the below pattern
	
//	* * * *  
//	* * *  
//	* *  
//	*  
	
/*public static void main(String[] args) {

		for(int i=1;i<=4;i++) {
		
		for(int j=1;j<=(4-i+1);j++) {
			
	    System.out.printf("* ");
		}
		
	    System.out.println(" ");

    }
	}
    }*/
   /*
	public static void main(String[] args) {

		for(int i=1;i<=4;i++) {
		
		for(int j=4;j<5;j--) {
			
	    System.out.printf("* ");
		}
		
	    System.out.println(" ");

    }
	}
    }
*/
	public static void main(String[] args) {

		/*for(int i=1;i<=4;i++) {
		
		for(int j=4;j>=i;j--) {*/
		for(int i=0;i<=4;i++) {
			
		for(int j=i;j>=0;j--) {
			
	    System.out.printf("* ");
		}
		
	    System.out.println(" ");

    }
	}
    }