package app.variable;

public class Variable {
	int a =10;
	int b=12;
	static int c=122;
	int d;
	float f;
	char c1;
	boolean b1;
	
	void dispA() {
	System.out.println(a);
	System.out.println(b);
	System.out.println(Variable.c);
	System.out.println(d);
	System.out.println(f);
	System.out.println(c1);
	System.out.println(b1);
		}
		public static void main(String[] args) {
		Variable v=new Variable();
		v.dispA();
		System.out.println(Variable.c);
		System.out.println(v.c);
		System.out.println(c);
		
	}
}
