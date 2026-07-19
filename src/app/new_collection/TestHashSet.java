package app.new_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		//HashSet<String> names=new HashSet<String>();
		Set<String> names=new LinkedHashSet<String>();
		//LinkedHashset maintains insertion order!

		names.add("jwala");
		names.add("Arvind");
		names.add("jwala");
		names.add("1111");
		names.add("11113");
		names.add("111133");
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
	}

}
