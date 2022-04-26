package java8.naveenautomationlabs.strngg;

import java.util.Arrays;
import java.util.Objects;

public class CheckTwoStringsAreAnagramOrNot {

	/*
	 * Check Two Strings are Anagram Or Not using Sort and Equals
	 */
	public static void main(String[] args) {

//		Supplying null value
		System.out.println(isAnagram(null, null));
		
//		Supplying empty string
		System.out.println(isAnagram("", ""));
		
//		Supplying string length less than 1
		System.out.println(isAnagram("a", null));
		System.out.println(isAnagram("a", "ab"));
		
//		Supplying both string of similar length but diffent chars which are not matching
		System.out.println(isAnagram("Triangle", "anglezsw"));
		
//		Supplying both string of similar length with matching chars
		System.out.println(isAnagram("Triangle", "anglezsw"));
		System.out.println(isAnagram("Triangle", "angleTri"));
		
	}

	private static boolean isAnagram(String str1, String str2) {

		if (Objects.isNull(str1) || Objects.isNull(str2)) {
			System.out.println("Either of string is null");
			return false;
		}

		if (str1.isEmpty() || str2.isEmpty()) {
			System.out.println("Either of string is empty");
			return false;
		}

		if (str1.length() != str2.length()) {
			System.out.println("String length are not equal");
			return false;
		} else {
			str1.replaceAll("\\s", "");
			str2.replaceAll("\\s", "");
			
			char c1[] = str1.toLowerCase().toCharArray();
			char c2[] = str2.toLowerCase().toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);

			return Arrays.equals(c1, c2);

		}

	}

}
