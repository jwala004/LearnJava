package app.test;

public class Frequecy_ofCharacters {

	public static void main(String[] args) {
	
	String s1="abbcccddddeeeee";
	String s2="";
	String s3="";
	
	int count = 0;
	for(int i=0;i<s1.length();i++) {
	
	if(s1.charAt(i)=='a'||s1.charAt(i)=='b'||s1.charAt(i)=='c'||s1.charAt(i)=='d'||s1.charAt(i)=='e') {
		count++;
			
	}
	//int c=count;
	s2=s2+s1.charAt(i)+count;
	s3=s2+count;

	}
	int c=count;
	System.out.println("for s2  "+(s2+c));
	System.out.println("for s2  "+s2);
	System.out.println("for s3  "+s3);
	
	}

}
