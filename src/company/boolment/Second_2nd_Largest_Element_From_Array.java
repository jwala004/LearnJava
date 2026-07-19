package company.boolment;

public class Second_2nd_Largest_Element_From_Array {

	public static void main(String[] args) {

		int[] a = { 1, 22, 32, 41, 121, 56, 34, 78 ,6767};
		int temp = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {

					temp = a[i];
					a[j] = temp;
//					temp = a[i];
				}
			}
		}

		for (Integer ii : a) {

			System.out.print(ii + " ");
		}
//		System.out.println("2nd largest element : " + a[4]);
	}

}
