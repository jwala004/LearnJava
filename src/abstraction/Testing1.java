package org.app.abstraction;

public class Testing1 {
public static void main(String[] args) {
	CalInterface cal=new ImplementationFoCal();
	cal.message();
	System.out.println(cal.add(10, 20));
	System.out.println(cal.sub(50, 20));
	System.out.println(cal.multi(20, 30));
	System.out.println(cal.div(52, 2));
}
}
