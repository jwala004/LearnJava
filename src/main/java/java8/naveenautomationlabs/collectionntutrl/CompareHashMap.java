package java8.naveenautomationlabs.collectionntutrl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CompareHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1,  "jwala");
		map1.put(2,  "sonu");
		map1.put(3,  "monu");

		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(1,  "jwala");
		map2.put(2,  "sonu");
		map2.put(3,  "monu");

		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.put(1,  "jwala");
		map3.put(2,  "sonu");
		map3.put(3,  "monu");	
		map3.put(4,  "anu");
		
//		Using equals() method, on the basis of key-value 
		System.out.println(map1.equals(map2));
		System.out.println(map1.equals(map3));
		
//		Compare hashmaps for the same keys : keyset()
		System.out.println(map1.keySet().equals(map2.keySet())); //true
		System.out.println(map1.keySet().equals(map3.keySet())); //true

//		Find out the extra keys:
		HashMap<Integer, String> map4 = new HashMap<Integer, String>();
		map4.put(1,  "jwala");
		map4.put(2,  "sonu");
		map4.put(3,  "monu");	
		map4.put(4,  "anu");
		
//		Combine or union the keys from both the maps: using Hashset
		HashSet<Integer> combineKeys = new HashSet<Integer>(map1.keySet());
		
//		add the keyset from map4
		combineKeys.addAll(map4.keySet());
		combineKeys.removeAll(map1.keySet());
		System.out.println(combineKeys);
		
//		Compare maps by values
		HashMap<Integer, String> map5 = new HashMap<Integer, String>();
		map5.put(1,  "jwala");
		map5.put(2,  "sonu");
		map5.put(3,  "monu");

		HashMap<Integer, String> map6 = new HashMap<Integer, String>();
		map6.put(1,  "jwala");
		map6.put(2,  "sonu");
		map6.put(3,  "monu");

		HashMap<Integer, String> map7 = new HashMap<Integer, String>();
		map7.put(1,  "jwala");
		map7.put(2,  "sonu");
		map7.put(3,  "monu");	
		map7.put(4,  "monu");
		
//		Duplicates are not allowed: using arraylist
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values()))); //true
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values()))); //false
		
//		Duplicates are allowed : using HashSet
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values()))); //true
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values()))); //true
		
		
	}

}
