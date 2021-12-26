package java8.lambdas;

public class TestRunner {

	public static void main(String[] args) {
		
//		Conventional way of doing
		IPrintableImplmt iPrintableImplmt = new IPrintableImplmt();
		iPrintableImplmt.print();
		
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
		
	}

}
