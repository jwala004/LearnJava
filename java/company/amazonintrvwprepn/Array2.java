package company.amazonintrvwprepn;

public class Array2 {

	/*
	 * Given an array with numbers 1-5, how would you subtract one number from every
	 * EVEN number in each index?
	 */
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };

		Array2.substractOne(arr1);

	}

	private static void substractOne(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] - 1 + " ");
			}else {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
