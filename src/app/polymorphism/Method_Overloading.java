package app.polymorphism;

public class Method_Overloading {

	public void m1() {
		System.out.println("method without any argument");
	}

	public void m1(int i, int j, int a, long l) {
		System.out.println("method with arguments int,int,int,long");
	}

	public void m1(float f, double d) {
		System.out.println("method with arguments float and double ");
	}

	public void m1(char c, boolean b) {
		System.out.println("method with arguments char and boolean");
	}

	public static void main(String[] args) {
		Method_Overloading mm = new Method_Overloading();
		mm.m1();
		mm.m1(11, 110, 3, 42222);
		mm.m1(0.3f, 0.444);
		mm.m1('z', true);

	}

}
