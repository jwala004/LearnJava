package pattern.number_pattern;

//	1 
//	2 6 
//	3 7 10 
//	4 8 11 13 
//	5 9 12 14 15 

public class INCREASING_ORDER_RIGHT_Angle_Number_Pattern {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            int x = i;

            for (int j = 1; j <= i; j++) {

                System.out.print(x + " ");

                x = x + 5 - j;
            }

            System.out.println();
        }
    }
}
