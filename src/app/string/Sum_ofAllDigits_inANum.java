package app.string;

public class Sum_ofAllDigits_inANum {

	public static void main(String[] args) {
	String s1="12345";
	int count=0;
	for (int i = 0; i <=s1.length(); i++) {
		
		count=count+i;
		
	}
	System.out.println(count);
	}

}
