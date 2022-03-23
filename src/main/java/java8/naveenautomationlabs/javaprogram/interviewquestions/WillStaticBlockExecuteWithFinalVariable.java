package java8.naveenautomationlabs.javaprogram.interviewquestions;

public class WillStaticBlockExecuteWithFinalVariable {

	public static void main(String[] args) {
//		if the varible is declared as final, then static block won't execute
		System.out.println(Main.var);

	}

}

class Main {

	static final int var = 100;

	static {
		System.out.println("Main class static block........");
	}
}
