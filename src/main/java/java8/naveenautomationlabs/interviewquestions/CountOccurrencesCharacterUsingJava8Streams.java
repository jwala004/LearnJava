package java8.naveenautomationlabs.interviewquestions;

public class CountOccurrencesCharacterUsingJava8Streams {

	public static void main(String[] args) {
		/*
		 * Count the Number of Occurrences of a Character in a String using Java 8
		 * Streams
		 */

		String str = "javaisawesome";

		long l = getCharCount(str, 'a');
		System.out.println(l);

	}

	public static long getCharCount(String str, char c) {

		return str.chars().filter(e -> (char) e == c).count();

	}
}
