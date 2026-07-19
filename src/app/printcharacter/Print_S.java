package app.printcharacter;

public class Print_S {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {

				if (i == 1 && j == 1 || i == 3 && j == 1 ) {

					System.out.print("  ");// 2 spaces are there

				} else if (i == 2 && j > 1 || i == 4 && j < 5  ) {  

					System.out.print("  ");// 2 spaces are there
				} else if ( i == 3 && j == 5 || i == 5 && j == 5  ) {

//					System.out.print("X");

				} else {
					System.out.print("S ");
				}
			}
			System.out.println();
		}
	}
}
