package java8.naveenautomationlabs.strngg;

import java.text.DecimalFormat;

public class ElementPercentage {

	/*
	 * how to Find Percentage Of Uppercase Letters, Lowercase Letters, Digits And
	 * Special Characters In String?
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		getPercentage("Naveen");
		
		getPercentage("Naveen AutomationLabs");
		
		getPercentage("Naveen AutomationLabs 12345");
		
		getPercentage("Naveen AutomationLabs 12345 %$%$%$*");
		
		getPercentage("N");
		
		getPercentage("1");
		
		getPercentage("N$*");
		
		getPercentage(" "); // supply empty string
		
	}

	private static void getPercentage(String str) {

		int len = str.length();

		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int digits = 0;
		int speclChars = 0;

		for (int i = 0; i < len; i++) {

			char ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {
				upperCaseCount++;
			} else if (Character.isLowerCase(ch)) {
				lowerCaseCount++;
			} else if (Character.isDigit(ch)) {
				digits++;
			} else {
				speclChars++;
			}
		}

		double upperCasePercentage = (upperCaseCount * 100.0) / len;
		double lowerCasePercentage = (lowerCaseCount * 100.0) / len;
		double digitsPercentage = (digits * 100.0) / len;
		double speclCharsPercentage = (speclChars * 100.0) / len;

		System.out.println("In the given sting: " + str);
//		To display the result or percentage into only up to 2 decimals, we need to use DecimalFormat
		DecimalFormat formatter = new DecimalFormat("##.##");

		System.out.println("Upper case % ===== " + formatter.format(upperCasePercentage));
		System.out.println("Lower case % =====  " + formatter.format(lowerCasePercentage));
		System.out.println("Digits % =====  " + formatter.format(digitsPercentage));
		System.out.println("Special chars % =====  " + formatter.format(speclCharsPercentage));

	}

}
