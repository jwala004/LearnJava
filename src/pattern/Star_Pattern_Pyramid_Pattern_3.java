package pattern;

//*
//**
//***
//****

public class Star_Pattern_Pyramid_Pattern_3 {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {

			for (int j = 3; j >= i; j--) {

				System.out.print(" ");
				// don't do mistake like( don't forget to put space between double quotes
			}

			for (int k = 1; k <= i; k++) {

				System.out.print("*");
			}

			for (int l = 2; l <= i; l++) {

				System.out.print("*");
			}

			System.out.println();

		}

	}
}