package Recurison;

import java.util.ArrayList;

public class permuations {
    public static void main(String[] args) {
        per1("", "abc");
         ArrayList<String> ans = per2("", "abc");
         System.out.println(ans);
        System.out.println(per3("", "abc"));

    }

    static void per1(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String sec = p.substring(i, p.length());
            per1(f + ch + sec, up.substring(1));

        }
    }

    // returnig the array list
    static ArrayList<String> per2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String sec = p.substring(i, p.length());
            String f = p.substring(0, i);

            ans.addAll(per2(f + ch + sec, up.substring(1)));

        }
        return ans;
    }
    // Counting the no of fatorials


    
    static int  per3(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count =0;

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String sec = p.substring(i, p.length());
            count = count  + per3(f + ch + sec, up.substring(1));

        }
        return count;
    }

}
