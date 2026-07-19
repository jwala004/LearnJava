package app.test;
//Remove consonants from a string

// solution
import java.lang.*;
import java.util.Scanner;
import java.io.*;
public class String_Geeks
 {
		public static void main (String[] args)
		 {
		 //
		    Scanner sc=new Scanner(System.in);
		    int T=sc.nextInt();
		    while(T-->0)
		    {
		        String str=sc.next();
		        str+=sc.nextLine();
		        StringBuffer sb=new StringBuffer();
		        int f=0;
		        for(int i=0;i<str.length();i++)
		        {
		        	 Character temp=str.charAt(i);
			            Character temp1=Character.toLowerCase(temp);
			            if(temp==' ')
		            {
		                sb.append(' ');
		            }
		            if(temp1=='a' || temp1=='e' || temp1=='i' || temp1=='o' || temp1=='u')
		            {
		                f=1;
			    sb.append(temp);
			}
			}
			if(f==1)
			{
			System.out.println(sb.toString());
			}
			else
			{
			System.out.println("No Vowel");
			}
			}
			}
			}
/*public class String_Geeks {
public static void main(String[] args) {
		
		String s = "jwala";
		char a;
		
		if ('s' == 'a') {
			System.out.println(" vowel");
		}else {
		System.out.println("const");		
			}
		}
	}
}*/