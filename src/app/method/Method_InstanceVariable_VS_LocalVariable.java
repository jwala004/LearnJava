package app.method;

public class Method_InstanceVariable_VS_LocalVariable {
int a=100;
int b=200;

	void m1(int a,int b) {
		System.out.println("Sum of Instance Variables: "+(this.a+this.b));//accessing instance variables using this keyword
		System.out.println("Sum of Local Variables: "+(a+b));
	}

	static void m2() {
		System.out.println("m2 method");
	}

	public static void main(String[] args) {
	
		Method_InstanceVariable_VS_LocalVariable m=new Method_InstanceVariable_VS_LocalVariable();
		m.m1(1000,2000);
		Method_InstanceVariable_VS_LocalVariable.m2();
	}
}
