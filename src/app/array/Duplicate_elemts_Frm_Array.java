package app.array;

public class Duplicate_elemts_Frm_Array {
	public static void main(String[] args) {
		
	int[] a= {1,2,3,4,5,1,2};
	
    for(int i=0;i<a.length;i++) {
    	int temp=a[i];
		
    	if(a[i]==temp)
    	System.out.print(temp+" ");
    	
    }
	}
}