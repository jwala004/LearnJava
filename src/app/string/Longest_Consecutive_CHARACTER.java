package app.string;

import java.util.Scanner;

// StackOverflow solution

public class Longest_Consecutive_CHARACTER {

	 public static void main(String[] args) {

		 Scanner in = new Scanner(System.in);
		 int n = in.nextInt(), max = in.nextInt();
		 String s = in.next();

		 int left = 0, answer = 0;
		 int[] count = { 0, 0 };
		 for (char c : s.toCharArray()) {
		     count[c - 'a']++;
		     if (Math.min(count[0], count[1]) > max) {
		         count[s.charAt(left) - 'a']--;
		         left++;
		     } else {
		         answer++;
		     }
		 }
		 System.out.println(answer);
		 
		  }
		}
	
//	M-3
	
//	public static void main(String[] args) {
//		
//		String S="abbcccddddee";
//		
//		int  count   = 1;
//		int  max     = 1;
//		char maxChar = S.charAt(1);
//
//		for(int i = 1; i < S.length(); i++) {
//		    count = (S.charAt(i) == S.charAt(i - 1)) ? (count + 1) : 1;
//		    if (count > max) {
//		        max = count;
//		        maxChar = S.charAt(i);
//		    }
//		}
//
//		System.out.println("Longest run: "+max+", for the character "+maxChar);
//		
//	}
//
//}

//M-2

//public class Longest_Consecutive_CHARACTER {
//
//	public static void main(String[] args) {
//		
//		String s="abbcccddddee";
//		
//		char[] array = s.toCharArray();
//				int count = 1;
//				int max = 0;
//				char maxChar = 0;
//				for(int i=1; i<array.length; i++){ // Start from 1 since we want to compare it with the char in index 0
//				    if(array[i]==array[i-1]){
//				        count++;
//				    } else {
//				        if(count>max){  // Record current run length, is it the maximum?
//				            max=count;
//				            maxChar=array[i-1];
//				        }
//				        count = 1; // Reset the count
//				    }
//				}
//				if(count>max){
//				    max=count; // This is to account for the last run
//				    maxChar=array[array.length-1];
//				}
//				System.out.println("Longest run: "+max+", for the character "+maxChar); // Print the maximum.
//		
//	}
//
//}
