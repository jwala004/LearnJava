package number;

//M-2 to find Prime_Number_Between_1_To_100

public class Prime_Number_Between_1_To_100_M2 {

//	public static void main(String[] args) {
//		int i = 0;
//		int num = 0;
//		// Empty String
//		String primeNumbers = "";
//
//		for (i = 1; i <= 100; i++) {
//			int counter = 0;
//			for (num = i; num >= 1; num--) {
//				if (i % num == 0) {
//					counter = counter + 1;
//				}
//			}
//			if (counter == 2) {
//				
//				// Appended the Prime number to the String
//				primeNumbers = primeNumbers + i + " ";
//			
//				
//				
//				System.out.print(i+" ");
//
//			}
//		}
//		System.out.println("Prime numbers from 1 to 100 are :");
//		System.out.println(primeNumbers);
//	}
//}

	public static void main(String[] args) {
		int i = 0;
		int num = 0;

		System.out.println("Prime numbers from 1 to 100 are :");

		for (i = 1; i <= 100; i++) {
			int counter = 0;
			for (num = 2; num < i; num++) {
				if (i % num == 0) {
//					counter = counter + 1;
					counter = 1;
					break;
				}
			}
			if (counter == 0 && i!=1) {

				System.out.print(i + " ");

			}

		}

	}
}