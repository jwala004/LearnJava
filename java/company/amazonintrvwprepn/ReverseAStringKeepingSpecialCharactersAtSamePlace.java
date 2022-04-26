package company.amazonintrvwprepn;

public class ReverseAStringKeepingSpecialCharactersAtSamePlace {

	/*
	 * Reverse a string keeping special characters at same position
	 * 
	 * i.e. as$d% to ds$a%
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "as$d%";

		ReverseAStringKeepingSpecialCharactersAtSamePlace.reverseStrng(s1);
	}

	private static void reverseStrng(String str) {

		for (int i = str.length() - 1; i >= 0; i--) {

			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				System.out.print(str.charAt(i));
			} else {
				System.out.print(str.charAt(i));
			}
		}

	}

}
