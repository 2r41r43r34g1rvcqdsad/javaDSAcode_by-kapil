package Recurison;

import java.util.ArrayList;

public class subseq_practice {
    public static void main(String[] args) {
        seq("", "abc");
        System.out.print(listSeq("", "abc"));

    }

    static void seq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        seq(p, up.substring(1));
        seq(p + ch, up.substring(1));

    }

    // for the array list 
    // The coutcome should be in the form of the array list
    static ArrayList<String> listSeq(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);

            return list;
        }char ch = up.charAt(0);
        ArrayList<String> left = listSeq(p, up.substring(1));
        ArrayList<String> right = listSeq(p+ch, up.substring(1));
        right.addAll(left);
        return right;
    }
} 