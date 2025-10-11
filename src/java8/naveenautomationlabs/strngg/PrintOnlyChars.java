package java8.naveenautomationlabs.strngg;

public class PrintOnlyChars {

    public static void main(String[] args) {

        String ss = "jwa&#a#@$l(a)";

//        char[] cc = ss.toCharArray();
//
//        for (char c : cc){
//            if(c >= 'a' || c <= 'z'){
//                System.out.print(c);
//            }
//        }

        for(int i = 0; i < ss.length(); i++){
            if(ss.charAt(i) >= 'a' && ss.charAt(i) <= 'z'){
                System.out.print(ss.charAt(i));
            }

        }
    }
}
