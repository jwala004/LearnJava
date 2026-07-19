package app.string;

public class String_Example {

	public static void main(String[] args) {
		String s1="ABCgh dvfff";
		String s2="ABCDkdmdm";
		String s3="amnddc";
		String s4="";
		char[] ch=s1.toCharArray();  
		for(int i=0;i<ch.length;i++){  
		System.out.print(ch[i]);  
		}  
		//System.out.println(s1.concat(s2));//ABCghdchjd ABCDkdmdm
		System.out.println(s1.charAt(2));//C
		System.out.println(s1.toLowerCase());//
		System.out.println(s3.toUpperCase());//
		System.out.println(s1.indexOf(13));//g
		System.out.println(s1.indexOf(1, 4));//(B,h)
		System.out.println(s1.lastIndexOf(2));//
		System.out.println(s1.length()); //10
		System.out.println(s4.isEmpty());//true
		System.out.println(s2.hashCode());
		System.out.println(s1.substring(1, 3));
		System.out.println(s1.substring(0, 6));
		System.out.println(s1.substring(2));
		System.out.println(s1.replace(s1, s3));
		//System.out.println(s1.valueOf());
		
		
	}
}
