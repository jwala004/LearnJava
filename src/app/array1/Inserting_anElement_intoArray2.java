package app.array1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Inserting_anElement_into Integer Array
public class Inserting_anElement_intoArray2 {

	public static void main(String[] args) {

		Integer[] a= {1,2,3,4,5};
		List<Integer> l=new ArrayList<Integer>(Arrays.asList(a));
		l.add(1);
		l.add(8);
		l.add(2, 22);
		l.add(3, 33);
		System.out.print("1st "+l);
		
		for(Integer ii: l) {
			
			System.out.print(" "+ii);
		}
	}

}
