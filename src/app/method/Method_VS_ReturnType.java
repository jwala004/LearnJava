package app.method;

public class Method_VS_ReturnType {

	int m1() {
		System.out.println("m1 method");
		return 10;
	}

	public static void main(String[] args) {

		Method_VS_ReturnType m = new Method_VS_ReturnType();
		int x = m.m1();
		System.out.println("return value of m1() method is :" + x);
	}
}
