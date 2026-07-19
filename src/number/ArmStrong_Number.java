package number;

public class ArmStrong_Number {

	public static void main(String[] args) {

		int num = 370;

		int temp = num;
//we did all calculations on our temp variable and kept our originalNumber num=371, as it is.
		int remainder;
		int result = 0;

		while (temp != 0) {
			remainder = temp % 10;
			result = ((remainder * remainder * remainder) + result);
			temp = temp / 10;

		}
//		System.out.println(result);
		if (result == num) {

			System.out.println(num + " is an ArmStrong Number");
		} else {
			System.out.println(num + " is not an ArmStrong Number");
		}

	}

}
