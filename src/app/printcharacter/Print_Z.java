package app.printcharacter;

public class Print_Z {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {

				if (i == 1 && j <= 4 || i == 4 && j <= 4) {

					System.out.print("Z ");
//					System.out.print("* "); // to print in the form of star
					
				} else if (i == 2 && j == 3 || i == 3 && j == 2) {

					System.out.print("Z ");
//					System.out.print("* "); // to print in the form of star
					
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
