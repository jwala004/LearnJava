package pattern;

//*******
//*****
// ***
//  *

public class Star_Pattern_3_Inverted_Pyramid {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {

			for (int j = 4; j >= i; j--) {

				System.out.print("*");
				// don't do mistake like( don't forget to put space between double quotes
			}

			for (int k = 3; k >= i; k--) {

				System.out.print("*");
			}
			System.out.println();

			for (int l = 1; l <= i; l++) {

				System.out.print(" ");
			}

		}
		
	}
}