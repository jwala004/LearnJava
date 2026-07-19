package pattern.star;

//	  * 
//   * * 
//  * * * 
// * * * * 

public class Pyramid_STAR_PATTERN2 {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {

            for (int j = 4; j >= i; j--) {

                System.out.print("  ");// 2 spaces( give 2 spaces for perfect output)
            }
            for (int k = 1; k <= i; k++) {

                System.out.print("* ");
            }
            for (int l = 2; l <= i; l++) {

                System.out.print("* ");
            }

            System.out.println();
        }

    }

}
