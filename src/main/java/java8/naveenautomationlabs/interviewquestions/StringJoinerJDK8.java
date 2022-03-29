package java8.naveenautomationlabs.interviewquestions;

import java.util.StringJoiner;

public class StringJoinerJDK8 {

	public static void main(String[] args) {

		/*
		 * What is StringJoiner in JDK 1.8?
		 * 
		 * Combine Multiple Strings into One
		 * 
		 * StringJoiner is a class introduced in Java 8 for joining separate strings
		 * into one, like taking a list of emp names and returning them as a
		 * comma-delimited string.
		 * 
		 */

		StringJoiner joiner = new StringJoiner(",", "{", "}");
		joiner.add("jwala").add("sonu").add("monu").add("devansh");

		System.out.println(joiner.toString());

	}

}
