package java8.naveenautomationlabs.strngg;

public class StringImmutableOrNot {

	/*
	 * Prove that String is immutable in java? here "ABC" is a string, not str1.
	 * "ABC" is stored in the constant pool in heap memory. when you concat it with
	 * str2, and assign it to str1. str1 will start pointing to "ABCDEF". But "ABC"
	 * is still there in the pool without any change. Now there are three strings in
	 * pool: "ABC" (no reference), "DEF" has reference as str2 and "ABCDEF" is
	 * referred by str1.
	 */

	public static void main(String[] args) {
		String s1 = "ABC";

		String S2 = "DEF";

		s1 = s1.concat(S2);

		System.out.println(s1); // ABCDEF

	}

}
