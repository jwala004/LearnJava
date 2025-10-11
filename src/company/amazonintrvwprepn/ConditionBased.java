package company.amazonintrvwprepn;

public class ConditionBased {

	/*
	 * Write a function in any language that will print "AN" if a number is
	 * divisible by 8, "ANIM" if divisible by 16 and "ANIMAL" if divisible by 32
	 */
	public static void main(String[] args) {

		ConditionBased.checkDivisibilty(8);
		ConditionBased.checkDivisibilty(16);
		ConditionBased.checkDivisibilty(32);
		ConditionBased.checkDivisibilty(0);

	}

	private static void checkDivisibilty(int num) {

		if (num <= 0) {
			System.out.println("NONE");
			return;
		}
		if (num % 8 == 0 && num % 16 != 0) {
			System.out.println("AN");
		} else if (num % 16 == 0 && num % 32 != 0) {
			System.out.println("ANIM");
		} else if (num % 32 == 0) {
			System.out.println("ANIMAL");
		}

	}

}
