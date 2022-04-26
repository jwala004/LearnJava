package java8.naveenautomationlabs.collectionntutrl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("country1", "India");
		map.put("country2", "USA");
		map.put("country3", "UK");
		map.put("country4", "FRANCE");
		map.put("country5", "RUSSIA");
		map.put("country6", "PORKISTAN");

		map.put("country6", "PORKI");

		map.put(null, "PORKISTAN");
		map.put(null, "CHINKI");

//		System.out.println(map.get("country1"));
//		System.out.println(map.get("country6"));
//		System.out.println(map.get(null));

		/*
		 * How to iterate HashMap?
		 */
//		1. By using iterator
		Iterator<Entry<String, String>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		System.out.println("==================================================");
//		2. By using forEach and lambda
		map.forEach((k, v) -> System.out.println("key = " + k + " value = " + v));

	}

}
