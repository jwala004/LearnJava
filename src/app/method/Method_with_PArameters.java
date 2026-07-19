package app.method;

public class Method_with_PArameters {

	void m1(int a,char c,float f) {
		System.out.println("m1 method");
		System.out.println(a);
		System.out.println(c);
		System.out.println(f);
	}

	static void m2(String s,double d) {
		System.out.println("m2 method");
		System.out.println(s);
		System.out.println(d);
	}

	public static void main(String[] args) {
	
		Method_with_PArameters m=new Method_with_PArameters();
		m.m1(1, 'c', 10.5f);
		Method_with_PArameters.m2("jwala", 10.5);
	}
}
