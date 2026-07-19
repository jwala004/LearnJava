package app.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
//ArrayList
public class Arraylist_JavaTpoint {

	/*public static void main(String args[]){  
	ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
	list.add("Ravi");//Adding object in arraylist  
	list.add("Vijay");  
	list.add("Ravi");  
	list.add("Ajay");  
	//Traversing list through Iterator  
	Iterator<String> itr=list.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  									
	}  */
	// retainall() method test
	
	 public static void main(String args[]){
	 
	  ArrayList<String> al=new ArrayList<String>();
	  al.add("Ravi");
	  al.add("Vijay");
	  al.add("Ajay");
	  al.add("akkams");
	  al.add("ksjdncksdnc");
	  al.add("md jd");
	  al.add("sakxmk");
	  //al.retainAll(al);
	/*  
	  ArrayList<String> al2=new ArrayList<String>();
	  al2.add("Ravi");
	  al2.add("Ravwwwwwwi");
	  al2.add("Hanumawwwwwwwwt");
	  al2.add("Hanumat");
      al.retainAll(al2);			*/	
	  
	  // 
	 // List<String> synchronizedlist=Collections.synchronizedList(al);
/*	  al.remove(0);
	  al.remove(2);
	  al.remove(4);*/

	//  System.out.println(synchronizedlist);
	 // System.out.println(al);//it will print all the elements 
	 // System.out.print(al);
	 System.out.println("iterating the elements after retaining the elements of al2...");
	  Iterator<String> itr=al.iterator();
	  while(itr.hasNext()){
	   System.out.println(itr.next());
	  }
	 }
	}
