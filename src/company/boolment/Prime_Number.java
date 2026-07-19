package company.boolment;

public class Prime_Number {

	public static void main(String[] args) {

		int num = 72;
		int counter = 0;
		for (int i = 1; i <= num; i++) { // I did mistake in putting condition

			if (num % i == 0) {
				counter++;
			}
		}

		if (counter == 2) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}

}
