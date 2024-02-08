package java8.naveenautomationlabs.interviewquestions;

public class NullArgument {

	public static void main(String[] args) {
// method overloading with null argument
		test(null);
//		In the case of null, null is valid for both string and object. So, which method will be called?
//		Object is a parent class and string is a child class. While resolving the overloading method, the compiler 
//		always uses the presidency for the child type argument. So, the compiler will call the method with the string argument. 
	}

	public static void test(Object obj) {
		System.out.println("Object argument........");
	}

	public static void test(String str) {
		System.out.println("String argument........");
	}
}
