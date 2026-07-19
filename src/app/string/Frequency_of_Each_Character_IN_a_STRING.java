package app.string;

import java.util.HashMap;
import java.util.Map;

public class Frequency_of_Each_Character_IN_a_STRING {

	public static void main(String[] args) {
		String s = "There Is An Employee In The Jungli jungle.";

		char[] c = s.toCharArray();

		Map<Character, Integer> m = new HashMap<Character, Integer>();

		for (Character cc : c) {

//			if (m.containsKey(cc) && m.containsKey(cc)) {
			if (m.containsKey(cc)) {
				m.put(cc, m.get(cc) + 1);

			} else {
				m.put(cc, 1);
			}
		}
		System.out.println(m);

	}

}

//			else if (m.containsKey(Character.isSpaceChar(cc))) {
//			
//				System.out.print("");
//
//			}

//	} else if (m.containsKey(32)) {
