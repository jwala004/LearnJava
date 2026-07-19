package pattern.number_pattern;

//	1
//	12
//	123
//	1234
//	12345

//Method- 1 

public class RIGHT_Angle_Number_Pattern {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j);

//				System.out.print(x+" ");

            }

            System.out.println();
        }
    }
}

// Method- 2 (own)

//public class RIGHT_Angle_Number_Pattern {
//
//	public static void main(String[] args) {
//
//		for (int i = 1; i <= 5; i++) {
//
//			int x = 1;
//			for (int j = 1; j <= i; j++) {
//
//				System.out.print(x);
//
/// /				System.out.print(x+" ");
//
//				x++;
//			}
//
//			System.out.println();
//		}
//	}
//}
