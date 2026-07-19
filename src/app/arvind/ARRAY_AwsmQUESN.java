package app.arvind;

public class ARRAY_AwsmQUESN {

	public static void main(String[] args) {

//		int[] a= {1,3,4,9,8};
		
		int[] b= {0,2,4,1,3};
		for (int i = 0; i < b.length; i++) {
			b[i]=b[(b[i]+3)%b.length];
			
		System.out.println("b["+i+"]"+b[i]+"Length :"+b.length);
			
		}
	}

}
