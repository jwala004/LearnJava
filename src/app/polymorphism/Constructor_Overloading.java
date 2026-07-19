package app.polymorphism;

public class Constructor_Overloading {

	Constructor_Overloading() {
		System.out.println("o-arg constructor");
	}

	Constructor_Overloading(int a, long l) {
		System.out.println("constructor with int and long parameter");
	}

	Constructor_Overloading(float f, double d) {
		System.out.println("constructor with float and double parameter");
	}

	public static void main(String[] args) {
		new Constructor_Overloading();
		new Constructor_Overloading(11, 1111);
		new Constructor_Overloading(1.2f, 1222.333);
	}

}
