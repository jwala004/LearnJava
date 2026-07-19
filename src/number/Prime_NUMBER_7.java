package number;

public class Prime_NUMBER_7 {

	public static void main(String[] args) {

		int num = 8;
		int check = 0;
		for (int i = 2; i < num / 2; i++) {

			if (num % i == 0) {
				check++;
			}
			if (check > 0) {

				if (check > 0) {
					System.out.println(num+" is Not a Prime Number");
					break;
				} else {
					System.out.println(num+" is a Prime Number");
				}
			}
		}
	}
}

//		if(check>0) {
//			System.out.println("Not a Prime Number");
//		}else {
//			System.out.println("Prime Number");
//		}

//else {
//	if(check>0) {
//		System.out.println("Not a Prime Number");
//	}else {
//		System.out.println("Prime Number");
//	}
//}