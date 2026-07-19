package number;

//M-2 using inbuilt function called (Math.pow)

public class ArmStrong_Number_2 {

	public static void main(String[] args) {

		int num = 371;

		int temp = num;
//we did all calculations on our temp variable and kept our originalNumber num=371, as it is.
		int remainder;
		double result = 0;

		while (temp != 0) {
			remainder = temp % 10;
			result = result + Math.pow(remainder, 3);
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
