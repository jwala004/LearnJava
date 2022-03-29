package java8.naveenautomationlabs.interviewquestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountOfWordsFromCapitalisedString {

	/*
	 * Get the Count of Words From a Capitalized String
	 */

	public static void main(String[] args) {

		String str = "JwalaTheBoy";

//		M1: Using loop
		int count1 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				count1++;
			}
		}

		System.out.println(count1);

//		M2: Using ASCII value
		int count2 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				count2++;
			}
		}

		System.out.println(count2);

//		M3: Using Character class
		int count3 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				count3++;
			}
		}

		System.out.println(count3);

//		M4: Using Streams and ASCII
		long count4 = str.chars().filter(e -> e >= 65 && e <= 90).count();
		System.out.println(count4);

//		M5: Using Streams and Character.isUpperCase() method
		long count5 = str.chars().filter(e -> Character.isUpperCase(e)).count();
		System.out.println(count5);

//		M6: Using Regex expression
		String reg = "[A-Z]+";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(str);
		int count6 = 0;
		while (matcher.find()) {
			count6 += matcher.group(0).length();
		}
		System.out.println(count6);

//	   If the string is starting with upper case character, then all the above logic is fine. But if the string is
//	   starting with lower case character, then it fails. so to handle it, we need to use some extra logic. And also if there is any space
//		then, we need to first trim() the string

		String newStr = " helloWorldAMdoingGood";
		int count7 = 0;
		if (Character.isLowerCase(newStr.trim().charAt(0))) {
			count7++;
		}

		for (int i = 0; i < newStr.length(); i++) {
			if (newStr.charAt(i) >= 'A' && newStr.charAt(i) <= 'Z') {
				count7++;
			}
		}

		System.out.println(count7);

	}

}
