package java8.naveenautomationlabs.strngg;

public class CheckSubStringIsPresentInGivenStringOrNot {

	/*
	 * Check if Substring is Present in a Given String
	 */
	public static boolean isSubString(String main, String sub) {
		return main.matches("(.*)" + sub + "(.*)");
// (.*) the regex in parentheses means it can start with any thing
//	and the "sub" string can end with anything	
	}

	public static boolean isSubString1(String main, String sub) {
		return main.contains(sub);
	}

	public static void main(String[] args) {
		System.out.println(isSubString("johndoe", "jo"));
		
		System.out.println(isSubString1("doe", "jo"));
		
		System.out.println(isSubString1("doe", "o"));
		
	}

}
