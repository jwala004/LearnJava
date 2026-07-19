package com.app.practiceCodingQuesns;

import java.io.*;
import java.util.Scanner;
public class Vowel_disp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String/Statement to check");
		String message=scanner.nextLine();
		
		/*
		String vowel="aeiou";
		char[] cs1=vowel.toCharArray();
		
		char[] cs2=message.toCharArray();
		
		for (int i = 0; i < cs1.length; i++) {
			for (int j = 0; j < cs2.length; j++) {
				if(cs1[i]==cs2[j])
					System.out.print(cs1[i]);*/
				
	char[] cs1=message.toCharArray();
	for (char i = 0; i < cs1.length; i++) {

	//char i = 0;
	if(i=='a'||i=='i'||i=='e'||i=='o'||i=='u'){
	System.out.println(i);
	}else {
				
			}
			
		}
	}
	
}
	/*public static void main(String[] args) {
	//char A[]= {'a','b','c','d','e','f','i','o','u','z','x','y'};
		char m;
		for ( m= 'a'; m<'z'; m++) {
		//	String string = args[A];
			
		}
	//	Object a,e,i,o,u;,'i','o','u'
	//	String vowel;
	//char m = 'a';
if(m== 'a'||m=='e'|| m=='i'){
		//if(m== 'a', 'i'){
		//System.out.println(" vowel");
		System.out.println(m);
	}else {
		System.out.println("bull");
	
		}
	}
}
/*
class GFG {
	public static void main (String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=Integer.parseInt(obj.nextLine());
		for(int j=0;j<n;j++){
		String s=obj.nextLine();
		String d="";
		for(int i=0;i<s.length();i++){
		    char ch=s.charAt(i);
		    if(ch==' ' || ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U'){
		        d +=ch;
		    }
		    
		}
		if(d==""){
		    System.out.println("No Vowel");
		}else{
		System.out.println(d);}
	}
	}
}*/