package app.test;

public class Reverse_String {

	public static void main(String[] args) {

// M-2 to reverse a string
		String s2="jwala";
// converting string into character array by using toCharArray() method
	char[] c2=s2.toCharArray();
	for (int i =c2.length-1; i >= 0 ; i--) {
		System.out.print(c2[i]);	
		
		}
	System.out.println( );	
	System.out.print("Length of the String: "+c2.length);
	}
}


/*
//M-1 to reverse a string
		String s1="jwala";
		char[] c1= {'j','w','a','l','a'};
		for (int i = c1.length-1; i >=0; i--) {
			
		System.out.print(c1[i]);
		}
		System.out.println( );
		System.out.print("Length of the String: "+c1.length);*/