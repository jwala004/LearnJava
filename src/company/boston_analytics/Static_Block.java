package company.boston_analytics;

public class Static_Block {

	static int num1 = 1;

	static int num2 = 1;

	int num3 = 3;

	static String s = null;

	 {
		num1 = 10;
		num2 = 11;
		s="john";
	}

	public static void main(String[] args) {

		System.out.println(num1 + "  " + num2+" "+s);

	}

}
