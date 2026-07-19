package _comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee(111,"jwala1","jk@gmail.com1","89891"));
		al.add(new Employee(112,"jwala1","jk@gmail.com2","89892"));
		al.add(new Employee(112,"jwala6","jk@gmail.com1","89891"));
		al.add(new Employee(113,"jwala7","jk@gmail.com3","89898"));
		al.add(new Employee(114,"jwala8","jk@gmail.com4","89896"));
		al.add(new Employee(116,"jwala9","jk@gmail.com5","89897"));
		al.add(new Employee(115,"jwala2","jk@gmail.com9","89892"));
		al.add(new Employee(118,"jwala3","jk@gmail.com8","89893"));
		al.add(new Employee(114,"jwala4","jk@gmail.com7","89894"));
		al.add(new Employee(119,"jwala5","jk@gmail.com6","89895"));

		Collections.sort(al);
		
		
		
		Iterator<Employee> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	    /*for(Employee e: al) {
	    System.out.println(e.id+" "+e.name+" "+e.email+" "+e.mobile);
	    }*/
	}
}
