package app.exception;

public class Finally_Block {

	public static void main(String[] args) {
		try {
			int a[]= {11,11,1,1,1,1};
			System.out.println(a[33]);
			
			
		}catch(NullPointerException | StringIndexOutOfBoundsException| ArrayIndexOutOfBoundsException e) {
			System.out.println("heyyyyyyyyy");
		}
		finally {
			System.out.println("hfbvh");
			System.out.println("hfbvh222");
		}
	}

}
/*
// StringIndexOutOfBoundsException
 String s1="AAAaa";
System.out.println(s1.charAt(12));*/

/*
     	//NullPointerException 
		String s=null;
		System.out.println(s.length());*/

		/*
		  //ArrayIndexOutOfBoundsException 
		  int a[]= {11,11,1,1,1,1};
		System.out.println(a[33]);*/
