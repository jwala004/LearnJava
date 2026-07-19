package pattern.star;

//	  * 
//   * * 
//  * * * 
// * * * * 

public class Pyramid_STAR_PATTERN {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {

            for (int j = 3; j >= i; j--) {

                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {

                System.out.print("* ");
//	if u will not provide space in the above line while printing star then, it will print left handed side star pattern.
            }

            System.out.println();
        }
    }

}
