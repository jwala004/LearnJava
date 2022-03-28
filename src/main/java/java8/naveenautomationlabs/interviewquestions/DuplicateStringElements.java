<<<<<<< HEAD
package java8.naveenautomationlabs.interviewquestions;

import java.util.HashMap;
=======
package java8.naveenautomationlabs.javaprogram.interviewquestions;

import java.util.HashMap;
import java.util.HashSet;
>>>>>>> 323e7fb8857b3e95249a2bd71f6561e434cdf684
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateStringElements {

	public static void main(String[] args) {

		String[] arr = { "Java", "Python", "Python", "Java", "Java", "Javascript", "Java", "Javascript", "Javascript",
				"Ruby", "C" };

//		M1: using Brute-force
<<<<<<< HEAD

//		for (int i = 0; i < arr.length; i++) {
//
//			for (int j = i+1; j < arr.length; j++) {
=======
//		for (int i = 0; i < arr.length; i++) {
//
//			for (int j = i + 1; j < arr.length; j++) {
>>>>>>> 323e7fb8857b3e95249a2bd71f6561e434cdf684
//
//				if (arr[i] == arr[j]) {
//					System.out.println(arr[i]);
//				}
<<<<<<< HEAD
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

=======
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
>>>>>>> 323e7fb8857b3e95249a2bd71f6561e434cdf684
		}

	}

}
