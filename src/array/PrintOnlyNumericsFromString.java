package src.array;

public class PrintOnlyNumericsFromString {

    public static void main(String[] args) {
        String str = "a1b2c3d5e7r7t6r9";

        System.out.print("Only Characters: ");
//        System.out.print("Only Integers: ");
        for (int i = 0; i < str.length(); ++i) {

// If condition logic will help Only print the alphabets
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                System.out.print(str.charAt(i));
            }
// Only number or numerics will be printed
//            else {
//                System.out.print("Only Integers: "+str.charAt(i));
//            }

        }

    }
}
