package app.printcharacter;

public class Print_U {

	public static void main(String[] args) {

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
	}
}
