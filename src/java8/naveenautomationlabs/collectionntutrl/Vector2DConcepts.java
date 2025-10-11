package java8.naveenautomationlabs.collectionntutrl;

import java.util.Iterator;
import java.util.Vector;

public class Vector2DConcepts {

	/*
	 * How to create a 2D Vector?
	 * 
	 * 2D Vector is a Vector of vector. means a vector inside another vector.
	 * 
	 */
	public static void main(String[] args) {

		Vector<Integer> myVector = new Vector<Integer>();
		myVector.add(20);
		myVector.add(21);
		myVector.add(22);
		myVector.add(23);

		Vector<Integer> newVector = new Vector<Integer>();
		newVector.addAll(myVector);

		for (int i = 0; i < myVector.size(); i++) {
			int it = (int) (newVector.get(i));
			System.out.println(it);
		}

	}

}
