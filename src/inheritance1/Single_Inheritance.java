package coom.app.inheritance1;

class A {

	void m1() {
		System.out.println("m1 method");
	}

	void m2() {
		System.out.println("m2 method");
	}
}

public class Single_Inheritance extends A {
	void m3() {
		System.out.println("m3 method");
	}

	public static void main(String[] args) {
		Single_Inheritance aa = new Single_Inheritance();
		aa.m1();
		aa.m2();
		aa.m3();

	}

}
