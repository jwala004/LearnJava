package java8.naveenautomationlabs.interviewquestions;

public class PrintHelloWorldWithoutUsingSemiColon {

	public static void main(String[] args) {

		if (System.out.printf("Hello1") == null) {

		}

		if (System.out.append("Hello2") == null) {

		}
		
		for(int i = 0; i< 1; System.out.printf("Hello3")) {
			i++;
		}

		for(int i = 0; i< 1; System.out.append("Hello4")) {
			i++;
		}
	}

}
