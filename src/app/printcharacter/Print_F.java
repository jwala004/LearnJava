package app.printcharacter;

public class Print_F {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 4; j++) {

				if (i == 2 && j > 1) {
					
					System.out.print("  ");// 2 spaces are there 
					
				} else if (i == 3 && j == 1  ) {

					System.out.print("FFFF "); 
					
				}else if (i == 3 && j > 1  ) {
					
					
				}else if ( i == 4 && j > 1 ) {
					
//					System.out.print("  ");// 2 spaces are there
					
				}else if ( i == 5 && j > 1 ) {
					
//					System.out.print("  ");// 2 spaces are there
					
					
				}else {
					System.out.print("F ");
				}
			}
			System.out.println();
		}
	}
}
