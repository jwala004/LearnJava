package number;

import java.util.ArrayList;
import java.util.List;

//M-6 to find Prime number(from StackOverflow-(i did modification))

public class Prime_Number_6 {

	public static void main(String[] args) {

		for (int i = 2; i < 100; i++) {
			int count = 1;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count = 0;
					break;
				}

			}
			if (count == 1) {
				System.out.print(i+" ");

			}
		}

	}
}