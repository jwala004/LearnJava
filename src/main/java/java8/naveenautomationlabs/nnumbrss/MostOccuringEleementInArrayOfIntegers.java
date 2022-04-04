package java8.naveenautomationlabs.nnumbrss;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MostOccuringEleementInArrayOfIntegers {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 4, 5, 3, 2, 1, 6, 7, 1, 2, 3, 2 };

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
//		Print all the integars with frequency
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

		int max = 1;
		int mostFrequent = 1;

		for (Entry<Integer, Integer> e : map.entrySet()) {
// 		Swapping of the elements who is occuring most
			if (e.getValue() > max) {
				mostFrequent = e.getKey();
				max = e.getValue();
			}
		}

//		Print most frequent element
		System.out.println("Most frequent element: " + mostFrequent);

	}

}
