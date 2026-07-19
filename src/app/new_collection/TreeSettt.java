package app.new_collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSettt {

	public static void main(String[] args) {
//		TreeSet<String> names=new TreeSet<String>();
		TreeSet<String> names=new TreeSet<String>();
		names.add("jwala");
		names.add("Arvind");
		names.add("jwala");
		names.add("1111");
		names.add("11113");
		names.add("111133");
		
		//System.out.println("before removal "+names);

		Iterator<String> itr=names.iterator();
		while(itr.hasNext()) {
			//String next=itr.next();
			/*if(next.equals("Arvind")) {
				itr.remove();
			}*/
			System.out.println(" "+itr.next()); 
		}
		//System.out.println("After removal "+names);//it will return all the elements added in reference variable
	}
	}
