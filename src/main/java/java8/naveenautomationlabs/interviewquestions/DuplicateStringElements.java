package java8.naveenautomationlabs.interviewquestions;

import java.util.HashMap;

import java.util.HashMap;
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
//			for (int j = i+1; j < arr.length; j++) {
//		for (int i = 0; i < arr.length; i++) {
//
//			for (int j = i + 1; j < arr.length; j++) {
//
//				if (arr[i] == arr[j]) {
//					System.out.println(arr[i]);
//				}

//				break; // using break will print the duplicate values only once, otherwise it will be printed based on occurance
//			}
//		}

//	Brute-force has	time complexity of O(n^2) 

//		M2: using HashSet 

//		Set<String> set = new HashSet<String>();
//		
//		for(String str : arr) {
//			
//			if(set.add(str) == false){
//				System.out.println(str);
//			}
//					
//		}

//		M3: Using HashMap
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String st : arr) {
			Integer count = map.get(st);

			if (count == null) {
				map.put(st, 1);
			} else {
				map.put(st, ++count);
			}
		}

		Set<Entry<String, Integer>> entrySet = map.entrySet();

		for (Entry<String, Integer> entr : entrySet) {
			if (entr.getValue() > 1) {
				System.out.println(entr.getKey());
//				System.out.println(entr.getKey()+" "+entr.getValue());
			}

		}

	}

}
