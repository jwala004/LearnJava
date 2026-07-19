package app.method;

public class Method_VS_ReturnType_3 {

	int m1() {
		System.out.println("m1 method");
		return 10;
	}
	char m2(char a) {
		System.out.println("m2 method");
		return a;
	}
	
	String m3() {
		System.out.println("m3 method");
		return "jwala";
	}
	

	public static void main(String[] args) {

		Method_VS_ReturnType_3 m = new Method_VS_ReturnType_3();
		int x = m.m1();
		System.out.println("return type/value of m1() method is :" + x);
		char c=m.m2('z');
		System.out.println("return type/value of m2() method is :" + c);
		String s=m.m3();
		System.out.println("return type/value of m3() method is :" + s);
	}
}
