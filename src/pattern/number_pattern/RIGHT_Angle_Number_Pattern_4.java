package pattern.number_pattern;

//	1 

//	1 2 1 
//	1 2 3 2 1 
//	1 2 3 4 3 2 1 
//	1 2 3 4 5 4 3 2 1 

public class RIGHT_Angle_Number_Pattern_4 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");

            }
//			for (int k = i; k > 1; k--) {
//
//				System.out.print(k - 1 + " ");
//
//			}

//			OR above loop can be written as,

            for (int k = i - 1; k >= 1; k--) {

                System.out.print(k + " ");

            }

            System.out.println();
        }
    }
}
