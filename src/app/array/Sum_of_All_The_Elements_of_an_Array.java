package app.array;

public class Sum_of_All_The_Elements_of_an_Array {

	public static void main(String[] args) {

		int[] a= {1,2,3,4,5};
		int sum = 0;
		for(int i=0;i<=a.length;i++) {
			
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
