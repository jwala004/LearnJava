package app.new_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
//		Collection<String> itc=new ArrayList<String>();//we can also write collection here!
		System.out.println("====== Now Iterating using foreach loop");
		list.add("jwala1");
		list.add("jwala2");
		list.add("jwala3");
		list.add(null);
		list.add("jwala4");
		list.add(null);
		
	System.out.println("======Iterating using Iterator Interface");
		
Iterator<String> itr=list.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
System.out.println("====== Now Iterating using foreach loop");
		for(String ss: list) {
			System.out.println(ss);
		}
	}

}
