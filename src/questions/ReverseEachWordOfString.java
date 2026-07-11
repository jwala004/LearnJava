package questions;

public class ReverseEachWordOfString {

    public static void main(String[] args) {
        String str = "Playwright is an automation tool";
//        M1
//        System.out.println(ReverseEachWordOfString.reverseEachWordOfString(str));

//        M2
        System.out.println(ReverseEachWordOfString.reverseEachWordOfString2(str));

    }

    //    M1
    private static String reverseEachWordOfString(String str) {
        String finall = " ";
        String[] stringArr = str.split(" ");

        for (String str11 : stringArr) {
            finall = finall + " " + reverseWord(str11);
        }
        return finall;
    }

    private static String reverseWord(String str22) {
        String finalString = "";
        char[] charArray = str22.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            finalString = finalString + charArray[i];
        }
        return finalString;
    }

    //    M2
    private static String reverseEachWordOfString2(String str) {
        String finalS = "";
        String[] stringArr = str.split(" ");

        for (String str11 : stringArr) {
            String reversedString = "";
            char[] charArray = str11.toCharArray();
            for (int i = charArray.length - 1; i >= 0; i--) {
                reversedString = reversedString + charArray[i];
            }
            finalS = finalS + " " + reversedString;
        }
        return finalS;
    }
}
