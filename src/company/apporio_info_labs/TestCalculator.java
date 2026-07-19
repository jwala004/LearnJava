package company.apporio_info_labs;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {

		while (true) {

			Calculator_Build cc = new Calculator_Build();

			Scanner sc = new Scanner(System.in);
			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			int a3 = sc.nextInt();
			int a4 = sc.nextInt();
			int a5 = sc.nextInt();

			cc.addNumbers(a1, a2, a3, a4, a5);
			cc.substractNumbers(a1, a2, a3, a4, a5);
			cc.multiplyNumbers(a1, a2, a3, a4, a5);
			cc.divideNumbers(a1, a2, a3, a4, a5);
		}

	}

}
