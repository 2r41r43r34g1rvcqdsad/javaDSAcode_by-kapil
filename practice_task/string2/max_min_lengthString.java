import java.io.BufferedReader;
import java.io.InputStreamReader;

public class max_min_lengthString {
    static void maxminsubstring(String len) {
        String[] arr = len.split(" ");
        int maxlen, minlen;
        maxlen = Integer.MIN_VALUE;
        minlen = Integer.MAX_VALUE;
        String maximum, minimum;
        maximum = minimum = " ";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < minlen) {
                minimum=arr[i] ;
                minlen = arr[i].length();

            }
            if (arr[i].length() > maxlen) {
                maximum = arr[i];
                maxlen = arr[i].length();
            }

        }
        System.out.println("Max length: " + maximum + " min length: " + minimum);
    }

    public static void main(String[] args) {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String len;
        System.out.println("Enter the string : ");
        try {
            len = b.readLine();
        } catch (Exception e) {
            System.out.println("An error occured ");
            return;
        }
        maxminsubstring(len);

    }

}
