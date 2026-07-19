package app.new_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingArryList1 {

	public static void main(String[] args) {
		ArrayList<Emp> list=new ArrayList<Emp>();
		Emp e1=new Emp(111,"jwala1","991");
		Emp e3=new Emp(113,"jwala3","993");
		Emp e4=new Emp(114,"jwala4","994");
		Emp e5=new Emp(115,"jwala5","995");
		Emp e6=new Emp(116,"jwala6","996");
		Emp e7=new Emp(117,"jwala7","997");
		Emp e8=new Emp(118,"jwala8","998");
		Emp e9=new Emp(119,"jwala9","999");
		Emp e2=new Emp(119,"jwala9","999");
		
		list.add(e1);
		list.add(e6);
		list.add(e7);
		list.add(e8);
		list.add(e9);
		list.add(e4);
		list.add(e5);
		list.add(e2);
		list.add(e3);
		
		Collections.sort(list);
//Now retrieving the elements using foreach loop
		for(Emp ee: list) {
			System.out.println(ee);
		}
		}
		}
		
/*// M-1 to write for loop(write 'for' and then [Ctrl+space], select collection for loop 
for (Iterator<Emp> iterator = list.iterator(); iterator.hasNext();) {
	Emp emp = (Emp) iterator.next();
	System.out.println(emp);*/

/*// M-2 to write for loop(as in normal way)
		Collections.sort(list);
		Iterator<Emp> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());*/
		