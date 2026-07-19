package app.inheritance;
class A {
	void m1()
	{
		System.out.println("m1");
	}
}
class B extends A{
	void m2() {
		System.out.println("m2");
	}
	public static void main(String[] args) {
		B b=new B();
		b.m1();
		b.m2();
	}
	}
