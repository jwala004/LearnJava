package company.globallogic;

public class PrintOnlyLastNameFromFullName {

	public static void main(String[] args) {

		String str = "Jwala Kumar";

		System.out.println(PrintOnlyLastNameFromFullName.retrunLastName(str));

	}

	private static String retrunLastName(String inputString) {

		String[] strArry = inputString.split(" ");

		String lastName = null;

		for (int i = 0; i < strArry.length; i++) {
//			if (i == 1) {
//				lastName = strArry[i];
//			}

//			or above if condition can be written as like below;
			if (strArry[i].equalsIgnoreCase("kumar")) {
				lastName = strArry[i];
			}

		}

		return lastName;
	}

}
