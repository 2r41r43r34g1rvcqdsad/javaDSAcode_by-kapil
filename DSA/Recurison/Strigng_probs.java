package Recurison;

public class Strigng_probs {
    public static void main(String[] args) {
        skip("", "acchddsweesaa"); // removing a char for the given string.
         System.out.println(skip("acchddsweesaa")); // removing the cahr withe the return methond.\
         System.out.println(skip3("A for apple"));
    }

    static void skip(String pro, String up) {
        if (up.isEmpty()) {
            System.out.println(pro);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(pro, up.substring(1));
        } else {
            skip(pro + ch, up.substring(1));
        }
    }

    static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip(up.substring(1));
        } else {
            return ch+ skip( up.substring(1));
        }
    }
    // skip an string in place of the char
    static String skip3(String up) {
        if (up.isEmpty()) {
            return "";
        }
        
        if (up.startsWith("apple")) {
            return skip3(up.substring(5));
        } else {
            return  up.charAt(0)+skip3( up.substring(1));
        }
    }


}
