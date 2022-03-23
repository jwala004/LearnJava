package java8.naveenautomationlabs.javaprogram.interviewquestions;

public class PrivateConstructor {
	
	String name; int age;

	private PrivateConstructor() {

	}

	static {
		PrivateConstructor p1 = new PrivateConstructor();
		System.out.print("PrivateConstructor static block: ");
		System.out.println(p1.name = "Jwala");
	}

	public static int createInstance() {
		PrivateConstructor p2 = new PrivateConstructor();
		return p2.age =21;
	}

}
