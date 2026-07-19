package app.polymorphism;
// Constructor overriding is not possible on java,it doesn't allow to declare the constructor in another inheriting class
//we cann't override constructors in java
class ABC{
	ABC(){
		System.out.println("Constructor of class ABC");
	}
}


public class Constructor_Overriding_TEST extends ABC {
	
	Constructor_Overriding_TEST() {
		System.out.println("o-arg constructor");
	}

	Constructor_Overriding_TEST(int a, long l) {
		System.out.println("constructor with int and long parameter");
	}

	Constructor_Overriding_TEST(float f, double d) {
		System.out.println("constructor with float and double parameter");
	}

	public static void main(String[] args) {
		new Constructor_Overriding_TEST();
		new Constructor_Overriding_TEST(11, 1111);
		new Constructor_Overriding_TEST(1.2f, 1222.333);
	}

}
