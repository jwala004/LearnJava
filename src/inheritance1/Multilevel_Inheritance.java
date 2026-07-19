package coom.app.inheritance1;

class A11 {

	void m1() {
		System.out.println("m1 method");
	}

	void m2() {
		System.out.println("m2 method");
	}
}

class B11 extends A11 {
	void m3() {
		System.out.println("m3 method");
	}

	void m4() {
		System.out.println("m4 method");
	}

	void m5() {
		System.out.println("m5 method");
	}
}

public class Multilevel_Inheritance extends B11 {
	void m6() {
		System.out.println("m6 method");
	}

	public static void main(String[] args) {
		Multilevel_Inheritance aa = new Multilevel_Inheritance();
		aa.m1();
		aa.m2();
		aa.m3();
		aa.m4();
		aa.m5();
		aa.m6();

	}

}
