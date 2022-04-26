package com.intrvw.instanceblock;

public class InstanceBlock {

	private InstanceBlock() {
		System.out.println("O argument constructor");
	}

	private InstanceBlock(int num1) {
		System.out.println("1 argument constructor");
	}

	{
		System.out.println("Instance Block 1");
	}

	public static void main(String[] args) {

		InstanceBlock instanceBlock = new InstanceBlock();

	}

}
