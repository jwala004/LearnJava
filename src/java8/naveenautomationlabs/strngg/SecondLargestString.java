package java8.naveenautomationlabs.strngg;

public class SecondLargestString {

	/*
	 * One of interviewer asked me string program eg. String
	 * s=" I love my country india"; How to print second highest length word from
	 * string please share this program on your
	 */

	/*
	 * To Do: Sort an String array based in descending order in terms of length
	 */
	
	static String temp = "";
	static String temps = "";

	public static void main(String[] args) {

		String str = "I Love Selenium My Country India  ";
		String str1[] = str.split(" ");
		int longest = 0;
		int seclongest = 0;

		for (int i = 0; i <= str1.length - 1; i++) {
			int templen = 0;
			templen = str1[i].length();
			if (longest < templen) {
				seclongest = longest;
				longest = templen;
				temp = str1[i];
			} else if (seclongest < templen) {
				seclongest = templen;
				temps = str1[i];
			}

		}
		System.out.println("The string " + temp + " length of " + longest + " is the longest in the given string");
		System.out.println(
				"The string " + temps + " length of " + seclongest + " is the second longest in the given string");
	}
}
