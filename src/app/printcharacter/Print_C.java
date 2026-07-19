package app.printcharacter;

public class Print_C {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 4; j++) {

				if (i == 1 && j == 1 || i == 4 && j == 1) {
					
					System.out.print(" ");
					
				} else if (i == 2 && j > 1 || i == 3 && j > 1) {
					
					
				} else {
					System.out.print("C ");
				}
			}
			System.out.println();
		}
	}
}
