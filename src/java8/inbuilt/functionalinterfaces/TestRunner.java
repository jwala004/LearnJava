package java8.inbuilt.functionalinterfaces;

public class TestRunner {

	public static <T> void main(String[] args) {

//		ANONYMS INNER CLASS way of doing it
		IPrintable<String> ip1 = new IPrintable<String>() {
			
			@Override
			public void print(String t) {
				System.out.println(t);
			}
		}; 
		ip1.print("Hello using ANONYMS INNER CLASS");
		
//		Lambda style of doing it
		IPrintable<String> ip2 = t -> System.out.println(t); 
		ip2.print("Hello using Lambda style");
		
		 
		
		
		
		
		
		

	}

}
