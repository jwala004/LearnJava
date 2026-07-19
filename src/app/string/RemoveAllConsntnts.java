package app.string;

import java.util.Scanner;

public class RemoveAllConsntnts {

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
	//	Scanner sc=new Scanner(System.in);
//		String s1="jwala";
		char[] s1= {'j','w','a','l','a'};
		for (int i = 0; i <s1.length-1; i++) {
		if(s1 [i]=='a'||s1 [i]=='e'||s1 [i]=='i'||s1 [i]=='o'||s1 [i]=='u' ) {
			continue;
			}
		System.out.println("swwswsw:  "+s1);
		}
	}
}
