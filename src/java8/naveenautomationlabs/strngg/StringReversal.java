package java8.naveenautomationlabs.strngg;

public class StringReversal {

	public static void main(String[] args) {

		String str = "jwala";

//		System.out.print(StringReversal.rev(str));

		System.out.print(StringReversal.rev2(str));

	}

	private static String rev2(String str) {
		String newStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			newStr = newStr + str.charAt(i);
		}
		return newStr;
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
