package java8.naveenautomationlabs.strngg;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		printDuplicateCharacters("jwalajwalaZ");

	}

	public static void printDuplicateCharacters(String str) {
		if (str == null) {
			System.out.println("Null String");
			return;
		}
		if (str.isEmpty()) {
			System.out.println("Empty String");
			return;
		}
		if (str.length() == 1) {
			System.out.println("Single char String");
			return;
		}

		char[] charArray = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (Character ch : charArray) {
			if (charMap.containsKey(ch)) { // if (charMap.get(ch) != null) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}

//		Print the Map:
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() >= 1) {
				System.out.print(entry.getKey() + "" + entry.getValue() + "\n");
//				System.out.println();
			}
//			if (charMap.containsKey('l'))  {
//				System.out.println(entry.getKey() + "" + entry.getValue());
//				break;
//			}
		}

	}

}
