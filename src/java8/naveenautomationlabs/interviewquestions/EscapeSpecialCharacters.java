package java8.naveenautomationlabs.interviewquestions;

public class EscapeSpecialCharacters {

	public static void main(String[] args) {

		/* Adding backslah will ignore the special characters. And it will allow
		 * to print string with special characters.
		 * for example, printing --> /"Hello"/
		 * or printing --> /'Hello'/
		 * "Hello"
		 * I love "Java" and "programming" and "coffee"
		*/
		
//		System.out.println("/\"Hello\"/"); // /"Hello"/
		
//		System.out.println("/'Hello'/"); // /'Hello'/

//		System.out.println("\"Hello\""); // "Hello"

		System.out.println("I love "+"\"Java\""+" and "+"\"programming\""+" and"+" coffee."); 
		
		
		
		
	}

}
