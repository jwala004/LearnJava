package ajit;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

class Vector_Accessing {

	public static void main(String[] args) {

//	List<Integer> l=new Vector<Integer>();
		Vector l = new Vector();

		l.add("AJIT");
		l.add(1111);
		l.add(10.7f);
		l.add(true);
		l.add(22);

//       Enumeration cursor is valid only on legacy classes.

		Enumeration ee = l.elements();

		while (ee.hasMoreElements()) {
			System.out.println(ee.nextElement());
		}

	}
}
