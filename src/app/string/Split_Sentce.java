package app.string;

public class Split_Sentce {

	public static void main(String[] args) {
		String s1 = "I am learning Java";
//	I
//	am 
//	learning 
//	Java
		int ln = s1.length();

		for (int i = 0; i < ln; i++) {
			Character c = s1.charAt(i);
			System.out.print(c);
			if (Character.isSpaceChar(c)) {

				System.out.printf("\n");

			}
		}

	}
}
