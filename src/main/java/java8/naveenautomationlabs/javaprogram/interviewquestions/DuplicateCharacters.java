package java8.naveenautomationlabs.javaprogram.interviewquestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		printDuplicateCharacters("jwalajwala");

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

		char words[] = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (Character ch : words) {
			if (charMap.containsKey(ch)) { // if (charMap.get(ch) != null) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}

//		Print the Map:
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.print(entry.getKey() + "" + entry.getValue());
			}
		}

	}

}
