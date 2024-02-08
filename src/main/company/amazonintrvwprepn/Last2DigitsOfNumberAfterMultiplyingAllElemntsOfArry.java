package company.amazonintrvwprepn;

public class Last2DigitsOfNumberAfterMultiplyingAllElemntsOfArry {

	/*
	 * Find last k digits in product of an array numbers
	 */

	/*
	*/
	// Returns last k digits in product of a[]
	static int lastKDigits(int a[], int n, int k) {
		int num = (int) (Math.pow(10, k));

		// Multiplying array elements
		// under modulo 10^k.
		int mul = a[0] % num;

		for (int i = 1; i < n; i++) {
			a[i] = a[i] % num;
			mul = (a[i] * mul) % num;
		}
		return mul;
	}

//	M2
	public static int process(int array[]) {
		if (array.length <= 0) {
			System.out.println("-1");
			return 0;
		}
		
		int answer = array[0] % 100;

		for (int i = 1; i < array.length; i++) {
			if (answer == 0) {
				break;
			}
			answer = (answer * array[i] % 100) % 100;
		}
		
		return answer;
	}

// Driven program
	public static void main(String args[]) {
		int a[] = { 22, 31, 44, 27, 37, 43, 22, 11 };
		int k = 2;
		int n = a.length;

//		System.out.println(lastKDigits(a, n, k));
		
		System.out.println(Last2DigitsOfNumberAfterMultiplyingAllElemntsOfArry.process(a));
	}

}
