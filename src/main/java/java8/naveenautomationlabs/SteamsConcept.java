package java8.naveenautomationlabs;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;

public class SteamsConcept {

	public static void main(String[] args) {

		/* --------------------> JDK 8 <--------------------------------------- */

//	Stream.of(1,2,3,4,5,6,7,8,9,10).filter(e -> e%2 ==0).forEach(e -> System.out.println(e));

//		appending "hello" with java and word
//	Stream.of("hello", "java").map(e -> e + " word").forEach(System.out::println);

//	optional : To avoid NullPointerException we use optional

		/*
		 * String s[] = new String[5]; System.out.println(s[2].length()); // the above
		 * program will throw NullPointerException because we haven't declared any value
		 * for s[2]
		 */
//		So, to write code in a manner that it doesn't throw NullPointerException we will use Optional class

//		Optional
		String s[] = new String[5];
//		s[2] = "Naveen";

//		Optional<String> isNull = Optional.ofNullable(s[2]);
//
//		if (isNull.isPresent()) {
//			System.out.println(s[2] + " " + s[2].length());
//
//		} else {
//			System.out.println("Value is not available.");
//		}

//		Creating a blank optional container
		Optional<String> nothing = Optional.empty();
		nothing.ifPresent(e -> System.out.println("Bye..."));

		/* --------------------> JDK 9 <----------------------------------- */

//		1. JShell: allows us to write code directly in the terminal same like python. One thing
//		to make sure before using it is that Java Home configuration is set.

//	    2. Factory method for immutable collection	
//		List<String>  list = List.of("java", "python", "ruby", "Js");
//		list.stream().forEach(e -> System.out.println(e));

		/* --------------------> JDK 10 <----------------------------------- */

//		1. var keyword, now no need to declare a data type explicitly while declaring a variable

//		var x = 10;
//		System.out.println(x+10);
//		
//		var h = new HashSet<String>();
//		h.add("jwala");
//		
//		var arrList = new ArrayList<String>();
//		arrList.add("jwala");
//		
//		System.out.println(arrList.get(0));

		/* --------------------> JDK 11 <----------------------------------- */
//		1. Single source File launch: that I will explain in some other video

		/* --------------------> JDK 12 <----------------------------------- */
//		1. New Switch case expression 
		
		
		
		

	}

}
