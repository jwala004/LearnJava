package pattern;

public class Palindrome_String {

	public static void main(String[] args) {

		String s = "jaaj";

		String ss = "";
		char[] c = s.toCharArray();

		for (int i = c.length - 1; i >= 0; i--) {

			ss = ss + c[i];
		}

		if (s.equals(ss)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
