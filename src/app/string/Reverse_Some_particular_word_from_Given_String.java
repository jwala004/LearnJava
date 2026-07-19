package app.string;

import java.util.Arrays;

public class Reverse_Some_particular_word_from_Given_String {

	public static void main(String[] args) {

		String s="This is Jwala Kumar.";
		
		String[] split=s.split(" ");
		
		for(int i=0;i<split.length;i++) {
			
			if(split[i].equals("Jwala")) {
				
//				String s1=split[i];
//				
//				StringBuilder stringg= new StringBuilder(s1);
//				
//				String abc=	stringg.reverse().toString();
//				
//				split[i] = abc;
				
				
//				or write the above logic like this,
//				
//				String s1=split[i];
//				
//				split[i] = "alwaj";
				
//				or write the above logic like this,
				
				split[i] = "alwaj";
				
			}
			
		}
		
		for(String sss : split) {
			
			System.out.print(sss+" ");
			
		}
		
		
		String blogName = "how to do in java";
		StringBuilder reverseString = new StringBuilder();
		 
		String[] words = blogName.split(" ");       //step 1
		
//		System.out.println(words.);
		
//		System.out.print(Arrays.toString(words)) ;
		 
		for (String word : words)
		{
//		    String reverseWord = new StringBuilder(word).reverse().toString();      //step 2
//		    reverseString.append(reverseWord + " ");                                //step 3
			
//			System.out.print(word);
//			
//			System.out.print(Arrays.toString(word)) ;
		}
		 
//		System.out.println( reverseString.toString().trim() );      //v
		
	}
}
