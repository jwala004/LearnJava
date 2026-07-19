package pattern;

public class Bigger_Element_Between_3_Elements {

	public static void main(String[] args) {

		int a = 156;
		int b = 321;
		int c = 351;

		if (a > b && a > c) {
			System.out.println(a + " = a is bigger");
		} else if (b > a && b > c) {
			System.out.println(b + " = b is bigger");
		} else {
			System.out.println(c + " = c is bigger");
		}
	}

}
