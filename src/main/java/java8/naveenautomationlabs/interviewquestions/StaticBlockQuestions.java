package java8.naveenautomationlabs.interviewquestions;

public class StaticBlockQuestions {

	/*
	 * Static block interview questions 
	 * 1. Explain static block in java. 
	 * 2. How can we run a java program without making any object?
	 * 3. Similarity and Diffrence between static block and static method. 
	 * 4. How can we create the objects if we make the constructor private? 
	 * 5. Is it possible to compile and run a Java program without writing main() method?
	 * 6. Can we initialize member variables within static block?
	 */
	
//	1. Explain static block in java.
//	Static block can be declared anywhere in the Java program. 
//	Static block gets executed even before the main() method.
	
	static int num1;
	
	static {
		num1 = 110;
		System.out.println("static block 1" +" "+num1);
	}
	
	static {
		num1 = 100;
		System.out.println("static block 2"+" "+num1);
	}
	
	static {
		System.out.println("static block 3");
	}
	
	static {
		num1 = 1100;
		System.out.println("static block 4"+" "+num1);
	}
	
//	2. How can we run a java program without making any object?
//	we can write the code in static block or static method
	
	static {
		System.out.println("static block test");
	}
	
	public static void staticFuncion() {
		System.out.println("static funcion");
	}
	
// 3. Similarity and Diffrence between static block and static method. 
// 1. static keyword is required to declare both of them.
// 2. static block gets executed even before the main method, doesn't require explicit calling, but for static methods,
//	we need to call them explicitly.
	
//	4. How can we create the objects if we make the constructor private? 
//	When we declare the constructor as private, then we cann't instance of that class, outside of that class. But
//	within that class we can create instance.
//	So to create the instance of private constructor class, declare a static method or static block, and then inside
//	the method or block instantiate the class, and then call this method or block in the class where it is needed.
	
//	5. Is it possible to compile and run a Java program without writing main() method?
//	No, after java5 it is not possible to run a java program without using main() method.
	
//	6. Can we initialize member variables within static block?
//	yes, we can. 1. we just need to declare to variables as static  
//	2. create the instance of class and then using instance of class we can do it
	
	public static void main(String[] args) {
		System.out.println("Main method...");

//		we need to explicitly call static method, it doesn't get called automatically
		StaticBlockQuestions.staticFuncion();
		
//		Private constructor
		int ii = PrivateConstructor.createInstance();
		System.out.println("PrivateConstructor.createInstance() : "+ii);
		
	}
	

}
