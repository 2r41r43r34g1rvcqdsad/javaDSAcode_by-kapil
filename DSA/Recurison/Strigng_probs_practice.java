package Recurison;

public class Strigng_probs_practice {
    public static void main(String[] args) {
        skip1("","kjhawwaadwa");
        System.out.println(skip2("","kjhawwaadwa"));
        System.out.println(skip3("I am eating apple fruit"));

    }

    // skping with no return type
    static void skip1(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skip1(p, up.substring(1));
        } else {
            skip1(p + ch, up.substring(1));
        }

    }

    // skipping using return method
    static String skip2(String p, String up) {
        if (up.isEmpty()) {
            return p;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip2(p, up.substring(1));

        } else {
            return ch+ skip2(p , up.substring(1));
        }
    }
    // skipping the whole a picece of the string
     static String skip3( String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("apple")) {                          //startsWith-> Tests if this string starts with the specified prefix.
            return skip3(up.substring(5));

        } else {
            return up.charAt(0)+ skip3( up.substring(1));
        }
    }


}
