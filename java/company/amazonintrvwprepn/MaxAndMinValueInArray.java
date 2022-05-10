package company.amazonintrvwprepn;

public class MaxAndMinValueInArray {

	public static void main(String[] args) {

		int[] arr = { 11, 3, 2, 34, 23, 21, 55, 20, 5 };

		MaxAndMinValueInArray.findMaxAndMinValues(arr);

	}

	private static void findMaxAndMinValues(int[] myArray) {
		int minimum = myArray[0];
		int maximum = myArray[0];

		for (int value : myArray) {
			minimum = (value < minimum) ? value : minimum;
			maximum = (value > maximum) ? value : maximum;
		}

		System.out.println("The minimum value is " + minimum + ".");
		System.out.println("The maximum value is " + maximum + ".");

	}

}
