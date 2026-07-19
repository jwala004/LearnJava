package app.interfacee;

interface IT1 {
	void m1();

	void m2();

	void m3();

}

/*
 * public class Interface_Example1 implements IT1 {
 * 
 * @Override public void m1() {
 * 
 * System.out.println("Overriding m1() method of interface IT1"); }
 * 
 * @Override public void m2() {
 * System.out.println("Overriding m2() method of interface IT1"); }
 * 
 * @Override public void m3() {
 * System.out.println("Overriding m3() method of interface IT1"); }
 * 
 * public void m4() { System.out.
 * println("m4() Instance method declared inside class Interface_Example1"); }
 * 
 * public static void main(String[] args) {
 * 
 * Interface_Example1 ii = new Interface_Example1(); ii.m1(); ii.m2(); ii.m3();
 * ii.m4(); }
 * 
 * }
 */

// M-2 by using method calling approach
public class Interface_Example1 implements IT1 {

	@Override
	public void m1() {
		System.out.println("Overriding m1() method of interface IT1");
		m2();
		m3();
		m4();

	}

	@Override
	public void m2() {
		System.out.println("Overriding m2() method of interface IT1");
	}

	@Override
	public void m3() {
		System.out.println("Overriding m3() method of interface IT1");
	}

	public void m4() {
		System.out.println("m4() Instance method declared inside class Interface_Example1");
	}

	public static void main(String[] args) {

		new Interface_Example1().m1();

	}

}