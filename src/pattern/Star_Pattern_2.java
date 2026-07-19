package pattern;
//don't do mistake like( don't forget to put space between double quotes

//*
//**
//***
//****

//don't do mistake like( don't forget to put space between double quotes

public class Star_Pattern_2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {

			for (int j = 3; j >= i; j--) {

				System.out.print(" ");// don't do mistake like( don't forget to put space between double quotes
			}

			for (int k = 1; k <= i; k++) {

				System.out.print("*");
			}
			System.out.println();
		}
		for (int l = 1; l <= 4; l++) {

			for (int n = 1; n <= l; n++) {

				System.out.print(" ");
			}
			
			for (int m = 3; m >= l; m--) {

				System.out.print("*");
			}
			System.out.println();
			
		}

	}
}