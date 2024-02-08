package company.amazonintrvwprepn;

public class ReverseWordsInString {

	public static void main(String[] args) {

		String str1 = "Hello World";

		ReverseWordsInString.reverseStrng(str1);

	}

	private static void reverseStrng(String str) {

		String[] strArry = str.split(" ");

		for (int i = 0; i < strArry.length; i++) {

			String s1 = strArry[i];

			for (int j = s1.length() - 1; j >= 0; j--) {
				System.out.print(s1.charAt(j));
			}

			System.out.print(" ");

		}

//		Style 2 to write the same above code in diffrent fashion

//		for (int i = 0; i < strArry.length; i++) {
//
//			for (int j = strArry[i].length() - 1; j >= 0; j--) {
//				System.out.print(strArry[i].charAt(j));
//			}
//
//			System.out.print(" ");
//
//		}

	}

}
