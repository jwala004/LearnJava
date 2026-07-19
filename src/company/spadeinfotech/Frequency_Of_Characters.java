package company.spadeinfotech;

public class Frequency_Of_Characters {

	public static void main(String[] args) {

		String s = "There is an elephant in the jungle";

//		boolean s1 = s.equalsIgnoreCase(s);
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
		int count9 = 0;
		int count10 = 0;
		int count11 = 0;
		int count12 = 0;
		int count13 = 0;

		for (int i = 0; i < s.length(); i++) {

//			if ('t' == s.charAt(i)) {
//				count1++;
//			} 

			if ('t' == s.charAt(i) || 'T' == s.charAt(i)) {
				count1++;
			} else if ('h' == s.charAt(i)) {
				count2++;
			} else if ('e' == s.charAt(i)) {
				count3++;
			} else if ('r' == s.charAt(i)) {
				count4++;
			} else if ('i' == s.charAt(i)) {
				count5++;
			} else if ('s' == s.charAt(i)) {
				count6++;
			} else if ('a' == s.charAt(i)) {
				count7++;
			} else if ('n' == s.charAt(i)) {
				count8++;
			} else if ('l' == s.charAt(i)) {
				count9++;
			} else if ('p' == s.charAt(i)) {
				count10++;
			} else if ('j' == s.charAt(i)) {
				count11++;
			} else if ('u' == s.charAt(i)) {
				count12++;
			} else if ('g' == s.charAt(i)) {
				count13++;
			}

		}
		System.out.print("t =" + count1 + " h =" + count2 + " e =" + count3 + " r =" + count4 + "i" + count5 + "s"
				+ count6 + "a" + count7 + "n" + count8 + "l" + count9 + "p" + count10 + "j" + count11 + "u" + count12
				+ "g" + count13);
	}

}
