package app.string;

public class Reverse_String_1 {

	public static void main(String[] args) {

		String s1 = "jwala";
		
		System.out.println(s1.length());
		
		String s2 = new String("Kumar");

		/*
		 * M-1 =using StringBuffer StringBuffer sb=new StringBuffer(s1);
		 * System.out.println(sb.reverse());
		 * 
		 */
		
		/*
		 * M-2 =BY converting String into character Array char[] ch=s1.toCharArray();
		 * for (int i = ch.length-1; i >= 0; i--) {
		 * 
		 * System.out.print(ch[i]);
		 * 
		 * }
		 */

		/*
		 * M-3 =BY using charAt() method for(int i=s1.length()-1;i>=0;i--) {
		 * System.out.print(s1.charAt(i)); }
		 * 
		 * }
		 */
		
		/*
		 * // M-4 =using StringBuilder StringBuilder sb=new StringBuilder(s1);
		 * System.out.println(sb.reverse());
		 * 
		 */

	}

}
