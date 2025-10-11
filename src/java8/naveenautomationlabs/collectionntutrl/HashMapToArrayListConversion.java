package java8.naveenautomationlabs.collectionntutrl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class HashMapToArrayListConversion {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("comapany1", "Google");
		map.put("comapany2", "Amazon");
		map.put("comapany3", "Metaverse");
		map.put("comapany4", "Tesla");
		map.put("comapany5", "NetFlix");

		System.out.println("Map   size: " + map.size());
		System.out.println("--------------------------------------------");
		
//		Iterate HashMap using iterator
		Iterator<Entry<String, String>> itr = map.entrySet().iterator();

//		Printing with key-value using Entry
		while (itr.hasNext()) {
			Entry<String, String> entry = itr.next();
			System.out.print("Key= " + entry.getKey() + " Value= " + entry.getValue());
		}
		System.out.println();
		System.out.println("--------------------------------------------");

//		Just iteratign using iterator
//		while (itr.hasNext()) {
//			System.out.print(itr.next() +" ");
//		}
//		System.out.println("--------------------------------------------");
		
		System.out.println("------------> Iterate using JDK 8 forEach <--------------------------------");
		map.forEach((k, v) -> System.out.println("Key " +k+ " Value " +v) );
		
		
		
		
//		Convert HashMap keys into ArrayList
		List<String> list = new ArrayList<String>(map.keySet());
		System.out.println("List size: " + list.size());

		for (String str : list) {
			System.out.println(str);
		}

		System.out.println("--------------------------------------------");
//		Convert HashMap values into ArrayList
		List<String> listValues = new ArrayList<String>(map.values());
		System.out.println("List size: " + listValues.size());

		for (String str : listValues) {
			System.out.println(str);
		}

	}

}
