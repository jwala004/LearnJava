package app.array;
// if u don't initialize any values to array,and
//try to print the values of it.
//The default value/values will be printed!
public class Array_Example2 {
	public static void main(String[] args) {
		int a1[]= {};
		//System.out.println(a1);
		char a2[]= {};
		//System.out.println(a2);
		boolean a3[]= {};
		//System.out.println(a3);
		String s1[]= new String[3];
		//System.out.println(s1);
		for (String string : s1) {
			System.out.println(string);
			
		}
	}

}
