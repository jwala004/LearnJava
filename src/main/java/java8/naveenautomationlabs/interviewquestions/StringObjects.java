package java8.naveenautomationlabs.interviewquestions;

public class StringObjects {

	public static void main(String[] args) {

		/*
		 * When we create object using String literals, object gets created in String
		 * constant pool area. And if the object already exists, then it doesn't create
		 * any new object. It just points to the same object. When we create object
		 * using new keyword for String class, then object gets created in heap area
		 * with a separate instance or storage area.
		 */

		String s1 = "Hello World";
		String s2 = "Hello World";
		String s3 = s1;

		String n1 = new String("Hello");
		String n2 = new String("Hello");

		System.out.println(s1 == s2); // true
		System.out.println(s2 == s3); // true
		System.out.println(s1 == s3); // true

		System.out.println(n1 == n2); // false
		System.out.println(s1 == n1); // false
		

	}

}
