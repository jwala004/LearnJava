package app.printcharacter;

import java.util.Scanner;

public class Print_Characters_from_A_to_Z {

	public static void main(String[] args) {
	
		System.out.println("Enter character to print : ");
		
		while(true) {
		
		Scanner scanner= new Scanner(System.in);
		char cc = scanner.next().charAt(0);
		
		 switch(cc) {
		 
		 case 'A' :
			
			 break;
		 case 'B':
			 
			 for (int i = 1; i <= 5; i++) {

				 int j;
					for ( j = 1; j <= 3; j++) {
					
						if(i==2 && j==2 || i==4 && j==2 ) {
						
							System.out.print("  ");// double space there
						
						}else if(i==1 && j==3 || i== 3 && j== 3 || i== 5 && j == 3 ) {
							
						}else {
							System.out.print("B ");
						}
					}
					
					System.out.println();
				}
		 
		 break;
		 
		 case 'C':
			 for (int i = 1; i <= 4; i++) {

				 int j;
					for ( j = 1; j <= 4; j++) {

						if (i == 1 && j == 1 || i == 4 && j == 1) {
							
							System.out.print(" ");
							
						} else if (i == 2 && j > 1 || i == 3 && j > 1) {
							
							
						} else {
							System.out.print("C ");
						}
					}
					
					System.out.println();
				}
			 break;
		 case 'D':
			 for (int i = 1; i <= 4; i++) {

				 int j;
				 
					for (j = 1; j <= 4; j++) {

						if (i == 1 && j == 4 || i == 4 && j == 4) {
							
							System.out.print(" ");
							
						} else if (i == 2 && j ==2 || i == 2 && j ==3) {

							System.out.print("  ");// 2 spaces are there 
							
						}else if ( i == 3 && j == 2  || i == 3 && j ==3) {
							
							System.out.print("  ");// 2 spaces are there
							
						}else {
							System.out.print("D ");
						}
					}
					
					System.out.println();
				}
			 break;
		 case 'E':
			 for (int i = 1; i <= 5; i++) {

					for (int j = 1; j <= 4; j++) {

						if (i == 2 && j > 1) {
							
							System.out.print("  ");// 2 spaces are there 
							
						} else if (i == 3 && j <= 3 ) {

							System.out.print("E "); 
							
						}else if ( i == 4 && j > 1 ) {
							
							System.out.print("  ");// 2 spaces are there
							
						}else if ( i == 4 && j > 1 ) {
							
							System.out.print("  ");// 2 spaces are there
							
							
						}else {
							System.out.print("E ");
						}
					}
					System.out.println();
				} 
		 break;
		 
		 case 'F':

				for (int i = 1; i <= 5; i++) {

					for (int j = 1; j <= 4; j++) {

						if (i == 2 && j > 1) {
							
							System.out.print("  ");// 2 spaces are there 
							
						} else if (i == 3 && j == 1  ) {

							System.out.print("FFFF "); 
							
						}else if (i == 3 && j > 1  ) {
							
						}else if ( i == 4 && j > 1 ) {
							
						}else if ( i == 5 && j > 1 ) {
							
						}else {
							System.out.print("F ");
						}
					}
					System.out.println();
				}
		 case 'G':
			 for (int i = 1; i <= 4; i++) {

					for (int j = 1; j <= 3; j++) {

						if (i == 1 && j == 1 || i == 4 && j == 1 ) {
							
							System.out.print("  ");// 2 spaces are there 
							
						} else if (i == 2 && j > 1 ) {
							
						}else {
							System.out.print("G ");
						}
					}
					System.out.println();
				}
			 break;
		 
		 case 'H':	
			 for (int i = 1; i <= 5; i++) {

					for (int j = 1; j <= 4; j++) {

						if (i == 1 && j == 2 || i == 1 && j == 3 ) {
							
							System.out.print("  ");// 2 spaces are there 
							
						} else if (i == 2 && j == 2 || i == 2 && j == 3 ) {
							
							System.out.print("  ");// 2 spaces are there 
						
						} else if (i == 4 && j == 2 || i == 4 && j == 3 ) {
							
							System.out.print("  ");// 2 spaces are there 
						} else if (i == 5 && j == 2 || i == 5 && j == 3 ) {
							
							System.out.print("  ");// 2 spaces are there 	
						}else {
							System.out.print("H ");
						}
					}
					System.out.println();
				}
			 break;
			 
		 case 'I':
			 

				for (int i = 1; i <= 4; i++) {

					for (int j = 1; j < 4; j++) {

						if (i == 2 && j == 1 || i == 2 && j == 3 ) {
							
							System.out.print("  ");// 2 spaces are there 
							
						} else if (i == 3 && j == 1 || i == 3 && j == 3 ) {
							
							System.out.print("  ");// 2 spaces are there 
						
						}else {
							System.out.print("I ");
						}
					}
					System.out.println();
				}
			break;
			
		 case 'J' :
			 for (int i = 1; i <= 4; i++) {

					for (int j = 1; j <= 3; j++) {

						if ( i == 1 && j < 3 || i == 2 && j == 1 || i == 2 && j == 2 
							 || i == 3 && j == 2 || i == 4 && j == 1 || i == 4 && j == 3  ) {
							
							System.out.print("  ");// 2 spaces are there 
							
						}else {
							System.out.print("J ");
						}
					}
					System.out.println();
				}
			 break;
			 
		 case 'K':
			 for (int i = 1; i <= 5; i++) {

					for (int j = 1; j <= 3; j++) {

						if (i == 1 && j == 2 || i == 5 && j == 2 ) {
							
							System.out.print("  ");// 2 spaces are there 
							
						} else if (i == 2 && j == 3 || i == 3 && j == 2 || i == 3 && j == 3 || i == 4 && j == 3  ) {
							
							System.out.print("  ");// 2 spaces are there 
						
						}else {
							System.out.print("K ");
						}
					}
					System.out.println();
				}
			 break;
		 case 'L':
			 for (int i = 1; i <= 4; i++) {

					for (int j = 1; j < 2; j++) {
						
						System.out.print("L ");
					}
					System.out.println();
					if(i==4)
						System.out.print("LLLLLL");
				}
			 break;
		 case 'M':
			 for (int i = 1; i <= 5; i++) {

					for (int j = 1; j <= 4; j++) {
					
						if(i==1 && j==2 || i== 1 && j== 3) {
						
							System.out.print("  ");// double space there
						
						}else if(i==3 && j==2 || i== 3 && j== 3) {
							System.out.print(" M ");// double space there
						
						}else if(i==3 && j==4 ) {
							
						}else if(i==4 && j==2 || i== 4 && j== 3) {
							System.out.print("  ");// double space there

						}else if(i==5 && j==2 || i== 5 && j== 3) {
							System.out.print("  ");// double space there
							
						}else {
							System.out.print("M ");
						}
					}
					System.out.println();

				}
			break;
			
		 case 'N':
			 for (int i = 1; i <= 4; i++) {

					for (int j = 1; j <= 4; j++) {
					
						if(i==1 && j==2 || i== 1 && j== 3 || i== 2 && j== 3) {
						
							System.out.print("  ");// double space there
						
						}else if(i==3 && j==2 || i== 4 && j== 2 || i== 4 && j== 3 ) {
							System.out.print("  ");// double space there
							
							
						}else {
							System.out.print("N ");
						}
					}
					System.out.println();

				}
			 break;
			 
		 case 'O':
			 for (int i = 1; i <= 4; i++) {

					for (int j = 1; j <= 4; j++) {
					
						if(i==1 && j==1 || i== 4 && j== 1) {
						
							System.out.print("  ");// double space there
						
						}else if(i==2 && j==2 || i== 2 && j== 3 || i== 3 && j== 2 || i== 3 && j== 3 ) {
							System.out.print("  ");// double space there
							
						}else if(i==1 && j==4 || i== 4 && j== 4 ) {
							
						}else {
							System.out.print("O ");
						}
					}
					System.out.println();

				}
			 break;
			 
		 case 'P':
			 for (int i = 1; i <= 5; i++) {

					for (int j = 1; j <= 3; j++) {
					
						if(i==2 && j==2 ) {
						
							System.out.print("  ");// double space there
						
						}else if(i==1 && j==3 || i== 3 && j== 3 || i== 4 && j > 1 || i== 5 && j > 1 ) {
							
						}else {
							System.out.print("P ");
						}
					}
					System.out.println();

				}
			 break;
			 
		 case 'Q' :
			 for (int i = 1; i <= 5; i++) {

					for (int j = 1; j <= 4; j++) {
					
						if(i==1 && j==1 || i== 4 && j== 1) {
						
							System.out.print("  ");// double space there
						
						}else if(i==2 && j==2 || i== 2 && j== 3 || i== 3 && j== 2 || i== 3 && j== 3 || i== 5 && j== 1 || i== 5 && j== 2 || i== 5 && j== 4) {
							System.out.print("  ");// double space there
						
						}else if(i==1 && j==4 || i== 4 && j== 4  ) {
							
						}else if(i==5 && j==3  ) {
							
							System.out.print(" Q");
							
						}else {
							System.out.print("Q ");
						}
					}
					System.out.println();

				}
			 break;
			 
		 case 'R':
			 for (int i = 1; i <= 5; i++) {

					for (int j = 1; j <= 3; j++) {
					
						if(i==2 && j==2 || i==5 && j==2 ) {
						
							System.out.print("  ");// double space there
						
						}else if(i==1 && j==3 || i== 3 && j== 3 || i== 4 && j == 3 ) {
							
						}else {
							System.out.print("R ");
						}
					}
					System.out.println();

				}
			 break;
			 
		 case 'S':
			 for (int i = 1; i <= 5; i++) {

					for (int j = 1; j <= 5; j++) {

						if (i == 1 && j == 1 || i == 3 && j == 1 ) {

							System.out.print("  ");// 2 spaces are there

						} else if (i == 2 && j > 1 || i == 4 && j < 5  ) {  

							System.out.print("  ");// 2 spaces are there
						} else if ( i == 3 && j == 5 || i == 5 && j == 5  ) {

						} else {
							System.out.print("S ");
						}
					}
					System.out.println();
				}
			 break;
			 
		 case 'T' :
		 for (int i = 1; i <= 5; i++) {

				for (int j = 1; j <= 5; j++) {

					if (i == 1 && j <= 5 ) {
						
						System.out.print("T ");
						
					} else if (i == 2 && j < 3 || i == 3 && j < 3 || i == 4 && j < 3 || i == 5 && j < 3) {
						
						System.out.print("  ");// 2 spaces are there
						
					} else if (i == 2 && j > 3 || i == 3 && j > 3 || i == 4 && j > 3 || i == 5 && j > 3) {
						
					}else {
						System.out.print("T ");
					}
				}
				System.out.println();
			}
			break;
		 case 'U':
			 for (int i = 1; i <=4; i++) {

					for (int j = 1; j <= 4; j++) {

						if (i >= 1 && i <= 3 && j > 1 && j < 4 ) {
							
							System.out.print("  ");
							
						} else if (i == 4 && j == 1 || i == 4 && j == 4 ) {
							
							System.out.print("  ");// 2 spaces are there
							
						}else {
							System.out.print("U ");
						}
					}
					System.out.println();
				}
		 
		 break;
		
		 
		 case 'V':
			 
			 for (int i = 1; i <= 3; i++) {

					for (int j = 1; j <= 5; j++) {

						if (i == 1 && j > 1 && j < 5 || i == 2 && j == 3) {

							System.out.print("  ");

						} else if (i == 2 && j == 1 || i == 2 && j == 5 
								|| i == 3 && j <= 2 || i == 3 && j > 3 && j < 6) {

							System.out.print("  ");// 2 spaces are there

						} else {
							System.out.print("V ");
						}
					}
					System.out.println();
				}
			 break;
			 
			 
		 case 'W':
			

				for (int i = 1; i <= 4; i++) {

					for (int j = 1; j <= 4; j++) {
					
						if(i==1 && j==2 || i== 1 && j== 3) {
						
							System.out.print("  ");// double space there
						
						}else if(i==2 && j==2 || i== 2 && j== 3) {
							System.out.print("  ");// double space there
							
						}else if(i==4 && j==2 || i== 4 && j== 3) {
							System.out.print("  ");// double space there
							
						}else {
							System.out.print("W ");
						}
					}
					System.out.println();
				}
			 
			 break;
			 
		 case 'X':
			
			 for (int i = 1; i <= 5; i++) {

					for (int j = 1; j <= 5; j++) {

						if (i == 1 && j > 1 && j < 5 || i == 2 && j == 3 || i == 5 && j > 1 && j < 5 || i == 4 && j == 3 ) {

							System.out.print("  ");// 2 spaces are there

						} else if (i > 1 && i < 5 && j== 1 || i==3 && j== 2 || i > 1 && i < 5 && j== 5 || i==3 && j== 4  ) {  

							System.out.print("  ");// 2 spaces are there
						} else if ( i == 3 && j == 3  ) {

							System.out.print("X");

						} else {
							System.out.print("X ");
						}
					}
					System.out.println();
				}
			 
			 break;
			 
			 
		 case 'Y':
			 for (int i = 1; i <= 5; i++) {

					for (int j = 1; j <= 5; j++) {

						if (i == 1 && j > 1 && j < 5 || i == 2 && j == 3) {

							System.out.print("  ");

						} else if (i == 2 && j == 1 || i == 2 && j == 5 
								|| i == 3 && j <= 2 || i == 3 && j > 3 && j < 6) {

							System.out.print("  ");// 2 spaces are there
							
						} else if (i == 4 && j < 3 || i == 5 && j < 3 ) {

							System.out.print("  ");// 2 spaces are there
							
						} else if (i == 4 && j > 3 || i == 5 && j > 3 ) {

						} else {
							System.out.print("Y ");
						}
					}
					System.out.println();
				}
			 
			 break;
			 
		 case 'Z':
			
			 for (int i = 1; i <= 5; i++) {

					for (int j = 1; j <= 5; j++) {

						if (i == 1 && j <= 4 || i == 4 && j <= 4) {

							System.out.print("Z ");
							
						} else if (i == 2 && j == 3 || i == 3 && j == 2) {

							System.out.print("Z ");
							
						} else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}
			 
			 break;
			 
			 default :
				 
			 System.out.println(" The provided input doesn't match with any case. ");
			 
	    } // switch case closes here.
	} // while loop closes here
  } // main method closes here
} // class body closes here
