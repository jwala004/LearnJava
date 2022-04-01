package java8.naveenautomationlabs.strngg;

public class CheckGivenStringIsAValidNumber {

	/*
	 * Check given number is a valid number or not
	 * 
	 * Check given phone number is valid - 10 digits
	 * 
	 * Check given Credit card number is valid - 16 digits
	 * 
	 */
	public static void main(String[] args) {
// validate number
		isNumber("123");
		isNumber("123wwwwqq");

//		validate phone number
		isValidPhoneNum("1234567890");
		isValidPhoneNum("123456789");
		isValidPhoneNum("123456789012");

//		validate credit card
		isValidCardNum("1234567890123456");
		isValidCardNum("12345678901234567890");

//		validate number using regex method
		System.out.println(isCorrectNumber("1234"));
		System.out.println(isCorrectNumber("0123456789"));

	}

//	Using Regex
	public static boolean isCorrectNumber(String num) {
		return num.matches("[0-9]{10}");
	}

	private static boolean isNumber(String number) {

		try {
			Long.parseLong(number);
			System.out.println("This is a valid number: " + number);
		} catch (NumberFormatException n) {
			System.out.println("This is not a valid number: " + number);
			return false;
		}

		return true;
	}

	private static boolean isValidPhoneNum(String number) {

		if (number.length() == 10 && number.matches("[0-9]{10}")) {
			System.out.println("This is a valid phone number: " + number);
			return true;
		}
		System.out.println("This is not a valid phone number: " + number);
		return false;
	}

	private static boolean isValidCardNum(String number) {

		if (number.length() == 16 && number.matches("[0-9]{10}")) {
			System.out.println("This is a valid  CC number: " + number);
			return true;
		}
		System.out.println("This is not a valid CC number: " + number);
		return false;
	}

}
