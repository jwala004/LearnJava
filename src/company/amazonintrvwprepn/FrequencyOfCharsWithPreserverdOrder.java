package company.amazonintrvwprepn;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class FrequencyOfCharsWithPreserverdOrder {

	/*
	 * input string = aabbbccccaaa, maintain the insertion order and output should
	 * be a2b3c4a3
	 */

	public static void main(String[] args) {
		String str1 = "aabbbccccaaa";

		FrequencyOfCharsWithPreserverdOrder.freqcyOfStrng(str1);

	}

	private static void freqcyOfStrng(String inputStrng) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
//			new LinkedHashMap<Character, Integer>();

		for (char c : inputStrng.toCharArray()) {

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}

		Set<Entry<Character, Integer>> set = map.entrySet();

		for (Entry<Character, Integer> entry : set) {
			System.out.print(entry.getKey() + "" + entry.getValue());
		}

	}

}
