package number;

public class Count_Number_of_Digits_in_an_Integer {

	public static void main(String[] args) {
		int i = 123456;
		int count = 0;
		while (i != 0) {
			i = i / 10;
			count++;
		}
		System.out.println(count);
	}
}
