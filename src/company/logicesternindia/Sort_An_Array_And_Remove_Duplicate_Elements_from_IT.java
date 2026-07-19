package company.logicesternindia;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sort_An_Array_And_Remove_Duplicate_Elements_from_IT {

	public static void main(String[] args) {

		int[] a = { 111, 55, 4, 1, 2, 3, 4, 5, 6, 2, 3, 9, 10, 1, 5, 2, 9, 11, 11, 55, 111 };

		Map<Integer, Integer> m = new HashMap<>();

		for (int no : a) {
			Integer ii = m.get(no);

			if (ii == null) {
				m.put(no, 1);
			} else {
				ii = ii + 1;
				m.put(no, ii);
			}
		}

		Set<Map.Entry<Integer, Integer>> ss = m.entrySet();

		for (Map.Entry<Integer, Integer> mm : ss) {

			if (mm.getValue() > 1) {
				System.out.print(mm.getKey() + " ");
			}

		}

	}

}
