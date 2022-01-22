package java8.supplierinterface;

import java.util.function.Supplier;

import org.testng.annotations.Test;

public class TestRUnnerSupplierInterface {

	
	private Supplier<Double> supplier = () -> Math.random();
	private Supplier<String> stringSupplier = () -> "Hello Jwala";
	
	@Test
	public void testSupplier() {
		System.out.println(supplier.get());
		System.out.println(stringSupplier.get());
	}

}
