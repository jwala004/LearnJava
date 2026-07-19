package app.array;

public class Largest_AndSmallestelmtFrmArray {

	public static void main(String[] args) {
		int[] a = { 11, 3, 1, 33, 12, 111, 2, 111, 11, 2, 9999, 12, 2222, 3333, 444, 232, 4544, 6666, 777 };
		int temp1 = a[0], temp2 = a[0];

		for (int i = 1; i < a.length; i++) {
			if (temp1 < a[i]) {
				temp1 = a[i];
			}
			/*
			 * if(temp2>a[i]) { temp2=a[i]; }
			 */

		}
		System.out.println("Largest element of the array: " + temp1);

		System.out.println("Smallest element of the array: " + temp2);

	}
}
