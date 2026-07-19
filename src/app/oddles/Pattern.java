package app.oddles;

//    *
//  * * *
// * * * *
public class Pattern {

	public static void main(String[] args) {
		
		int j;
		
		System.out.print("    * "); 
		System.out.println();
		

		for(int i = 4; i >= 1 ; i--) {

//			if(i == 1) {
//				j = 4;
//			}
			
			for( j = 1; j <= 3; j++) {
				
				if(i < 3 ) {
				  continue;
				}
				
			
				System.out.print(" * "); 
				
			}
			System.out.println();
			
		}

	}

}

