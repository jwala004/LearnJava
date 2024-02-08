package java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestProgram {

	public static void main(String[] args) {
		TestProgram.fun();
	}

	private static void fun() {

		String str = "Selenium is a UI automation tool";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		char ch[] = str.toCharArray();

		for (char c : ch) {

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}

		Set<Entry<Character, Integer>> set = map.entrySet();

		for (Entry<Character, Integer> entry : set) {

			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
