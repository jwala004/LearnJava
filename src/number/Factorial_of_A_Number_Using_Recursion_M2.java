package number;

public class Factorial_of_A_Number_Using_Recursion_M2 {

	static int result = 1;

	// or declare the variable inside main method, both the things are same
	public static void main(String[] args) {

		int num = 5;

		System.out.println("Factorial of " + num + " is " + calculateFactorial(num));

	}

	public static int calculateFactorial(int num) {

		if (num > 1) {

			result = num * result;

			calculateFactorial(num - 1);

		}

		return result;

	}

}
