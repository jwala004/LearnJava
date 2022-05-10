package company.amazonintrvwprepn;

public class LargestSumFromContigiousSubArray {

	public static void main(String[] args) {
		int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int n = arr.length;

		System.out.println("Maximum Sum of the Sub-array is: " + LargestSumFromContigiousSubArray.maxSum(arr, n));
	}

	private static int maxSum(int arr[], int n) {
		int tempMax = arr[0];
		int currentMax = tempMax;
		for (int i = 1; i < n; i++) { // find the max value
			currentMax = Math.max(arr[i], currentMax + arr[i]);
			tempMax = Math.max(tempMax, currentMax);
		}
		return tempMax;
	}
}
