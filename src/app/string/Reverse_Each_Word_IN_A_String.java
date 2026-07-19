package app.string;

// M-1 
public class Reverse_Each_Word_IN_A_String {

	public static void main(String[] args) {

		String string = "This is Jwalgfcfgcfgca kumar.hv";

		String[] s = string.split(" ");

		for (int i = 0; i < s.length; i++) {

			String ss = s[i];

//		System.out.print(ss);

			char[] ch = ss.toCharArray();

			for (int j = ch.length - 1; j >= 0; j--) {

				System.out.print(ch[j]);
			}

			System.out.print(" ");

		}

	}
}

//	M -2

//public class Reverse_Each_Word_IN_A_String {
//
//	public static void main(String[] args) {
//		
//		String string="This is Jwala kumar.hv";
//
//		String[] s= string.split(" ");
//	
//		for(String reversedString : s) {
//			
//			String reversedWords = new StringBuilder(reversedString).reverse().toString();
//			
//			System.out.print(reversedWords+" ");
//		}
//
//	}
//}