package java8.oops.methodoverriding;

public class ChildClass extends MethodOverriding {

	public void run() {
		System.out.println("run child");
	}
	
	public static void main(String[] args) {
		new ChildClass().run();
	}

}
