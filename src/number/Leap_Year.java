package number;
// (Nested if-else approach) there is also an approach, by assuming variables as boolean we can also solve this problem
public class Leap_Year {

	public static void main(String[] args) {
		// Checking leap year by taking input from user
//		System.out.println("Enter the year to check It is a leap year or Not: ");
		/*
		 * Scanner sc = new Scanner(System.in); int leapYearCheck = sc.nextInt();
		 */
		for (int leapYearCheck = 1; leapYearCheck <= 2019; leapYearCheck++) {
			if (leapYearCheck % 4 == 0 && (leapYearCheck % 100 != 0 || leapYearCheck % 400 == 0)) {
				System.out.println(leapYearCheck + " is a Leap year");
			} else {
				//System.out.println(leapYearCheck + " is not a Leap year");
			}
		}
	}
}

/*
 * // Checking leap year int leapYearCheck = 1700; if (leapYearCheck % 4 == 0 &&
 * (leapYearCheck % 100 != 0 || leapYearCheck % 400 == 0)) {
 * System.out.println(leapYearCheck + " is a Leap year"); } else {
 * System.out.println(leapYearCheck + " is not a Leap year"); }
 */
/*
 * //diplaying leap years between (1600-2019) for (int i = 1600; i <= 2019; i++)
 * { // if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) { if (i % 4 == 0 && (i %
 * 100 != 0 || i % 400 == 0)) { System.out.println(i +"is a leap year"); }else {
 * 
 * }
 * 
 * }
 */