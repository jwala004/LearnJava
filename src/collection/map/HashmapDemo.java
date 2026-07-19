package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapDemo {

	public static void main(String[] args) {
		//Map<Emp,Student> m=new LinkedHashMap<Emp,Student>();
		Map<Emp,Student> m=new HashMap<Emp,Student>();
		m.put(new Emp(111,"jwala1","11"),new Student(13,"sonu1","122"));
		m.put(new Emp(112,"jwala2","12"), new Student(14,"sonu2","133"));
		m.put(new Emp(113,"jwala3","13"), new Student(15,"sonu3","144"));
		
		Set s=m.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
		Entry<Emp, Student> mm=(Entry<Emp, Student>) itr.next();
		System.out.println(mm.getKey()+"  "+mm.getValue());// this will also return the same o/p as in the below one
		
		}
	}
}
/*
 System.out.println(mm.getKey());// this will also return the same o/p as in the below one
 Emp ee=mm.getKey();
 System.out.println(ee.EmpId+" "+ee.EmpName+" "+ee.EmpContactNo);*/
