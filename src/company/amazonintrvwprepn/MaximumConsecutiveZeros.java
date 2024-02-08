package company.amazonintrvwprepn;

public class MaximumConsecutiveZeros {

	/*
	 * Maximum consecutive one’s (or zeros) in a binary array
	 * 
	 * A Binary Array is a combination of 0's and 1's
	 * 
	 * Input : arr[] = {1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1}
	 * 
	 * Output : 3
	 * 
	 * Input : arr[] = {0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1}
	 * 
	 * Output : 2
	 */
	public static void main(String[] args) {

		int arr[] = {1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1};

		int n = arr.length;

		System.out.println(MaximumConsecutiveZeros.getMaxLength(arr, n));

	}

	// Returns count of maximum consecutive 1's in binary array arr[0..n-1]
	private static int getMaxLength(int arr[], int n) {

		int count = 0; // initialize count
		int result = 0; // initialize max

		for (int i = 0; i < n; i++) {

			// Increase count when 0 is found
			if (arr[i] == 0) {
				count++;
				result = Math.max(result, count);

				// If 1 is found, set count as 0
			} else {
				count = 0;// increase count
			}
		}

		return result;
	}
}
