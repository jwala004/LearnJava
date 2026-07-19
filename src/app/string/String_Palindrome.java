package app.string;

public class String_Palindrome {

	public static void main(String[] args) {
		String s = "jaaaaajz";

		System.out.println("Originnal String " + s);

		String ss = "";
		char[] c = s.toCharArray();

		for (int i = c.length - 1; i >= 0; i--) {

//			System.out.print(c[i]);
			ss = ss + c[i];

		}
		System.out.println("After Reversal String " + ss);
		if (s.equals(ss)) {
			System.out.print(" Palindrome");
		} else {
			System.out.print("Not Palindrome");
		}

	}
}