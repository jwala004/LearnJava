package java8.inbuilt.functionalinterfaces;

public interface MyInterface<T, U, R> {
//	T, and U are method parameters and R denotes the return type
	
	public abstract R printName(T t, U u);

}
