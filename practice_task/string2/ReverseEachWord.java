import java.io.BufferedOutputStream;
import java.io.BufferedReader;

import javax.print.DocFlavor.STRING;

public class ReverseEachWord {
    static String rev(String str) {
        String word = str.split(" ");
        String re = " ";
        for (int i = 0; i < word.length(); i++) {
            StringBuffer buffer = new StringBuffer();
            re += buffer.reverse().toString();
            re = " ";
        }
        return re;

    }

    public static void main(String[] args) {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the comment: ");
        String comment = " ";
        try {
            comment = r.readLine();

        } catch (Exception e) {
            System.out.println("Error occured ");

        }

        String v = rev(comment);
        System.out.println("String before revese: " + comment);
        System.out.println("string after reverse: " + v);

    }

}
