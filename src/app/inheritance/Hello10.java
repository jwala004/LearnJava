package app.inheritance;

 class Multilevel {
	 void m1() {
		 System.out.println("m1 method");
	 }
	 void m2() {
		 System.out.println("m2 method");
	 }
 }
	 class Z extends Multilevel{
		 void m3() {
		 System.out.println("m3 method");
		 }
		 void m4() {
		System.out.println("m4 method");
		 }
		 
	 }
	 class C extends Z{
		 void m5() {
			 System.out.println("m5 method");
		 }
	 }
// if u r declaring any class as public in file/or appln,then
//u must have to save ur file with that specific class name(that one which is declared as public)!  
	 public class Hello10 extends C{
		void m6() {
			System.out.println("m6 method");
		}
	 public static void main(String[] args) {
			Hello10 d=new Hello10();
			d.m1();d.m2();d.m3();d.m4();d.m5();
			d.m6();
		} 
		}
