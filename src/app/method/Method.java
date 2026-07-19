package app.method;

public class Method {
	void m1() {
		System.out.println("m1 method");
	}
	void m2(int a, char c,boolean b,double d, String s) {
		System.out.println("m2 method");
		System.out.println(1);
		System.out.println('a');
		System.out.println(true);
		System.out.println(333.343);
		System.out.println("jwala");
	}
	int m3() {
		System.out.println("m3 method");
		return 1;
		}
	char m4() {
		System.out.println("m4 method");
		return 'c';
	}
	static void m5() {
		System.out.println("m5 method");
	}
	static int m6() {
		System.out.println("m6 method");
		return 1;
	}
	public static void main(String[] args) {
    
		Method m=new Method();
		m.m1();m.m2(11, 'a', true, 122222, "jwala kumar");
		m.m3();m.m4();
		m.m5();
		m5();
		Method.m5();
		m.m6();
		m6();
		Method.m6();
	
	}
}
