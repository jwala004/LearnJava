package company.apporio_info_labs;

public class ARRAY_INT_and_CHAR {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };

		char[] c = { 'a', 'b', 'c', 'd', 'e' };

		int j = 0;

		for (int i = a.length - 1; i >= 0; i--) {

			if (j < c.length) {
				System.out.print(a[i] + "" + c[j]);
//				+", "
				System.out.print(", ");

			}
			
			j++;
		}

	}
}