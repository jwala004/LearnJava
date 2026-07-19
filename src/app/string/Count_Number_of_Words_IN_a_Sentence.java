package app.string;

//Method == 1

public class Count_Number_of_Words_IN_a_Sentence {

	public static void main(String[] args) {

		String s="This is Jwala kumar.";
		
		String[] split=s.split(" ");
		
		
		
		
		System.out.println(split.length);
		
	}
}


//Method == 2

//public class Count_Number_of_Words_IN_a_Sentence {
//
//	public static void main(String[] args) {
//
//		String s="This is Jwala kumar.";
//		
//		String[] split=s.split(" ");
//		
//		System.out.println(split.length);
//		
//	}
//}


// Method == 3

//public class Count_Number_of_Words_IN_a_Sentence {
//
//	public static void main(String[] args) {
//
//		String s="This is Jwala kumar.";
//		
//		int j=1;
//		
//		char[] cc=s.toCharArray();
//		
//		for(int i=0;i<cc.length;i++) {
//			
//			if(cc[i]==' ') {
//				j++;
//			}
//		}
//		System.out.println("Total Number of words in sentence or string : " +s+" is == "+j);
//	}
//}
