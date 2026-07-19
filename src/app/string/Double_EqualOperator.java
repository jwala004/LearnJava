package app.string;
// double equal operator is used to do the reference variable comparison!
public class Double_EqualOperator {
	public static void main(String[] args) {
// when we create String class object by using literals the objects are
//created in SCP(string constant pool) area.
		
		String s1="jwala";
		String s2="kumar";
		String s3="jwala";
		String s4="Jwala";
		
		System.out.println(s1==s2);//false
		System.out.println(s1==s3);//true
		System.out.println(s1==s4);//false(J is in caps in s4)
		System.out.println(s2==s3);//false
		
		String s5=new String("jwala");
		String s6=new String("kumar");
		
		System.out.println(s1==s5);//false
		System.out.println(s2==s5);//false
		System.out.println(s1=s6);//kumar
		System.out.println(s2==s6);//false
	}

}
