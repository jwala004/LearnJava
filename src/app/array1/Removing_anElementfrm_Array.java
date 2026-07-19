package app.array1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Removing_anElementfrm Integer Array

public class Removing_anElementfrm_Array {

	public static void main(String[] args) {

		Integer[] a= {1,2,3,4,5};
		List<Integer> l=new ArrayList<Integer>(Arrays.asList(a));
		
		System.out.print("Before removing element from Array "+l);
		
		l.remove(1);
		
		System.out.print("After removing element from Array  "+l);
	}

}
