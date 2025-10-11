package array;

public class MissingNumberFromArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 5, 6, 7, 8, 9, 10};
        int sum1 = 0;
        int[] var3 = arr;
        int var4 = arr.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int num = var3[var5];
            sum1 += num;
        }

        System.out.println(sum1);
    }
}
