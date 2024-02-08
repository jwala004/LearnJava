package java8.oops.methodoverloading;

public class FunWithDiffReturnType {

	/*
	 * What will happen if we will declare 2 function with same name, but diffrent
	 * return type?
	 * 
	 * Method overloading example
	 * 
	 * The function you will call, and based on the argument passed that function
	 * will be executed.
	 * 
	 */
	public static void main(String[] args) {

		FunWithDiffReturnType diffReturnType = new FunWithDiffReturnType();
//		System.out.println(diffReturnType.fun(1, 1));

		System.out.println(diffReturnType.fun("jwala", " kumar"));

	}

	private int fun(int num1, int num2) {
		int num3 = num1 + num2;
		return num3;
	}

	private String fun(String str1, String str2) {
		String finalString = str1 + str2;
		return finalString;
	}

}
