package java8.naveenautomationlabs.listtt;

import java.util.Arrays;
import java.util.List;

public class MiddleElementOfList {

	static public  void main(String[] args) {

		int[] arr = { 1, 2, 3, 421, 5, 6, 7 };

		String[] strArr = { "jwala", "sonu", "monu", "aatu", "tar", "saout", "te" };

//		Using integer array
		List<int[]> lst = Arrays.asList(arr);

		for (int[] arrList : lst) {
			System.out.println("Middle Element of Integer List: " + arrList[arrList.length / 2]);
		}

//		Utilising just only list 
		List<String> strLst = Arrays.asList(strArr);
		
		System.out.println("Middle Element of String array: " +strLst.get(strLst.size()/2));

	}

}
