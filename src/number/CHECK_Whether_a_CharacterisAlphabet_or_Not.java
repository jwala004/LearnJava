package number;

public class CHECK_Whether_a_CharacterisAlphabet_or_Not {

	public static void main(String[] args) {

		char c = 'a';
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			System.out.println(c + "  is an alphabet");
		} else {
			System.out.println(c + "  is not an alphabet");
		}
	}

}
