package app.method;

public class Method1 {

	void m1() {
		System.out.println("m1 method");
	}

	static void m2() {
		System.out.println("m2 method");
	}

	public static void main(String[] args) {
	
		Method1 m=new Method1();
		m.m1();
		Method1.m2();
	}
}
