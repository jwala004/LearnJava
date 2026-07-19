package com.app.loop;

public class Infinity_Loop_Check_2 {

	public static void main(String[] args) {

		for (int i = 0; true; i++) {
			System.out.println("Hello");
		}
//		System.out.println("Hello"); // if we will uncomment this line, then this program/application will throw an unreachable code error.
	}

}