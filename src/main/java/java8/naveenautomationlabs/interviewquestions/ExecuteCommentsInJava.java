package java8.naveenautomationlabs.interviewquestions;

public class ExecuteCommentsInJava {

	public static void main(String[] args) {
		
		/* Can We Execute Comments in Java? 
		 * Yes we can using, Unicode carriage return
		 */	
		
//		Hi this is my java code (' \u000d System.out.println("Hello Jwala");
		
		System.out.println("Java");
		
		int val = 10;
		// \u000d
		val = 20;
		
		System.out.println(val);
		System.out.println(\u000d); // space will be printed
		System.out.println("Java");
		
		
		
	}

}
