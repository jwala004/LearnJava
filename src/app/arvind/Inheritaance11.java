package app.arvind;

class A {
	protected static String name = "sue";
	static String s;
	static String arvind;
	static String arvindd = "Arvind java boy";

}

class B extends A {
	static String m = "this is";
	
}

class Inheritaance11 {

	public static void main(String[] args) {
		System.out.println(A.name);// sue
		System.out.println(A.s);// null
		System.out.println(A.arvind);// null
		System.out.println(A.arvindd);// Arvind java boy
	}

}
