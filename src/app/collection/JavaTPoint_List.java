package app.collection;
import java.util.*;  

	public class JavaTPoint_List {

	//public class ListExample{  
	public static void main(String args[]){  
	ArrayList<String> al=new ArrayList<String>();  
	al.add("Amit");  
	al.add("Vijay");  
	al.add("Kumar");  
//	al.add(1,"Sachin");  
//	al.add(2,"Sachin");
	
	for(String s:al){  
    System.out.println(s);
//	System.out.println("Before adding indexing :" +s);
	al.add(1,"Sachin");  
	al.add(2,"asss");
	al.add(3,"zzzzasss");
	al.add(4,"qqqqasss");
/*	System.out.println("Element at 2nd position: "+al.get(0));  
	System.out.println("Element at 2nd position: "+al.get(1));  
	System.out.println("Element at 2nd position: "+al.get(2)); 
	System.out.println("Element at 2nd position: "+al.get(3));  
	  */
	for(String ss:al){
	 System.out.println(ss);  
	}  
	}  	}
	}  