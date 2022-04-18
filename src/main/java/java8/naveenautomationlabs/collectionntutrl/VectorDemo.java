package java8.naveenautomationlabs.collectionntutrl;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> myVector = new Vector<Integer>();
		myVector.add(2);
		myVector.add(12);
		myVector.add(22);
		myVector.add(23);
		myVector.add(24);
		myVector.add(25);
		myVector.add(212);

//		Print vector
		System.out.println(myVector);

//		Get vector element using index
		System.out.println(myVector.get(2)); // 22

//		Remove vector element using index
		System.out.println(myVector.remove(2)); // 22 should be removed now

//		Now let's print the vector and check 22 is present or not
		System.out.println(myVector);

//		Add 2 vectors
		Vector<Integer> yourVector = new Vector<Integer>();
		yourVector.add(32);
		yourVector.add(33);

		myVector.addAll(yourVector);

//		Now let's print the vector and check elements of yourVector got added into myVector or not
		System.out.println(myVector);

//		Print the vector using enhanced for loop
		for (Integer i : myVector) {
			System.out.println(i);
		}

//		Print the vector using iterator
		Iterator<Integer> itr = myVector.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
