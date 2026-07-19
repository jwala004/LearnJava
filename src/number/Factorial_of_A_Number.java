package number;

public class Factorial_of_A_Number {

	public static void main(String[] args) {
		int p = 1;
		for (int i = 5; i >= 1; i--) {

			p = p * i;
			System.out.println(p);
		}
		System.out.println("Factorial of 5 is : "+p);
	}

}
