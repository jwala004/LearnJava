package app.string;

import java.util.Arrays;

public class Convert_String_Characters_INTO_OPPOSITE_CASE {

	public void convertOpposite(String s) {
		char[] ch = s.toCharArray();
//		System.out.print("Original String Before Changement: "+ch.toString());
//		System.out.print("Original String: " + ch);
		
//		System.out.print(ch);
//		System.out.print("Original String: "+ch);
		System.out.print("Original String: " + Arrays.toString(ch));
		System.out.print(s);
	
		for (int i = 0; i < s.length(); i++) {

//			char c3 = s.charAt(i);
//			System.out.println(ch[i]);
			if (ch[i] >= 'a' && ch[i] <= 'z') {

				ch[i] = (char) (ch[i] - 32);
//				System.out.println(ch[i]);

			} else if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) (ch[i] + 32);
//				System.out.println(ch[i]);
			}
			
		}
//		System.out.print("Original String Before Changement: "+ch.toString());
//		System.out.print(ch);
//		System.out.println("After Modification: " + ch.toString());
		System.out.println("After Modification:  " + Arrays.toString(ch));
		System.out.print(s);
//		System.out.println(ch);
//		System.out.println("After Modification: "+ch);
	}
	

	public static void main(String[] args) {
//		String s = "My Name is Jwala Kumar";
		String s = "MyNameIsJwala";
//		StringBuffer sb = new StringBuffer(s);
		Convert_String_Characters_INTO_OPPOSITE_CASE cc = new Convert_String_Characters_INTO_OPPOSITE_CASE();
		cc.convertOpposite(s);
//		System.out.println(s);
		
	}

}
