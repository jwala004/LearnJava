package app.abstraction;
// Method 1
/*abstract class AB {
	abstract void m1();

	abstract void m2();

	abstract void m3();

	void m4() {
		System.out.println("An Instance method declareed inside Abstract class");
	}
}

public class Abstraction_Example1 extends AB {

	@Override
	void m1() {
		System.out.println("Overriding m1() method of abstract class AB");
	}

	@Override
	void m2() {
		System.out.println("Overriding m2() method of abstract class AB");
	}

	@Override
	void m3() {
		System.out.println("Overriding m3() method of abstract class AB");
	}

	public static void main(String[] args) {
		Abstraction_Example1 aa = new Abstraction_Example1();
		aa.m1();
		aa.m2();
		aa.m3();
		aa.m4();
	}

}
*/
// Method 2 to get the same o/p(by creating just only one object)=by using the concept of Method calling
abstract class AB {
	abstract void m1();

	abstract void m2();

	abstract void m3();

	void m4() {
		System.out.println("An Instance method m4() declareed inside Abstract class");
	}
}

public class Abstraction_Example1 extends AB {

	@Override
	void m1() {
		System.out.println("Overriding m1() method of abstract class AB");
		m2();
		m3();
		m4();
	}

	@Override
	void m2() {
		System.out.println("Overriding m2() method of abstract class AB");
	}

	@Override
	void m3() {
		System.out.println("Overriding m3() method of abstract class AB");
	}

	public static void main(String[] args) {
		new Abstraction_Example1().m1();
		

	}

}
