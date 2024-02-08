package array;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MostOccuringInteger {

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

//		Now, we will find the number with the maximum frequency and return it:
		Integer popular = Collections.max(map.entrySet(), new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		}).getKey();
		
		System.out.println(popular);

	}

}
