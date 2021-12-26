package com.java8.anonyms.innerclass;

public class TestRunner {

	public static void main(String[] args) {

		IPrintable ip = new IPrintable() {

			@Override
			public void print() {
				System.out.println("ANONYMS INNER CLASS");
			}
		};
		ip.print();
	}

}
