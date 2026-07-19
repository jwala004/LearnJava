package company.spadeinfotech;

public class ASCII_Value_Sum_Of_A_String {

	public static void main(String[] args) {

		String s = "jwala";
//		int ii = 0;
//		for (int i = 0; i < s.length(); i++) {
//
//			ii = ii + (int) s.charAt(i); // this logic is to find sum of all the characters ASCII values in String
//
//			
//			System.out.println("ASCII value of each characters in " + s + " is " + (int) s.charAt(i));
//
//		}
//
//		System.out.println("Sum of all the characters ASCII values in " + s + " is " + ii);

		// product of all the characters ASCII values from string
		int iii = 1;
		for (int i = 0; i < s.length(); i++) {

			iii = iii * (int) s.charAt(i);

//			System.out.println(iii);
		}

		System.out.println("Product of all the characters ASCII values in " + s + " is " + iii);

	}

}
