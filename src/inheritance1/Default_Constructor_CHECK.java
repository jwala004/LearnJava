package coom.app.inheritance1;

class PP {

}

public class Default_Constructor_CHECK extends PP {

	public Default_Constructor_CHECK() {
		super();
		System.out.println("Child class Constructor");
	}

	public static void main(String[] args) {

		new Default_Constructor_CHECK();
	}

}
