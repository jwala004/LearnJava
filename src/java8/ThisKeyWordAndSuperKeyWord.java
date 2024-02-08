package java8;

class ParentClass {

	int a = 100, b = 200;

}

public class ThisKeyWordAndSuperKeyWord extends ParentClass {

	int a = 10, b = 20;

	void add(int a, int b) {
		System.out.println(a + b);
		System.out.println(a + b);
		System.out.println(a + b);
	}

	private void add2(int a, int b) {
		System.out.println("Local variable value will be used here: " + (a + b));
		System.out.println("Current class instance variable value will be used here: " + (this.a + this.b));
		System.out.println("Parent class instance variable value will be used here: " + (super.a + super.b));
	}

	public static void main(String[] args) {
// Here priority will go to local variable, and local variables will be executed.
		new ThisKeyWordAndSuperKeyWord().add(1000, 2000);

		new ThisKeyWordAndSuperKeyWord().add2(1000, 2000);

	}

}
