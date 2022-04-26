package java8.naveenautomationlabs.strngg;

public class StringReversal {

	public static void main(String[] args) {

		String str = "jwala";

		System.out.print(StringReversal.rev(str));

	}

	public static String rev(String str) {

		String reverse = "";

		int strLen = str.length();

		if (str.length() > 0) {
			reverse = reverse + str.charAt(str.length() - 1);
			--strLen;
//			rev(str);
		}

		return reverse;
	}

}
