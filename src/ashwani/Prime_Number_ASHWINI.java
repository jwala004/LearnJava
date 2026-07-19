package ashwani;

public class Prime_Number_ASHWINI {

	public static void main(String[] args) {
		int i;
		int num = 7;
		
		System.out.println(num + " Number is Prime");
		
		for (i = 2; i < num / 2; i++) {
			
			if (num % i == 0) {
				break;
			
			}
		}

		if (i == num / 2) {
			System.out.println(num + " Number is Prime");

		} else {
			System.out.println(num + " Number is not Prime");

		}

	}

}
