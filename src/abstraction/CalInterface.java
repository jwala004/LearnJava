package org.app.abstraction;

/*public abstract */interface CalInterface {
	
		/*public static final*/ String name="CalInterface";
		
		default void message() {
			System.out.println(name);
		}
	
	/*public abstract*/  int add(int x,int y);
	/*public abstract*/  int sub(int x,int y);
	/*public abstract */ int multi(int x,int y);
	/*public abstract*/  int div(int x,int y);
		
}
