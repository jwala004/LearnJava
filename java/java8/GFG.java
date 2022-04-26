package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class GFG {

//	static void removeDups(int[] a, int n) {
//
//		// Hash map which will store the
//		// elements which has appeared previously.
//		HashMap<Integer, Boolean> mp = new HashMap<>();
//
//		for (int i = 0; i < n; ++i) {
//
//			// Print the element if it is not
//			// present there in the hash map
//			// and Insert the element in the hash map
//			if (mp.get(a[i]) == null) {
//				System.out.print(a[i] + " ");
//				mp.put(a[i], true);
//			}
//		}
//	}
//
//	// Driver Code
//	public static void main(String[] args) {
//		int[] arr = { 1, 2, 5, 1, 7, 2, 4, 2 };
//
//		int n = arr.length;
//		removeDups(arr, n);
//	}

//	M2

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 5, 1, 7, 2, 4, 2, 4, 4 };

		HashMap<Integer, Boolean> mp = new HashMap<>();

//		M1
//		for (int i = 0; i < arr.length; ++i) {
//
//			if (mp.get(arr[i]) == null) {
//				System.out.print(arr[i] + " ");
//				mp.put(arr[i], true);
//			}
//
//		}

//		M2

//		for (int i = 0; i < arr.length; ++i) {
//
//			if (!mp.containsKey(arr[i])) {
//				System.out.print(arr[i] + " ");
//				mp.put(arr[i], true);
//			}
//
//		}
		
//		M3
		List<int[]> lst = new ArrayList<>();
		lst = Arrays.asList(arr);
		

	}

}