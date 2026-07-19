package app.printcharacter;

public class Print_T_Method_2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {

				if (i == 1 && j <= 5 ) {
					
					System.out.print("TT");
					
				} else if (i == 2 && j < 3 || i == 3 && j < 3 || i == 4 && j < 3 || i == 5 && j < 3) {
					
					System.out.print("  ");// 2 spaces are there
					
				} else if (i == 2 && j > 3 || i == 3 && j > 3 || i == 4 && j > 3 || i == 5 && j > 3) {
					
//					System.out.print("  ");// 2 spaces are there 
				
				}else {
					System.out.print("T ");
				}
			}
			System.out.println();
		}
	}
}
