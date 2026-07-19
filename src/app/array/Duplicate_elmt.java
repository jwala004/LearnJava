package app.array;

public class Duplicate_elmt {

	public static void main(String[] args) {
	int[] a= {1,2,3,4,5,6,7,2,2,3,2,3,1};
	 System.out.println(a.length);
	/*int temp = a[0];
	 for (int i = 1; i < a.length; i++) {

		 if(a[i]==temp) {
			 System.out.println(temp); 
		 }
	}
	}
	}
*/
	for(int i=0;i<a.length;i++)	{
	  for(int j=i+1;j<a.length;j++)
	  {
		  if(a[i]==a[j])
		  {
			  System.out.println(a[i]);
		  }
	  }
	  }
	
	}
}