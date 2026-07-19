package com.java.learn;

class ABC {

	public static void m1() {

		System.out.println("Hellooo");
	}
}

public class StaticMethodOveridingCheck extends ABC {

	public static void m1() {

		System.out.println("Hi");
	}

	public static void main(String[] args) {

		StaticMethodOveridingCheck staticMethodOveridingCheck  = new StaticMethodOveridingCheck(); // here creating the object of child class
//		staticMethodOveridingCheck.m1();
		
		ABC abc = new ABC(); // here creating the object of parent class
//		abc.m1();
		
		ABC parentRefrenceVarible = new StaticMethodOveridingCheck(); // parent classs refrence variable holding the object of child class
		parentRefrenceVarible.m1();
		
//		StaticMethodOveridingCheck childtRefrenceVarible  = new ABC(); 
//		childtRefrenceVarible.m1();
// child class refrence variable can't hold the object of parent class	
		
		
		
		
	}

}
