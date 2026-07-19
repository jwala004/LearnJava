package pattern.number_pattern;

//	1 
//	2 3 
//	4 5 6 
//	7 8 9 10 
//	11 12 13 14 15 

public class RIGHT_Angle_Number_Pattern_3 {

    public static void main(String[] args) {
        int x = 1;
        for (int i = 1; i <= 5; i++) {

//			for (int j = 1; j <= i; j++, x++) {

//	OR above line can be written as like in below manner

            for (int j = 1; j <= i; j++) {

//				System.out.print(x);

                System.out.print(x + " ");

                x = x + 1;

            }

            System.out.println();
        }
    }
}
