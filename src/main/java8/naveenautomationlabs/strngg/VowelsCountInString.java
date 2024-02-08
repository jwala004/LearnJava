package java8.naveenautomationlabs.strngg;

import java.util.function.IntPredicate;

public class VowelsCountInString {

	public static void main(String[] args) {

		String str = "javaisawesome";

		countVowels(str);

		countVowelsUsingStreams(str);

	}

//	M1
	private static void countVowels(String str) {

//		int counter = 0;
//		
//		for (char c : str.toCharArray()) {
//
//			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//				System.out.print(c);
//				counter++;
//			}
//		}
//		
//		System.out.println("\n"+"Total number of vowels: "+counter);

	}

//	M2 : Using Java 8 Streams
	private static void countVowelsUsingStreams(String test) {

		IntPredicate vowel = new IntPredicate() {

			@Override
			public boolean test(int value) {
				return value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u' || value == 'A'
						|| value == 'E' || value == 'I' || value == 'O' || value == 'U';
			}
		};

		long count = test.chars().filter(vowel).count();
		System.out.println(count);

	}

}
