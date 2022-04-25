package java8.naveenautomationlabs.nnumbrss;

public class MissingArrayNumber {

	public static void main(String[] args) {

		/*
		 * Find out the missing number in an integer array
		 * 
		 */
		int[] arr = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };

		int missingNum = returnMissingNumber(arr, arr.length + 1);

		System.out.println(missingNum);
	}

	private static int returnMissingNumber(int[] arr, int arrayLength) {

		int totalCount = (arr.length + 1);

		int sumOfAllNumbers = totalCount * ((totalCount + 1)) / 2; // sum of all continous natural numbers -> n(n+1)/2

		int sumOfActualArray = 0;

		for (int num : arr) {
			sumOfActualArray += num;
		}

		int missingNum = sumOfAllNumbers - sumOfActualArray;

		return missingNum;

	}
}
