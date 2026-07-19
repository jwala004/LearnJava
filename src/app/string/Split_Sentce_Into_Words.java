package app.string;

public class Split_Sentce_Into_Words {

	public static void main(String[] args) {
	String s1="I m learning Java";
	
	String[] s2=s1.split(" ");
	for (int i = 0; i < s2.length; i++) {
		
	}
	
	System.out.println(s2);
	for (String string : s2) {
	System.out.println(string);
		
		}
	}
}

//M-2 
/*	
String s1="I m learning Java";
String[] s2=s1.split(" ");
for (int i = 0; i < s2.length; i++) {
	
}
System.out.println(s2);
for (String string : s2) {
System.out.println(string);	
}*/