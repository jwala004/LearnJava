package app.new_collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArryList {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList();
		al.add("jwala1");
		al.add("jwala2");
		al.add("jwala7");
		al.add("jwala8");
		al.add("jwala3");
		al.add("jwala4");
		al.add("jwala9");
		al.add("jwala5");
		al.add("jwala6");
		
		System.out.println("Before sorting: "+al);
		
		Collections.sort(al);
		
		System.out.println("After sorting: "+al);
	}
}
