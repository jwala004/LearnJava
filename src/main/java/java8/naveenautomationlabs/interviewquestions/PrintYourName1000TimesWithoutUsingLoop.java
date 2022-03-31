package java8.naveenautomationlabs.interviewquestions;

public class PrintYourName1000TimesWithoutUsingLoop {

	/*
	 * Print Your Name 1000 Times Without Using Loop
	 */

	public static void main(String[] args) {

		printName1000Times(1);
	}

	static int i = 1;

	private static void printName1000Times(int count) {
		
		if(count <= 1000) {
			System.out.println("Jwala"+ " "+ i++);
			
			printName1000Times(count + 1);
		}
	}

}
