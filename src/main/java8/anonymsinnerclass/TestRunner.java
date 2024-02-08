package java8.anonymsinnerclass;

public class TestRunner {

	public static void main(String[] args) {

		IPrintable ip = new IPrintable() {

			@Override
			public void print() {
				System.out.println("ANONYMS INNER CLASS");
			}
		};
		ip.print();
	}

}
