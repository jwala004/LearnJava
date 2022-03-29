package array;

public class MissingNumberFromArray {

	public static void main(String[] args) {

		int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10};
		
		int sum1 = 0;
		
		for(int num : arr) {
			
//			if(arr[num + 1] > ) {
//				
//			}
			
			sum1 = sum1 + num;
		}

		System.out.println(sum1);

	}

}
