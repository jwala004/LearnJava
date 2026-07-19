package app.method;

public class Method_Calling {
	void m1() {
		m2();
		m3();
		System.out.println("m1 method");
	}

	void m2() {
		m3();
		System.out.println("m2 method");
	}

	void m3() {
		System.out.println("m3 method");
	}

	public static void main(String[] args) {

		Method_Calling m = new Method_Calling();
		m.m1();
	}

}
