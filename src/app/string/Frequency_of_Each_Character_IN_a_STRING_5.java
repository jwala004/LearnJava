package app.string;

import java.util.HashMap;
import java.util.Map;

public class Frequency_of_Each_Character_IN_a_STRING_5 {

	public static void main(String[] args) {
		String s = "abbcccddddee a b c d e";

//		String ss =s.replaceAll(" ", "");
//		char[] c = s.toCharArray();
		
//		char[] c = s.replaceAll(" ", "").toCharArray();
		
		char[] c = s.replaceAll("\\s+", "").toCharArray();

		Map<Character, Integer> m = new HashMap<Character, Integer>();

		for(int i=0;i<c.length;i++) {
			
//			if( m.containsKey(' ') ){
//			}else
			
			if(m.containsKey(c[i])) {
				
				m.put(c[i], m.get(c[i])+1);
				
			}else {
				m.put(c[i], 1);
			}
			
		}
		
		
		
		
		
		
		System.out.println(m);
	}

}

