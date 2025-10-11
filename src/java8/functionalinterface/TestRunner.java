package java8.functionalinterface;

public class TestRunner {

	public static void main(String[] args) {
//		ANONYMS INNER CLASS way of doing it
		IPrintable ip = new IPrintable() {

			@Override
			public void print() {
				System.out.println("ANONYMS INNER CLASS");
			}
		};
		ip.print();
		
//		Lambda style of doing it
		IPrintable ip2 = () -> System.out.println("I am a Lambda expression.");
		ip2.print();
		ip2.scan();
		IPrintable.scanPdfFile();
		
	}

}
