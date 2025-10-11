package java8.inbuilt.functionalinterfaces;

public interface IPrintable<T> { 
// the interface that we have created is kind of consumer interface that we have in java (in java.util.function package)
//	, interface name doesn't really matter
// T indicates that we will pass any kind of argument and it will accept it. for example, int, string, list, etc.
	
	public abstract void print(T t); // a method which accepts one parameter and returns nothing
	
	
	
	
}
