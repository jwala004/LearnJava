package app.exception;

public class Printing_Exception {
	public static void main(String[] args) {
		try {
			//System.out.println(10/0);
			int a[]= {1,1,11,1};
			System.out.println(a[13]);
			System.out.println("hello");
		}catch(ArithmeticException|ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			//System.out.println(e.toString());
			//System.out.println(e.getMessage());
			System.out.println("hey");
					
	}
	
	}
}
