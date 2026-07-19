package org.app.abstraction;

public class ImplementationFoCal  implements CalInterface{

	@Override
	public
	int add(int x, int y) {
		
		return x+y;
	}

	@Override
	public
	int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public
	int multi(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public
	int div(int x, int y) {
		// TODO Auto-generated method stub
		return x/y;
		
	}

}
