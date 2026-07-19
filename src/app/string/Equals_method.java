package app.string;

public class Equals_method {

	public static void main(String[] args) {
	
		String s1="jwala";
		String s2="Kumar";
		String s3="jwala";
		String s4="Jwala";
		
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equals(s3));//true
		System.out.println(s1.equals(s4));//false
		System.out.println(s1.equalsIgnoreCase(s4));//true
		
				

	}

}
