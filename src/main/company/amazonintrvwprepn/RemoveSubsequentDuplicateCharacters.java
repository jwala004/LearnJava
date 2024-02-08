package company.amazonintrvwprepn;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveSubsequentDuplicateCharacters {

	/*
	 * Given a string, remove subsequent duplicate characters until we get a unique
	 * set of characters.
	 * 
	 * Ex: input ==> apple ; expected output ==> ale
	 * 
	 * Ex: input ==>appapple; expected output ==>le
	 * 
	 * The input will be in char array. char[] removeDupes(char[] inputString){ }
	 */
	public static void main(String[] args) {

		String str1 = "apple";

		String str2 = "appapple";

		char[] charArr1 = str1.toCharArray();

		char[] charArr2 = str2.toCharArray();

		RemoveSubsequentDuplicateCharacters.removeSubsqtChrs(charArr1);

		System.out.println(); // just to create new line

		RemoveSubsequentDuplicateCharacters.removeSubsqtChrs(charArr2);
	}

	private static void removeSubsqtChrs(char[] passArray) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : passArray) {

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}

		Set<Entry<Character, Integer>> set = map.entrySet();

		for (Entry<Character, Integer> entry : set) {

			if (entry.getValue() == 1) {
				System.out.print(entry.getKey());
			}
		}

	}

}
