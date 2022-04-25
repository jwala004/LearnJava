package company.intrvwqusns.kronoss;

public class StringQ1 {

	public static void main(String[] args) {

		String inputString = "Jwala25M";

		StringQ1.separateString(inputString);

	}

	private static void separateString(String str) {

		System.out.println("Name: " + str.substring(0, 5));

		System.out.println("Age: " + str.substring(5, 7));

		System.out.println("Gender: " + str.substring(7, 8));
	}

}
