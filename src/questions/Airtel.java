package questions;

//coding is good for kids - Kids For Good Is Coding

public class Airtel {

    public static void main(String[] args) {
//        String srr = "coding is good for kids";
//        System.out.println( Airtel.returnFinalResult(srr));
//        String a = reverseAndTransform("coding is good");
        String a = reverseAndTransform2("coding is good");
        System.out.println(a);
    }

    public static String reverseAndTransform(String str) {
        String[] words = str.split(" ");

        StringBuilder output = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            // Convert first character to uppercase and append remaining characters
            output.append(word.substring(0, 1).toUpperCase())
                    .append(word.substring(1));

            // Add space between words
            if (i != 0) {
                output.append(" ");
            }
        }
        return output.toString();
    }

    public static String reverseAndTransform2(String str) {
        String[] words = str.split(" ");
        String output = "";

        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];

            // Capitalize first character and keep remaining characters unchanged
            word = word.substring(0, 1).toUpperCase() + word.substring(1);

            output = output + word;

            // Add space between words
            if (i != 0) {
                output = output + " ";
            }
        }
        return output;
    }
}