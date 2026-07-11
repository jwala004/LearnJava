package java8.naveenautomationlabs.nnumbrss;

public class FibonacciSeries {

    public static void main(String[] args) {
        FibonacciSeries.calculateFibonacci(10);
    }

    /*
     * M1:
     * Using for loop to Display Fibonacci Series
     */
    private static void calculateFibonacci(int n) {
        int firstNum = 0;
        int secondNum = 1;
        for (int i = 0; i <= n; i++) {
            System.out.print(firstNum + " ");
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }

    /*
     * M2:
     * Display Fibonacci series using while loop
     */


}
