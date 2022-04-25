package java8.naveenautomationlabs.nnumbrss;

public class FibonacciSeries {

	public static void main(String[] args) {

//		FibonacciSeries.calculateFibonacci(10);
		
		int a = 2, b = 4;
		
		int c = 0;
		
		c = a;
		a = b;
		b = c;
		
		System.out.println(a +" "+b);
		
		
	}

	/*
	 * M1:
	 * 
	 * Using for loop Display Fibonacci Series Using for Loop
	 */
	private static void calculateFibonacci(int n) {

		int firstNum = 0;
		int secondNum = 1;

		for (int i = 0; i <= n; i++) {

			System.out.print(firstNum + " ");

			int nextNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = nextNum;

		}

	}

	/*
	 * M2:
	 * 
	 * Display Fibonacci series using while loop
	 */
	
	
}
