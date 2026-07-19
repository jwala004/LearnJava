package app.string;

//my own solution || ch != ' '
public class Number_of_Vowels_and_Consonants_in_a_Sentence2 {

	public static void main(String[] args) {

		String ss = "This is jwala";
		int vowels = 0, consonants = 0;

		for (int i = 0; i < ss.length(); ++i) {
			char ch = ss.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				++vowels;
			} else if (ch == ' ') {

			} else if (ch != 'a' || ch != 'e' || ch != 'i' || ch != 'o' || ch != 'u' || ch != 'A' || ch != 'E'
					|| ch != 'I' || ch != 'O' || ch != 'U') {
				++consonants;

			} else {

			}
		}

		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
	}
}