package java8;

public class PaytmArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 1, 5, 6 };

		PaytmArray.missingNumAndReplaceDuUplicate(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static int[] missingNumAndReplaceDuUplicate(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == 1) {
//				Replace the value at 3rd index
				arr[i] = 4;
			}
		}
		return arr;

	}

}
