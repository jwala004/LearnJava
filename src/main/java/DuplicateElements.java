import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {

		String[] stu = { "jwala", "son", "son", "son", "son", "son", "mon", "qqq", "jwala" };

		int count = 1;

		Set<String> set = new HashSet<String>();

		for (String s : stu) {

			if (set.add(s) == false) {
				System.out.println("Duplicate : " + s);
				count++;
				System.out.println("Duplicate : " + s + " was found " + count + " times.");
			}

		}

	}

}
