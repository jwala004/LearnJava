package java8.naveenautomationlabs.interviewquestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateStringElements {

	public static void main(String[] args) {

		String[] arr = { "Java", "Python", "Python", "Java", "Java", "Javascript", "Java", "Javascript", "Javascript",
				"Ruby", "C" };

//		M1: using Brute-force
//		for (int i = 0; i < arr.length; i++) {
//
//			for (int j = i + 1; j < arr.length; j++) {
//
//				if (arr[i] == arr[j]) {
//					System.out.println(arr[i]);
//				}
//				break; // using break will print the duplicate values only once, otherwise it will be
//						// printed based on occurance
//			}
//		}

//		M2: using HashSet 
//		Set<String> set = new HashSet<String>();
//
//		for (int i = 0; i < arr.length; i++) {
//
//			if (set.add(arr[i]) == false) {
//				System.out.println(arr[i]);
//			}
//		}

//		M2: using HashMap
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String str : arr) {
			Integer count = map.get(str);
			if (count == null) {
				map.put(str, 1);
			} else {
				map.put(str, ++count);
			}
		}

//		Now, Print all the duplicate elements
		Set<Entry<String, Integer>> entrySet = map.entrySet();

		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
//				System.out.println(entry.getKey() +" "+entry.getValue());
			}
		}

	}

}
