package app.printcharacter;

public class Print_G {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 3; j++) {

				if (i == 1 && j == 1 || i == 4 && j == 1 ) {
					
					System.out.print("  ");// 2 spaces are there 
					
//				} else if (i == 2 && j == 2 ||  i == 2 && j == 3 ) {
				} else if (i == 2 && j > 1 ) {
					
//					System.out.print("  "); 
					
				}else {
					System.out.print("G ");
				}
			}
			System.out.println();
		}
	}
}
