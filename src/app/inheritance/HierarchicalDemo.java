package app.inheritance;

	class HierarchicalDemo {

		void m1() {
			 System.out.println("m1 method");
		 }
		 void m2() {
			 System.out.println("m2 method");
		 }
		}
		 class Z11 extends Hierarchical{
			 void m3() {
			 System.out.println("m3 method");
			 }
			 void m4() {
			System.out.println("m4 method");
			 }
			 
		 }
		 class C11 extends Hierarchical{
			 void m5() {
				 System.out.println("m5 method");
			 }
		 }
		class D22 extends Hierarchical{
			void m6() {
				System.out.println("m6 method");
			}
			public static void main(String[] args) {
	
			D22 d=new D22();
			d.m1();d.m2();d.m6();
			C11 c=new C11();
			c.m1();c.m2();c.m5();
		}
		}