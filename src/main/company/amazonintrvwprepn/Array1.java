package company.amazonintrvwprepn;

public class Array1 {

	/*
	 * Given an array with numbers 1-5, how would you subtract one number from each
	 * index?
	 */
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };

		Array1.substractNum(arr1);

	}

	private static void substractNum(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] - 1 + " ");
		}

	}

}
