package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SecondLargestElement {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 5, 6, 7, 8, 1, 6, 8, 12, 14 };

		char[] charArr = { 'a', 'z', 'x', 'c', 'l', 'k', 'b', 'r', 't' };

//		sort integer array
		Arrays.sort(arr);

		for (int num : arr) {
//			System.out.print(num +", ");
		}

//		System.out.println("\n" + "2nd Largest number: "+arr[(arr.length - 2)]);

//		sort char array
		Arrays.sort(charArr);

//		Print char array after sorting
		for (char ch : charArr) {
//			System.out.print(ch +", ");
		}

	}

}
