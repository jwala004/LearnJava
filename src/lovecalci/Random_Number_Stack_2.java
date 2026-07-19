package com.java.lovecalci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// M-1
public class Random_Number_Stack_2 {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();
		
		list.add("a1");
		list.add("a2");
		list.add("a3");
		list.add("a4");
		list.add("a5");
		list.add("a6");
		list.add("a7");
		list.add("a8");
		list.add("a9");
		list.add("a1");
		list.add("a10");
		list.add("a11");
		list.add("a12");
		
		
		Random_Number_Stack_2 obj = new Random_Number_Stack_2(); 
		  
        // take a random element from list and print them 
        System.out.println(obj.getRandomElement(list)); 
    } 
  
    // Function select an element base on index  
    // and return an element 
    public String getRandomElement(List<String> list) 
    { 
        Random rand = new Random(); 
        return list.get(rand.nextInt(list.size())); 
    } 
} 
		
//Object[] stringArray = list.toArray(); 

//for(Object ss : stringArray) {
//	
//	System.out.println(ss);
//
//}



//int ii = new Random().nextInt(stringArray.length);
//
//for(int j= 0; j< ii; j++) {
//	
//	System.out.println(stringArray[j]);
//	
//}



//int ii = new Random().nextInt(stringArray.length);
//
//System.out.println(ii);
