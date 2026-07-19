package app.exception;

public class Crestech_Exception_Q1 {

//	P-1
	public static void main(String[] args) {
		
		try{
			int i = 10/0;
		}catch(ArithmeticException e1) {
		System.out.print("Arithmetic exception");
		}catch(Exception e1) {
			System.out.print("Exception");
		}
	}
	
//	P-2
//	public static void main(String[] args) {
//		
//		try{
//			int i = 10/0;
//		}catch(Exception e1) {
//		System.out.print("Arithmetic exception");
//		}catch(ArithmeticException e1) {
//			System.out.print("Exception");
//		}
//	}
	
//	o/p -> Unreachable catch block, error will throw

}
