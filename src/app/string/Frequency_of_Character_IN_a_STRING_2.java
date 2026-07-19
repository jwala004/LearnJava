package app.string;

public class Frequency_of_Character_IN_a_STRING_2 {

	public static void main(String[] args) {
		String s = "jwaljjwjwl";
		char c1 = 'j';
		char c2 = 'w';
		char c3 = 'l';
		char c4 = 'a';
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		for (int i = 0; i < s.length(); i++) {
			if (c1 == s.charAt(i)) {
				count1++;
			} else if (c2 == s.charAt(i)) {
				count2++;
			} else if (c3 == s.charAt(i)) {
				count3++;
			} else if (c4 == s.charAt(i)) {
				count4++;
			} else {

			}
		}
		System.out.println("Number of frequency of " + c1 + " in " + s + " is " + count1);
		System.out.println("Number of frequency of " + c2 + " in " + s + " is " + count2);
		System.out.println("Number of frequency of " + c3 + " in " + s + " is " + count3);
		System.out.println("Number of frequency of " + c4 + " in " + s + " is " + count4);

		System.out.println(c1 + "" + count1);
		System.out.println(c2 + "" + count2);
		System.out.println(c3 + "" + count3);
		System.out.println(c4 + "" + count4);
		System.out.print("Occurance of each character's frequency in one line : "+c1 + "" + count1 + "" + c2 + "" + count2 + "" + c3 + "" + count3 + "" + c4 + "" + count4);
	}

}
