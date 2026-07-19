package app.string;

public class PrntVowel_ConsntDiffrtlly {

	public static void main(String[] args) {
		String s1="jwala";
		String s2="";
		String s3="";
		for(int i=0;i<s1.length();i++) {
		if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
			s2=s2+s1.charAt(i);
		}else {
			s3=s3+s1.charAt(i);
		}
		}
		System.out.println("Given string s1 is:  "+s1);
		System.out.println("vowels in the string s1:  "+s2);
		System.out.println("cnsonants in the string s1:  "+s3);
	}

}
