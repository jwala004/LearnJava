package app.test;

public class PrintingNs1_10WthutLoop{
// By the concept of recursion
	public static void main(String[] args) {
	
		/*printNumbers(1);*/
		printNumbers(5);
			
		}
		public static void printNumbers(int n) {
			if(n<11) {
				System.out.println(n);
				printNumbers(n+1);
			}
		}

	}

