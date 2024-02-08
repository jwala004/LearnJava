package company.amazonintrvwprepn;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/*
 * Write an optimal program in any language to remove the duplicate char in the string. 
 * eg: i/p: call taxi 
 * 
 * o/p: cal taxi
*/
public class RemoveDuplicateChrtrsFrmString {

	public static void main(String[] args) {

		String str1 = "call taxi";

		RemoveDuplicateChrtrsFrmString.removeDuplicateCharsFrmStrng(str1);

	}

	private static void removeDuplicateCharsFrmStrng(String inputStrng) {

		String[] s1 = inputStrng.split(" ");

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < s1.length; i++) {

			String strFroms1Arr = s1[i];

			for (char c : strFroms1Arr.toCharArray()) {

				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}

			}

			Set<Entry<Character, Integer>> set = map.entrySet();

			for (Entry<Character, Integer> entry : set) {
				System.out.print(entry.getKey());
			}
			
			set.clear(); // clear set after dealing with 1st set of string

			System.out.print(" ");
		}

	}

}
