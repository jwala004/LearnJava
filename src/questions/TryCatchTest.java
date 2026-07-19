package questions;

public class TryCatchTest {

    public static void main(String[] args) {

        try {
            tryCatchTestFunction(4, 2);
            System.out.println("try block");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Catch arithmeticException if occurs: " + arithmeticException);
        } finally {
            System.out.println("finally");
        }
    }

    private static void tryCatchTestFunction(int a, int b) {
        int x = 5;
        x += 3.5;
        System.out.println(x);
        a /= b;
        System.out.println(a + " " + b + " " + x);
    }
}
