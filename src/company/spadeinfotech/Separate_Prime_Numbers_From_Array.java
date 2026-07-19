package company.spadeinfotech;

public class Separate_Prime_Numbers_From_Array {

	public static void main(String[] args) {

		int[] aa = { 2, 4, 7, 8, 4, 6, 20, 44, 11, 25 };

		int index = 0;
		for (int i = 0; i <= aa.length - 1; i++) {
			int count = 0;
			for (int j = 1; j <= aa[i]; j++) {

				if (aa[i] % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				index++;
			}
		}
		System.out.println("Total prime numbers : " + index);
	}

}
