package company.amazonintrvwprepn;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class FilterDuplicateChrtrsFrmString {

	public static void main(String[] args) {

		String str1 = "apple";

		String str2 = "appapple";

		FilterDuplicateChrtrsFrmString.filterDuplicateCharsFrmStrng(str1);

		System.out.println(); // To add new line

		FilterDuplicateChrtrsFrmString.filterDuplicateCharsFrmStrng(str2);
	}

	private static void filterDuplicateCharsFrmStrng(String inputStrng) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
//				new LinkedHashMap<Character, Integer>();

		for (char c : inputStrng.toCharArray()) {

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}

		Set<Entry<Character, Integer>> set = map.entrySet();

		for (Entry<Character, Integer> entry : set) {

			if (entry.getValue() > 1) {
				System.out.print(entry.getKey());
			}
		}

	}

}
