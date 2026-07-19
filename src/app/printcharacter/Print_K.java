package app.printcharacter;

public class Print_K {

	public static void main(String[] args) {

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
	}
}
