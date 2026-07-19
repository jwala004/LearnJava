package app.exception;

public class First_excptnHandlng_Code {

	public static void main(String[] args) {
/*		
	 Note:- If suppose in case in try block there is possibility that
	  multiple exceptions can occur,in that case only one exception 
	  will be handled! 
	  At a time only one Exception will be handled!
		   The exception which is about to occur at first
		   will be handled first and rest of all be neglected. 	*/
		
		try {
           	System.out.println(10/0);
			int a[]= {1,2,2,2};
			System.out.println(a[10]);
			
			System.out.println("AAAAAAAAAAA");
		}
		catch(ArithmeticException e) {
			System.out.println("AAAAAAAAAAA");
			}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("CCCCC");
		}
		
		
		catch(NullPointerException e) {
		System.out.println("AAAAAAAAAAA");
		}
	}

}

