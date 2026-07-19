package number;

//What is a Prime Number?
//A prime number is a number that is only divisible by 1 or itself. For example, 11 is only divisible by 1 or itself. Other Prime numbers 2, 3, 5, 7, 11, 13, 17....

//Note: 0 and 1 are not prime numbers. 2 is the only even prime number.

//M-2 to find Prime number

public class Prime_Number_2 {

	public static void main(String[] args) {

		int num = 2;
		int temp = 0;
		for (int i = 2; i <= num - 1; i++) {

			if (num % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp == 0 && num != 1 && num != 0) {
			System.out.println(num + " is a Prime Number");
		} else {
			System.out.println(num + " is not a Prime Number");
		}
	}

}
