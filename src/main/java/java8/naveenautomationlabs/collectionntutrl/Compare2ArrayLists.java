package java8.naveenautomationlabs.collectionntutrl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Compare2ArrayLists {

	public static void main(String[] args) {

//		1st sort() and then equals
		ArrayList<String> arrList1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

		ArrayList<String> arrList2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));

		ArrayList<String> arrList3 = new ArrayList<String>(Arrays.asList("B", "A", "C", "D", "E"));

		Collections.sort(arrList1);
		Collections.sort(arrList2);

		System.out.println(arrList1.equals(arrList2));// false
		System.out.println(arrList1.equals(arrList3));// false, because arrList3 is sorted not here, comaparision
														// happens
//		index wise

		Collections.sort(arrList3);
		System.out.println(arrList1.equals(arrList3));// true

//		Compare two list, find out the additional elements
		ArrayList<String> arrList4 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

		ArrayList<String> arrList5 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));

		arrList4.removeAll(arrList5);
		System.out.println(arrList4);// E

		ArrayList<String> arrList44 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

		ArrayList<String> arrList55 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));

		arrList55.removeAll(arrList44);
		System.out.println(arrList55);// F

//		Find out the common elements
		ArrayList<String> arrList6 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

		ArrayList<String> arrList7 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));

		arrList6.retainAll(arrList7);
		System.out.println(arrList6);// "A", "B", "C", "D"

	}

}
