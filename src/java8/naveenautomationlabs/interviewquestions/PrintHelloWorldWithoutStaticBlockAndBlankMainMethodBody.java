package java8.naveenautomationlabs.interviewquestions;

public class PrintHelloWorldWithoutStaticBlockAndBlankMainMethodBody {

	public static int printString() {
		System.out.println("Hello World");
		return 1;
	}

	static int p = printString();

	public static void main(String[] args) {

	}

}
