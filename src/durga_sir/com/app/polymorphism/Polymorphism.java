package com.app.polymorphism;

class Test {
	public void m1() {
		System.out.println("Base class");
	}
}

public class Polymorphism extends Test {

	public void m1() {
		System.out.println("Derived class");
	}

	public static void main(String[] args) {

		Polymorphism p = new Polymorphism();
		p.m1();
	}

}
