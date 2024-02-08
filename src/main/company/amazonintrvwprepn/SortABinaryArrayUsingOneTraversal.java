package company.amazonintrvwprepn;

public class SortABinaryArrayUsingOneTraversal {
	/*
	 * Sort a binary array using one traversal
	 * 
	 * Given a binary array, sort it using one traversal and no extra space.
	 * 
	 * Examples :
	 * 
	 * Input : 1 0 0 1 0 1 0 1 1 1 1 1 1 0 0 1 1 0 1 0 0
	 * 
	 * Output : 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1
	 * 
	 * Explanation: The output is a sorted array of 0 and 1
	 * 
	 * Input : 1 0 1 0 1 0 1 0
	 * 
	 * Output : 0 0 0 0 1 1 1 1
	 * 
	 * Explanation: The output is a sorted array of 0 and 1
	 */

	/*
	 * Approach: This concept is related to partition of quick sort . In quick sort’
	 * partition, after one scan, the left of the array is smallest and right of the
	 * array is the largest of selected pivot element.
	 * 
	 * Algorithm:
	 * 
	 * 1. Create a variable index index = 0
	 * 
	 * 2. Traverse the array from start to end
	 * 
	 * 3.If the element is 0 then swap the current element with the element at index
	 * position and increment the index by 1.
	 * 
	 * 4.If the element is 1 keep the element as it is.
	 */
	public static void main(String[] args) {

		int a[] = { 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0 };

		int n = a.length;

		sortBinaryArray(a, n);

		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}

	private static void sortBinaryArray(int a[], int n) {
		int j = -1;
		for (int i = 0; i < n; i++) {

			// if number is smaller than 1
			// then swap it with j-th number
			if (a[i] < 1) {
				j++;
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}
	}

	/*
	 * Complexity Analysis:
	 * 
	 * Time Complexity: O(n) Only one traversal of the array is needed, So time
	 * Complexity is O(n).
	 * 
	 * Space Complexity: O(1) The space required is constant.
	 */
}
