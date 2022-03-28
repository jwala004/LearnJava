package java8.naveenautomationlabs.interviewquestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateIntegersInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 4, 5, 3, 2, 1, 6, 7, 1, 2, 2, 3 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int num : arr) {

			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}

		}

		Set<Entry<Integer, Integer>> entrySet = map.entrySet();

		for (Entry<Integer, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}

	}

}
