package company.boolment;

public class Palindrome_String {

	public static void main(String[] args) {

		String s = "jaaj";

		String reverse = "";

		char[] c = s.toCharArray();

		for (int i = c.length - 1; i >= 0; i--) {

			reverse = reverse + c[i];

		}

		if (s.equals(reverse)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
