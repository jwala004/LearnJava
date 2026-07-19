package app.string;

//By Reverse Iteration method (from javatpoint)
public class Reverse_String_3 {
	public static String reverseString(String str) {
		char ch[] = str.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev += ch[i];
		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println(Reverse_String_3.reverseString("Jwala Kumar"));
	}

}
