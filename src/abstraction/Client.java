package org.app.abstraction;

public class Client extends Cal{

	@Override
	int add(int x, int y) {
		
		return x+y;
	}

	@Override
	int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	int multi(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	int div(int x, int y) {
		// TODO Auto-generated method stub
		return x/y;
		
	}
	
	public static void main(String[] args) {
		Cal cal=new Client();
		System.out.println(cal.add(10, 20));
		System.out.println(cal.sub(50, 20));
		System.out.println(cal.multi(20, 30));
		System.out.println(cal.div(52, 2));
	}

}
