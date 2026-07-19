package number;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddNumbers_Between_2_Numbers_USING_Method {

	public static List<Integer> OddNumbersBetweenTwoIntervals(int a, int b) {

		List<Integer> list = new ArrayList<Integer>();

		while (a < b) {
//		the line above and line below will give the same result
// 		while(a!b ){
			if (a % 2 == 0) {

			} else if (a == 1) {

			} else {
				System.out.print(a+" ");
			}
			a++;
		}
		return list;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st number");
		int a = sc.nextInt();

		System.out.println("Enter 2nd number");
		int b = sc.nextInt();

		System.out.println("Odd numbers between a and b is: ");
		OddNumbers_Between_2_Numbers_USING_Method.OddNumbersBetweenTwoIntervals(a, b);
	}
}

// M-2 to with some modifications in above code

//public static List<Integer> OddNumbersBetweenTwoIntervals(int a, int b) {
//
//	List<Integer> list = new ArrayList<Integer>();
//
//	while (a < b) {
////	the line above and line below will give the same result
////		while(a!b ){
//		if (a % 2 == 0) {
//
//		} else if (a == 1) {
//
//		} else {
//			list.add(a);
//		}
//		a++;
//	}
//	List<Integer> l = list;
//	System.out.print(l);
//	return l;
//}
//
//public static void main(String[] args) {
//
//	Scanner sc = new Scanner(System.in);
//
//	System.out.println("Enter 1st number");
//	int a = sc.nextInt();
//
//	System.out.println("Enter 2nd number");
//	int b = sc.nextInt();
//
//	System.out.println("Odd numbers between a and b is: ");
//	OddNumbers_Between_2_Numbers_USING_Method.OddNumbersBetweenTwoIntervals(a, b);
//}
//}

