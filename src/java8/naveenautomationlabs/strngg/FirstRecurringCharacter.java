package java8.naveenautomationlabs.strngg;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstRecurringCharacter {

	/*
	 * How to find First Recurring Character In String
	 * 
	 * Print first Recurring Character In String
	 */

	public static void main(String[] args) {
		findFrequency("javasaweomj");
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

		for (char c : ch) {
			if (map.get(c) > 1) {
				System.out.println("First recurring character: " + c + " = " + map.get(c));
				break;
			}
		}

	}

}
