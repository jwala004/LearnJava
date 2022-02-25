package com.intrvw.arrayquestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateStringElements {

	public static void main(String[] args) {

		String[] student = { "jwala", "sonu", "monu", "sonu", "anu", "anu", "anu", "sonu", "anuu" };

		System.out.println("Duplicate elements from array using hash table");

		Map<String, Integer> nameAndCount = new HashMap<>();
		// build hash table with count

		for (String name : student) {
			Integer count = nameAndCount.get(name);
			if (count == null) {
				nameAndCount.put(name, 1);
			} else {
				nameAndCount.put(name, ++count);
			}
		}
		// Print duplicate elements from array in Java
		Set<Entry<String, Integer>> entrySet = nameAndCount.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate element from array : " + entry.getKey());

			}
		}
	}
}
