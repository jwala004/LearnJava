package java8.naveenautomationlabs.interviewquestions;

public class CompareTwoIntegerNumbers {
//********** Very important interview question
	public static void main(String[] args) {

		Integer num1 = 1000;
		Integer num2 = 1000;

		if (num1 == num2) {
			System.out.println(num1 + " and " + num2 + " are equal.");
		} else {
			System.out.println(num1 + " and " + num2 + " are not equal.");
		}

//		Integer caching: if we will compare two numbers of size between (-128 to 127) then in this case Integer 
//		caching works. A the time of comparison both the numbers gets auto-boxed.

	}

}
