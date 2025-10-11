package java8.naveenautomationlabs.collectionntutrl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcepts {

	public static void main(String[] args) {

		Set<String> hs = new HashSet<String>();
		hs.add("Alpha");
		hs.add("Beta");
		hs.add("Alpha");
		hs.add("testing");
		hs.add(null);
		hs.add("Alpha");

//		Print HashMap
		System.out.println(hs);

//		Check element is present in HashMap or not
		System.out.println(hs.contains("testing"));

//		Iterate throgh HashMap
		for (String e : hs) {
			System.out.print(e + " ");
		}

		System.out.println();
		
//		Iterate using Iterator through HashMap
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
		System.out.println();

//		Remove an element from Iterator
		hs.remove("Beta");
		System.out.println(hs);

//		Union of two sets
		Set<Integer> hs1 = new HashSet<Integer>();
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		hs1.add(12);

		Set<Integer> hs2 = new HashSet<Integer>();
		hs2.add(11);
		hs2.add(2);
		hs2.add(33);
		hs2.add(4);
		hs2.add(12);

//		Now adding hashet1 and hashset2
		Set<Integer> union = new HashSet<Integer>(hs1);
		union.addAll(hs2);

		System.out.println(union);

		System.out.println("================================================");

//		Intersection of two sets
		Set<Integer> intersection = new HashSet<Integer>(hs1);
		intersection.retainAll(hs2);

		System.out.println(intersection);

		System.out.println("================================================");

//		Get the diffrences between two 2 sets
		Set<Integer> diff = new HashSet<Integer>(hs1);
		diff.removeAll(hs2);
		System.out.println(diff);

	}

}
