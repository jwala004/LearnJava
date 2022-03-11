package com.intrvw.arrayquestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

public class DuplicateStringElements {

	static Integer count;

	public static void main(String[] args) {

		String[] student = { "jwala", "sonu", "monu", "sonu", "anu", "anu", "anu", "son", "anuu" };

		System.out.println("Duplicate elements from array using hash table");

		Map<String, Integer> map = new HashMap<>();
		// build hash table with count

		for (String name : student) {
//			int counter = 0;
			count = map.get(name);
			System.out.println("Count value - " + count);
			if (count == null) {
				map.put(name, 1);

				System.out.println("Count value -- " + count);

			} else {
				map.put(name, ++count);
				System.out.println("Count value --- " + count);
//				counter++;
			}

			if (Objects.nonNull(count)) {
				System.out.println("Count value ---- " + count);
				System.out.println("Duplicate element from array : " + " occurance count " + count);
			}
		}
		// Print duplicate elements from array in Java
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
//				System.out.println("Duplicate element from array : " + entry.getKey() + " occurance count ");

				System.out.println("Count value ------** " + count);

			}
		}
	}
}
