package number;

public class CHECK_Whether_a_CharacterisAlphabet_or_Not_USING_ternary_operator {

	public static void main(String[] args) {

		char c = 'd';
		String output = ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) ? c + "  Is an Alphabet"
				: c + "  Not an Alphabet";
		System.out.println(output);
	}

}
