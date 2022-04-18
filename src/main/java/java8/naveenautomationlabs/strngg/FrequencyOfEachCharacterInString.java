package java8.naveenautomationlabs.strngg;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FrequencyOfEachCharacterInString {

	/*
	 * How to find Frequency Of Each Character In String
	 * 
	 * Print first occuring character in String
	 */

	public static void main(String[] args) {
		findFrequency("saweomj");
	}

	private static void findFrequency(String str) {

		char[] ch = str.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : ch) {

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		Set<Entry<Character, Integer>> set = map.entrySet();

//		Print Frequency Of Each Character In String

//		for (Entry<Character, Integer> entry : set) {
//			System.out.println(entry.getKey() + " = " + entry.getValue());
//		}

//		Print first occuring character in String
//		for (Entry<Character, Integer> entry : set) {
//			if (entry.getValue() > 1) {
//				System.out.println("First occuring character: " + entry.getKey() + " = " + entry.getValue());
//			}
//			break;
//		}

		for (char c : ch) {
			if (map.get(c) > 1) {
				System.out.println("First recurring character: " + c + " = " + map.get(c));
				break;
			} else {
				System.out.println("First non-reccuring character:" + c + " = " + map.get(c));
				break;
			}
		}

	}

}
