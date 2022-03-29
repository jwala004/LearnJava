package java8.naveenautomationlabs.interviewquestions;

public class MaxAndMinNumber {

	int num1 = 10;
	int num2 = 20;
	int num3 = 30;

	/*
	 * Print Hello World Without Static Block and Blank Main Method Body
	 */

	public static void main(String[] args) {

//		returnNum(1111, 11, 111);

	}

	private static int returnNum(int num1, int num2, int num3) {

		int temp = 1;

		if (num1 >= num2 && num1 >= num3) {
//			temp = num1;
			System.out.println(num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2);
		} else if (num3 >= num1 && num3 >= num2)
			System.out.println(num3);
		{

		}
		return 1;
	}

}
