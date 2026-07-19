package app.string;

public class Get_first_4_characters_of_String {

	public static void main(String[] args) {

		String s = "jwala";
		
		char[] c= s.toCharArray();
		
//		System.out.print(c.length +" "+s.length());
		
		for(int i=0; i<c.length-1;i++) {
			
			System.out.print(c[i]);
			
//			if(i>4) {
//				break;
//			}
//	or write like below
			
			if(i==4) {
				break;
			}
			
		}
	}
}
