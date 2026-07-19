package number;

import java.util.ArrayList;
import java.util.List;

//M-5 to find Prime number(from StackOverflow-(i did modification))

public class Prime_Number_5 {

	public static void main(String[] args) {

		getPrimeNumbers(1, 100);

	}

	public static List<Integer> getPrimeNumbers(int from, int to) {
		List<Integer> list = new ArrayList<>();
		for (int i = from; i <= to; i++) {
			int count = 0;
			for (int num = i; num >= 1; num--) {
				if (i % num == 0) {
					count++;
				}
			}
			if (count == 2) {
				list.add(i);
			}
		}
		List<Integer> l = list;
		System.out.println(l);
		return l;
	}

}
