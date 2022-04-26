package java8;

public class PrintMiddleCharacterOfAString {

	/*
	 * Print middle character of a string. If the middle value has even then
	 * printed 2 characters Eg: Amazon –>print az
	 * 
	 */
	public static void main(String[] args) {

		String str1 = "Amazon";

		String str2 = "Amazonn";

//		PrintMiddleCharacterOfAString.printMiddleChar(str1);

		PrintMiddleCharacterOfAString.printMiddleChar(str2);

	}

	private static void printMiddleChar(String str) {
		
		int median = (str.length() / 2) - 1;

		if (median % 2 == 0) {
			System.out.println(str.charAt(median) + "" + str.charAt(median + 1));
		} else {
			System.out.println(str.charAt(median));
		}

	}

}
