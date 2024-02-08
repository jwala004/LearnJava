package java8.naveenautomationlabs.strngg;

public class CountNumberOfWordsInTheCamelCaseString {

	/*
	 * Given a camel case string, count the number of total words in it (for eg:
	 * string="thisIsAString", total words here are 4) and write all the test cases
	 * for it also.
	 */
	public static void main(String[] args) {
		String str1 = "thisIsAString";
		System.out.println(CountNumberOfWordsInTheCamelCaseString.countTotalNumberOfWords(str1));
	}

	private static int countTotalNumberOfWords(String str) {

		int counter = 1;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				++counter;
			}
		}

		return counter;
	}

}
