package coom.app.inheritance1;

class A111 {

	void m1() {
		System.out.println("m1 method");
	}

	void m2() {
		System.out.println("m2 method");
	}
}

class B111 extends A111 {
	void m3() {
		System.out.println("m3 method");
	}

	void m4() {
		System.out.println("m4 method");
	}
}

public class Hierarchical_Inheritance extends A111 {
	void m5() {
		System.out.println("m5 method");
	}

	void m6() {
		System.out.println("m6 method");
	}

	public static void main(String[] args) {

		B111 bb = new B111();
		bb.m1();
		bb.m2();
		bb.m3();
		bb.m4();

		Hierarchical_Inheritance aa = new Hierarchical_Inheritance();
		aa.m1();
		aa.m2();
		aa.m5();
		aa.m6();

	}

}
