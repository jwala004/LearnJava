package app.new_collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
	LinkedList<String> list= new LinkedList<String>();
	list.add("jwala1");
	list.add("jwala2");
	list.add("jwala3");
	list.add("jwala4");
	list.add("jwala5");
	list.add("jwala6");
	list.addFirst("sonu");
	list.set(5, "Sweety");
	list.remove(6);
	//System.out.println(list.get(5));
	
	//list.addFirst("sonu");
	//list.addLast("MONU");
	//list.add(2, "anu");
	//list.add(3, "tanu");
	//System.out.println(list.element());
//	System.out.println(list.peek());
	//System.out.println(list.peekLast());
//	System.out.println(list.poll());
	//System.out.println(list.pollLast());
	//System.out.println(list.removeFirst());

//System.out.println(list.pop());
	//System.out.println(list.peekFirst());
	//list.peek();
	//list.peekFirst();
	//System.out.println(list.poll());
	//System.out.println(list.getFirst());

	
	Iterator<String> itr=list.iterator();
	while(itr.hasNext()) {
		
		System.out.println(itr.next());
		
	}
	
	//System.out.println(list.getFirst());
	//System.out.println(list.getLast());
	
	}
	}
