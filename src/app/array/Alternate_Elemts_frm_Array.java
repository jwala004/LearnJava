package app.array;
// Printing Alternate Elements from given Array 
public class Alternate_Elemts_frm_Array {
	public static void main(String[] args) {
		/*int a[]= {10,1,12,3,14,5,6,7,8,9,10};
		for (int i = 0; i < a.length; i++) {
// this logic will show even indices of array alternate wise!
			if(i%2==0) {
		System.out.println(a[i]);	
			}
			
		}*/
		int a1[]= {10,11,12,3,14,5,6,7,8,9,10};
		System.out.println("finding the length of Array :"+a1.length);
		for (int i = 0; i < a1.length; i++) {
// this logic will show even indices of array alternate wise!
//			if(i/2.0==0) { //
			
			/*
			 * int/int=int
			int/float=float
			float/int=float
			
			*/
			
			if(i/2.0==0) {
		System.out.println(a1[i]);	
			}
		}
	}
}
/*
// this logic will show odd indices of array alternate wise!
for (int i = 0; i < a.length; i++) {
if(i%2!=0) {
	System.out.println(a[i]);	
		}
}*/

/*if(i/2==0) {
//System.out.println(a[i]);	
System.out.println(i);	
		
	}*/