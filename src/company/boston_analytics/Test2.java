package company.boston_analytics;

// Geeks for Geeks question ( with my own modification added)

public class Test2 {
	static int i;
	int j;

	// start of static block
	static {
		i = 10;
		System.out.println("static block 1 ");
	}
	
	
	// end of static block
		public static void main(String args[]) {

			// Although we don't have an object of Test, static block is
			// called because i is being accessed in following statement.
			System.out.println(Test2.i);
	
	}
}