package coom.app.inheritance1;

class This {
	int a = 10;
	int b = 20;
}

public class This_and_Super_KeywordCheck extends This {
	int a = 100;
	int b = 200;

	void m1(int a, int b) {
		
		System.out.println("Local variable: "+(a + b));
		System.out.println("child class Instance variable: "+(this.a + this.b));
		System.out.println("Parent class Instance variable: "+(super.a + super.b));
	}

	public static void main(String[] args) {

		This_and_Super_KeywordCheck aa = new This_and_Super_KeywordCheck();
		aa.m1(1000, 2000);

	}

}
