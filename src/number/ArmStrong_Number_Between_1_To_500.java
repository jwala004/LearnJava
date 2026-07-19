package number;

public class ArmStrong_Number_Between_1_To_500 {

	public static void main(String[] args) {

		System.out.println("ArmStrong Number's between 1 to 500 are : ");

		for (int temp = 1; temp < 500; temp++) {

			int remainder;
			int result = 0;
			int temp1 = temp;
			while (temp1 != 0) {
				remainder = temp1 % 10;
				result = ((remainder * remainder * remainder) + result);
				temp1 = temp1 / 10;

			}
			if (result == temp) {

				System.out.print(result + " ");
			}
		}

	}
}
