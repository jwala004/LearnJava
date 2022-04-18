package java8.naveenautomationlabs.collectionntutrl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromArrayList {

	public static void main(String[] args) {

		int arry[] = { 1, 23, 1, 3, 3, 2, 3, 2, 12, 67, 23, 12, 34, 9 };

//		Using LinkedHashSet
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 23, 1, 3, 3, 2, 3, 2, 12, 67, 23, 12, 34, 9));

		LinkedHashSet<Integer> lnkHashSet = new LinkedHashSet<Integer>(list);

		ArrayList<Integer> uniqueElementsList = new ArrayList<Integer>(lnkHashSet);

		System.out.println(uniqueElementsList);

//		Using JDK 8 streams
		int[] arry2 = { 1, 23, 1, 3, 3, 2, 3, 2, 12, 67, 23, 12, 34, 9 };

		ArrayList<Integer> arrList = new ArrayList<Integer>(
				Arrays.asList(1, 23, 1, 3, 3, 2, 3, 2, 12, 67, 23, 12, 34, 9));
		List<Integer> uniqList = arrList.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqList);

//		M3 
		ArrayList<Integer> arrList3 = new ArrayList<Integer>(
				Arrays.asList(1, 23, 1, 3, 3, 2, 3, 2, 12, 67, 23, 12, 34, 9));
		Collection<Integer> set = new HashSet<>(arrList3);
		arrList3.clear();
		arrList3.addAll(set);
		System.out.println(set);

//		M4
		ArrayList<Integer> myLst = new ArrayList<Integer>(
				Arrays.asList(1, 23, 1, 3, 3, 2, 3, 2, 12, 67, 23, 12, 34, 9));
		myLst = new ArrayList<Integer>(new HashSet<Integer>(myLst));
		System.out.println(myLst);

	}

}
