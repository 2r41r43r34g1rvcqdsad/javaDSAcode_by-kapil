import java.util.Scanner;

public class TwinsStrings {

    static String[] twins(String[] firstString, String[] secondString) {
        int n = firstString.length;
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            result[i] = areTwins(firstString[i], secondString[i]) ? "Yes" : "No";
        }

        return result;
    }

    static boolean areTwins(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if ((i % 2 == 0 && str1.charAt(i) != str2.charAt(i)) ||
                (i % 2 != 0 && str1.charAt(i) == str2.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for firstString array
        int n = scanner.nextInt();
        String[] firstString = new String[n];
        for (int i = 0; i < n; i++) {
            firstString[i] = scanner.next();
        }

        // Input for secondString array
        String[] secondString = new String[n];
        for (int i = 0; i < n; i++) {
            secondString[i] = scanner.next();
        }

        // Calculate and print the result
        String[] result = twins(firstString, secondString);
        for (String res : result) {
            System.out.println(res);
        }

        scanner.close();
    }
}
