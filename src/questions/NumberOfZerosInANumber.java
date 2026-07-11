package questions;

public class NumberOfZerosInANumber {

    public static void main(String[] args) {
        int number = 5040600;
        System.out.println("Count of Zeros : " + NumberOfZerosInANumber.countNumberOfZerosInANumber(number));
    }

    private static int countNumberOfZerosInANumber(int num) {
        int counter = 0;
        while (num > 0) {
            if (num % 10 == 0) {
                counter++;
            }
            num = num / 10;
        }
        return counter;
    }
}
