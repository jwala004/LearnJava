package app.inheritance;

public class Hierarchical {
		 void m1() {
			 System.out.println("m1 method");
		 }
		 void m2() {
			 System.out.println("m2 method");
		 }
	 }
		 class Z1 extends Hierarchical{
			 void m3() {
			 System.out.println("m3 method");
			 }
			 void m4() {
			System.out.println("m4 method");
			 }
			 
		 }
		 class C1 extends Hierarchical{
			 void m5() {
				 System.out.println("m5 method");
			 }
		 }
		class D2 extends Hierarchical{
			void m6() {
				System.out.println("m6 method");
			}
			
			}
