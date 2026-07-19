package pattern.star;

//	* * * * * * * 
//	  * * * * * 
// 	    * * * 
//        * 

public class INVERTED_Pyramid_STAR_PATTERN {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {

            for (int j = 4; j >= i; j--) {

                System.out.print("* ");
            }
            for (int k = 3; k >= i; k--) {

                System.out.print("* ");
            }
            System.out.println();
            for (int l = 1; l <= i; l++) {

                System.out.print("  ");// 2 spaces( give 2 spaces for perfect output)
            }

        }

    }

}
