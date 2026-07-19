package number;

//M-1 to find Prime_Number_Between_1_To_100

public class Prime_Number_Between_1_To_100 {

	public static void main(String[] args) {

		System.out.println(" Prime Numbers from 1 to 100 are : ");
		for (int i = 0; i <= 100; i++) {
			int count = 0;
			// for (int j = 2; j <i; j++) { // the line above in comment line and line below
			// will give the same output.

			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0 && i != 0 && i != 1) {
					count++; //
					break;
				}
			}

//			// this if condition is also ok, it will also give the same output.

//			if (count == 0 && i != 1 && i != 0) { 
//				System.out.print(i + " "); 
//			}


			if (count > 0) {
			
			} else if (i != 0 && i != 1) {
				System.out.print(i + " ");
			}

			
		}
	}
}

// M-2

//	public static void main(String[] args) {
//
//		System.out.println(" Prime Numbers from 1 to 100 are : ");
//		for (int i = 0; i <= 100; i++) {
//			int count = 0;
//			for (int j = 1; j <= i; j++) {
//				if (i % j == 0 && i != 0 && i != 1) {
//					count++;
//				}
//			}
//
//			if (count == 2) {
//				System.out.print(i + " ");
//			}
//		}
//	}
//
//	}

// M-3

//	public static void main(String[] args) {
//		int i, k, j;
//		for (i = 1; i < 100; i++) {
//			k = 0;
//			for (j = 2; j < i; j++) {
//				if (i % j == 0) {
//					k = 1;
//					break;
//				}
//			}
//			if (k == 0) {
//				System.out.print(i + " ");
//			}
//		}
//	}
//}
