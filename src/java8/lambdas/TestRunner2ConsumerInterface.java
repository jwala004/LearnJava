package java8.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestRunner2ConsumerInterface {

	public static void main(String[] args) {

		List<String> lst = Arrays.asList("Jwala","Amuthan","Kumarr");
		
		for (String string : lst) {
//			System.out.println(string);
		}
		
		Consumer<String> consumer = (s)-> System.out.println(s); // ? -> string or super class of string class
		Consumer<String> consumer1 = (s)-> System.out.println(s.toLowerCase());
		Consumer<String> consumer2 = (s)-> System.out.println(s.toUpperCase());
		lst.forEach(consumer1);
//		lst.forEach((s)-> System.out.println(s));
		
		
		
		
	}

}
