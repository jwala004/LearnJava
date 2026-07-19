package ashwani;

public class Loop_Challenge {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			
			if(i%3!=0 && i%5!=0 && i%15!=0) {
				
				System.out.println(i);
				
			}else if (i % 3 == 0 && i % 15 != 0) {

//				System.out.println("Number divisble by 3 " + i);
				
				System.out.println("output when Number divisble by 3  "+i+" Ashwini");

			} else if (i % 5 == 0 && i % 15 != 0) {
				
				System.out.println("output when Number divisble by 5  "+i+" Kumar");

//				System.out.println(" Number divisble by 5 " + i);
			} else if (i % 15 == 0 ) {

				System.out.println("output when Number divisble by 15  "+i+" Ashwini Kumar " );
			}
		}
	}
}