package questions;

public class SwapNumbers {

    public static void main(String[] args) {
        SwapNumbers.swapNumberUsing3rdVariable();
//        SwapNumbers.swapNumberWithoutUsing3rdVariable();
    }

    private static void swapNumberUsing3rdVariable() {
        int a = 5, b = 10;
        int c;
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        c = b;
        b = a;
        a = c;
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

    private static void swapNumberWithoutUsing3rdVariable() {
        int a = 15, b = 10;
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        a = a + b; // a = a + b; a = 25
        b = a - b; // b = a - b; b = 15
        a = a - b; // a = a - b; a = 10

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

}
