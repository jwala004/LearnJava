package java8.functionalinterface;

@FunctionalInterface
public interface IPrintable {

	public abstract void print();
	
	default void scan() {
		System.out.println("Default scanning");
	}
	
	static void scanPdfFile() {
		System.out.println("Scanning pdf file");
	}
}
