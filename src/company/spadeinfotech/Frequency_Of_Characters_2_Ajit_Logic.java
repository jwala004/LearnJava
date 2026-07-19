package company.spadeinfotech;

public class Frequency_Of_Characters_2_Ajit_Logic {

	public static void main(String[] args) {

		String s = "There is an elephant in the jungle";

		char[] c = s.toCharArray();
		int count = 0;
		for (int i = 0; i < c.length - 1; i++) {

			if (c[i] == 't' || c[i] == 'h' || c[i] == 'e' || c[i] == 'r') {

				count++;

			}
			System.out.print(c[i] + "" + count);
		}

	}

}
