package app.printcharacter;

public class Print_I_Mehod_2 {

	public static void main(String[] args) {

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
	}
}
