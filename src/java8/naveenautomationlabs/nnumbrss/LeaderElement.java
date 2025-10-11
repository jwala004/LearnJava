package java8.naveenautomationlabs.nnumbrss;

public class LeaderElement {

	/*
	 * How To Find All The Leaders In An Integer Array?
	 * 
	 * Selecting/Choosing any element all the elements right to it should be less
	 * than it.
	 * 
	 * The last element in the array is always leader element.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int[] num = { 92, 7, 7, 34, 23, 7, 9, 3 };
		findLeaders(num);

	}

	private static void findLeaders(int num[]) {

		if (num.length == 0) {
			return;
		}

		if (num.length == 1) {
			System.out.println(num[0]);
			return;
		}

		int max = num[num.length - 1];
		System.out.print(max + " ");

		for (int i = num.length - 2; i >= 0; i--) {

			if (num[i] > max) {
				System.out.print(num[i] + " ");
				max = num[i];
			}
		}

	}

}
