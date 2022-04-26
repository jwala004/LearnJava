package java8.naveenautomationlabs.interviewquestions;

public class HelloWorld {
	
	/*
	 * Print Hello World Without Static Block and Blank Main Method Body
	 * 
	 */	
	
	public static boolean print() {
		System.out.println("Hello world!");
		return true;
	}

	static boolean boo = print();
	
	public static void main(String[] args) {
		
	
	}

}
