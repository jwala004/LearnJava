package java8;

public class Koronos {

	/*
	 * input: Jwala25M
	 * 
	 * output:
	 * 
	 * name: Jwala
	 * 
	 * age: 25
	 * 
	 * gender: Male
	 * 
	 */

	public static void main(String[] args) {
		Koronos.koronosInterview("Jwala25M");
	}

	private static void koronosInterview(String str) {

//		char[] ch = str.toCharArray();
//
//		System.out.print("name: ");
//
//		for (int i = 0; i < ch.length; i++) {
//
//			if (ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= 'A' && ch[i] <= 'Z') {
//				System.out.print(ch[i]);
//			} else if (ch[i] != 'a' || ch[i] != 'z' || ch[i] != 'A' || ch[i] != 'Z') {
//				System.out.println();
//				System.out.print("age: " + ch[i]);
//			} else {
////				System.out.print("age: " + ch[i]);
//			}
//
//		}
		
		System.out.println("name: " + str.substring(0, 5));

		System.out.println("age: " + str.substring(5, 7));
		
		System.out.println("gender: " + str.substring(7, 8));
	}

}
