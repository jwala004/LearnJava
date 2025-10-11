package java8.lambdas;

public class IPrintableImplmt implements IPrintable {

	@Override
	public void print() {
		System.out.println("Conventional way of implementing the interface");
	}

}
