package app.method;

public class Method_VS_ReturnType_2 {

	int m1() {
		System.out.println("m1 method");
		return 10;
	}
	char m2() {
		System.out.println("m2 method");
		return 'a';
	}
	float m3() {
		System.out.println("m3 method");
		return 10.5f;
	}
	String m4() {
		System.out.println("m4 method");
		return "jwala";
	}
	int[] m5() {
		System.out.println("m5 method");
		return null;
		
	}

	public static void main(String[] args) {

		Method_VS_ReturnType_2 m = new Method_VS_ReturnType_2();
		int x = m.m1();
		System.out.println("return type/value of m1() method is :" + x);
		char c=m.m2();
		System.out.println("return type/value of m2() method is :" + c);
		float f=m.m3();
		System.out.println("return type/value of m3() method is :" + f);
		String s=m.m4();
		System.out.println("return type/value of m4() method is :" + s);
		int[] i=m.m5();
		System.out.println("return type/value of m5() method is :" + i);
	}
}
