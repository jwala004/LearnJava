package com.app.practiceCodingQuesns;

public class StringExamples {
	public static void main(String[] args) {
		
		//Java String toUpperCase() and toLowerCase() method
		String s="Sachin";  
		System.out.println(s.toUpperCase());//SACHIN  
		System.out.println(s.toLowerCase());//sachin  
		System.out.println(s);//Sachin(no change in original)
		
		//Java String trim() method
		
		String s1="  Sachin  ";  
		System.out.println(s1);//  Sachin    
		System.out.println(s1.trim());//Sachin 
		
		//Java String startsWith() and endsWith() method
		String s3="Sachin";  
		System.out.println(s3.startsWith("S"));//true  
	    System.out.println(s3.endsWith("n"));//true
	    
	   // Java String charAt() method
	    String s4="Sachin";  
	    System.out.println(s4.charAt(0));//S  
	    System.out.println(s4.charAt(3));//h  
	}	
}
        