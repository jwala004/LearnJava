package java8.naveenautomationlabs.nnumbrss;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FrequencyOfAllDigitsInNumber {

	public static void main(String[] args) {
		
		String number = "00124213412000";
		
		char[] numArry = number.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c : numArry) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			}else {
				map.put(c, 1);
			}
		}
		
		Set<Entry<Character, Integer>>  set = map.entrySet();
		for(Entry<Character, Integer> entry : set) {
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
		
		
		

	}

}
