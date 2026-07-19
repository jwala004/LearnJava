package number;

public class Factorial_of_A_Number_Using_Recursion {

	public static void main(String[] args) {

		int num = 5;

//		System.out.println("Factorial of " + num + " is " +calculateFactorial(num));
		// or write the logic in below manner

		int result = calculateFactorial(num);
		System.out.println("Factorial of " + num + " is " + result);

	}

	public static int calculateFactorial(int num) {

		if (num == 1)

			return 1;

		return num * calculateFactorial(num - 1);

	}

}
