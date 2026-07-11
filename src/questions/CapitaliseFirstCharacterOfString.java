package questions;

public class CapitaliseFirstCharacterOfString {

    public static void main(String[] args) {
        String ss = "ai is changing the software technologies very rapidly";
        CapitaliseFirstCharacterOfString.capitaliseFirstCharacterOfString(ss);
    }

    private static void capitaliseFirstCharacterOfString(String str) {

        String[] ss = str.split(" ");
        String finalS = "";
        for (String s1 : ss) {
            finalS = finalS + " " + s1.substring(0, 1).toUpperCase() + s1.substring(1);
//            finalS = " " + s1.substring(0, 1).toUpperCase() + s1.substring(1) + finalS;
//            System.out.println(finalS);
        }
        System.out.print(finalS);
    }

}
