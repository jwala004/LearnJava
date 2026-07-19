package app.test;

public class Array_ForLoop_Test {

	public static void main(String[] args) {
		
		int[]a= {0,2,4,1,3};
		for (int i = 0; i < a.length; i++) {
		a[i]=a[(a[i]+3)%a.length];
		System.out.println("a["+i+"]"+a[i]);
		
		}
		
	}

}
/*
explanation
// a[i]=a[(a[i]+3)%a.length]
//  a[(a[0]+3)%5]
//  a[(0+3)%5]
//  a[3]= 1

and so on, it continues 
and after 1st time printing, the array will acquire a new value tht will be, 
the new value will acquire after updation of the new value of Array............and so on continues!
*/