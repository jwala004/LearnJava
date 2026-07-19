package ajit;

import java.util.ArrayList;
import java.util.List;

public class ListImterface_Challenge {

	public static void main(String[] args) {

		List<Student> l = new ArrayList<Student>();
		l.add(new Student(123, "Ajit"));
		l.add(new Student(124, "Jwala"));
		l.add(new Student(125, "Arvind"));

		List<Address> l1 = new ArrayList<Address>();
		l1.add(new Address(1, "Sec-22"));
		l1.add(new Address(2, "Sec-62"));
		l1.add(new Address(3, "Sec-15"));

		for (Student s : l) {
			System.out.print(s.name + " " + s.id);

		}

		for (Address a : l1) {
			System.out.print(+a.pincode + " " + a.colony);

		}
		
		// Without Generics

//		for(Object o:l)*/
//		{
//			if(o instanceof Student)
//			{
//				Student s=(Student)o;
//				System.out.print(s.name+" "+s.id);
//			}
//			if(o instanceof Address)
//			{
//				Address ad=(Address)o;
//				System.out.print(ad.pincode+" "+ad.colony);
//			}

		// }
	}

}
