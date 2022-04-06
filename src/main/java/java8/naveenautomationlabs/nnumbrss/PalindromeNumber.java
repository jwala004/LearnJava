package java8.naveenautomationlabs.nnumbrss;

public class PalindromeNumber {

	public static void main(String[] args) {
		
//		if number is zero
		System.out.println(isPalindrome(0)); // No
//		if number is 1
		System.out.println(isPalindrome(1)); // No
		
		System.out.println(isPalindrome(121)); // Yes
		
		System.out.println(isPalindrome(3553)); // Yes
		
		System.out.println(isPalindrome(5555)); // Yes
		
		System.out.println(isPalindrome(717)); // Yes

		System.out.println(isPalindrome(101)); // Yes
		
		System.out.println(isPalindrome(1212)); // No
		
		System.out.println(isPalindrome(1200)); // No
		
		System.out.println(isPalindrome(1002)); // No
		
		System.out.println(isPalindrome(2022)); // No
		
		System.out.println(isPalindrome(2000)); // No

	}

	private static boolean isPalindrome(int number) {
		int originalNum = number;
		int palindNum = 0;
		int remainder;
		
		if(number < 0) {
			return false;
		}

		while (number > 0) {
			remainder = number % 10;
			palindNum = palindNum * 10 + remainder;
			number = number / 10;
		}

		System.out.println("palindNum: " + palindNum + " " + "Number or origina number: " + originalNum);

		if (originalNum == palindNum) {
			return true;
		} else {
			return false;
		}

	}
}
