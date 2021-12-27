package java8.lambdas;

import java.util.function.Consumer;

public class TestRunner {

	public static void main(String[] args) {

//		Conventional way of doing
		IPrintableImplmt iPrintableImplmt = new IPrintableImplmt();
//		iPrintableImplmt.print();

//		ANONYMS INNER CLASS way of doing it
		IPrintable ip = new IPrintable() {

			@Override
			public void print() {
				System.out.println("ANONYMS INNER CLASS");
			}
		};
//		ip.print();

//		Lambda style of doing it
		IPrintable ip2 = () -> System.out.println("I am a Lambda expression.");
//		ip2.print();

//		Animal interface code starts from here	
		perform(new Dog());
		
		stringOperation((s) -> System.out.println(s.toLowerCase()));
		stringOperation((s) -> System.out.println(s.toUpperCase()));

	}

//	Animal interface code starts from here
	static void perform(Animal animal) {
//		animal.run();
	}

	private static void stringOperation(Consumer<String> consumer) {
		String temp = "JwalA";
		consumer.accept(temp);
	}

	private static void toLower(String str) {
		System.out.println(str.toLowerCase());
	}

	private static void toUpper(String str) {
		System.out.println(str.toUpperCase());
	}

}
